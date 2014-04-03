#include <Stepper.h>

#define STEPS 200      //Define el numero de pasos en el motor

Stepper stepper(STEPS, 50, 51, 52, 53);  //Crea un objeto de la clase "Stepper", con los pasos y pines vinculados

int valvulas[] = {34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49};

char serialReadString[50];
int stringPosition=-1;

const int unit=10;              //Valor de movimiento unitario del motor
const int fcarrerai=33;
const int valvula0='`';

int iniciallet='`';             //" ` " porque es el caracter que va antes de la letra "a"
int inicialmed='@';             //"@" porque es el caracter que va antes de la letra "A"
int inicialnum='0';             //"0" para que la primera resta salga con valor 1 o superior
int y=0;
int mov=0;                      //Variable vinculada a la multiplicacion de la cantidad de movimiento
int lln=0;
int parte=1000;                 //Variable que equivale a una parte en el llenado de un cocktail

void setup(){
  
  stepper.setSpeed(30);         //Pone la velocidad del motor a 30 RPM
  
    for (int i =0;i<16;i++)
  {
    pinMode(valvulas[i], OUTPUT);
  }
  pinMode(fcarrerai,INPUT);     //Para saber si esta al principio
 
  Serial.begin(9600);
  
  if(digitalRead(fcarrerai)==0) //Si el final de carrera no esta pulsado, se ejecuta volverinicio(). Sistema de seguridad por si se va la luz.
	volverinicio();
  
}

void loop(){
  
  while(Serial.available() > 0){
    
    mov=0;                                   //Inicializamos la multiplicacion del motor cada peticion de cocktail
    lln=0;                                   //Inicializamos las veces de llenado cada peticion de cocktail

    int inByte = Serial.read();              // Lee es siguiente byte
    stringPosition++;                        //Incrementra la posicion en la cadena

      if(inByte=='z'){                       //Cuando llega al caracter "z" ha terminado el cocktail y vuelve al inicio con el vaso. Indico que 'z' comparo con su valor ascii
       serialReadString[stringPosition] = 0; //Pone la posicion actual a null para terminar la cadena
       recorrido();
       volverinicio();
       stringPosition=-1;                    //Pone "stringPosition" a -1
      }

      else  //Si no es el ultimo caracter
        serialReadString[stringPosition] = inByte; //Guarda la informacion en un array
  }
}

void recorrido(){          //Funcion que gestiona el movimiento y llenado del vaso
       int i=0;
       mov=0;
       iniciallet='`';
 
  while (serialReadString[i]!=0){
  
  int comp2=serialReadString[i];
  
      if(comp2<'z'&&comp2>='a'){    //Si el caracter leido esta entre "z" y "a"(ingrediente del cocktail)
        mov=comp2-iniciallet;       //Hace que la variable "mov" tenga el valor del intervalo desde donde esta hasta donde va con la referencia de " ` "
        Serial.print("mov=");
        Serial.println(mov);
        mover(mov);                 //Paso la variable "mov" a la funcion "mover", que se encarga del movimiento del carro
        iniciallet=comp2;           //Igualo el valor de "copm2" a "iniciallet" para que la proxima vez tome como principio del intervalo la ultima posicion en la que estuvo
      }
      else if(comp2<='F'&&comp2>='A'){  //Si el caracter leido esta entra la "F" y la "A"(llenado a medias)
        lln=comp2-inicialmed;           //Hace que la variable "lln" tenga el valor del intervalo de la cantidad que se ha de llenar menos la referencia de "inicialmed"("@")
        Serial.print("llenar=");
        Serial.println(lln);
        llenar(lln);                    //Se le pasa el valor "lln" a la funcion llenar() y se echa "lln" veces esa cantidad
        Serial.println("llenar.med");
        llenarmed();                    //Por ultimo se echa la media parte correspondiente con la funcion llenarmed()
      }
      else{                             //Si no ocurre todo eso significa que se ha leido un caracter correspondiente al llenado
        lln=comp2-inicialnum;           //Hace que la variable "lln" tenga el valor del intervalo de la cantidad que se ha de llenar menos la referencia de "inicialnum"("0")
        Serial.print("llenar=");
        Serial.println(lln);
        llenar(lln);                    //Se le pasa el valor "lln" a la funcion llenar() y se echa "lln" veces esa cantidad
      }
      i++;
   }
}        

void mover(int mult){                   //Funcion que se encarga del movimiento directo del carro donde va el vaso
  
  int giro=mult*unit;                   //La variable "giro" es igual a la variable "mult"(="mov") por un valor unitario POR DETERMINAR
                                        //"unit" son los pasos para recorrer un intervalo unitario
   stepper.step(giro);
}

void volverinicio(){                    //Funcion que se encarga de hacer volvar al carro hasta tocar el final de carrera
  
  while(digitalRead(fcarrerai)==0){     //Mientras que el final de carrera no este pulsado, que el carro se siga moviendo
    stepper.step(-1);
  }
  iniciallet='`';
}

void llenar(int unid){                       //Funcion que se encarga del llenado directo del vaso
  
  delay(500);                                  //33 = pin anterior a la primera válvula
  digitalWrite(iniciallet-valvula0+33,HIGH);  //Cada vez que se ejecuta la funcon "llenar", iniciallet tiene el valor de la ultima posicion a la que se movio el carro, por tanto, 
                                             //restandolo con un valor constante siempre como " ` ", tenemos que valvula debe actuar
  delay(unid*parte);                         //Al igual que el "mult", "unid" es el numero de unidades de tiempo a la que corresponde una parte en el cocktail
  digitalWrite(iniciallet-valvula0+33,LOW);
  
  }

void llenarmed(){                            //Funcion que se encarga del llenado de media parte unicamente
  digitalWrite(iniciallet-valvula0+33,HIGH);
  delay(500);                                //500 es el tiempo correspondiente al llenado de media parte (POR DETERMINAR)
  digitalWrite(iniciallet-valvula0+33,LOW);
  delay(500);
}
