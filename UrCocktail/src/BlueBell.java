import javax.swing.*;

public class BlueBell extends CocktailGenerico {
	

//Rellenar los siguientes campos:
	
//-------------------------------------------------------------------//
/*NOMBRE DE COCTEL*/static String nombreCoctel = "BLUE BELL";
//-------------------------------------------------------------------//	
/*ARCHIVO DE IMAGEN*/static String nombreImagen = "BlueBell.png";
//-------------------------------------------------------------------//	

/*
	a = Ginebra				
	b = Tequila Blanco
	c = Vodka
	d = Ron Blanco
	
	e = Cura�ao Azul
	f = Triple Sec
	
	g = Coca-Cola
	h = Zumo de Ar�ndanos
	i = Zumo de Pomelo
	j = Granadina
	k = Zumo de Lim�n
	l = Zumo de Lima
	m = Zumo de Naranja
	n = Zumo de Pi�a
	o = Soda
	p = Jarabe de Az�car
*/

/*LISTA DE INGREDIENTES*/
	static String listaIngredientes = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">2 partes <u>"+ c +"</u>"
			+"<br style=\"text-align: justify;\">1 parte <u>"+ e +"</u>"
			+"<br style=\"text-align: justify;\">0,5 partes <u>"+ l +"</u></span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES DE PREPARACI�N*/
	static String instruccionesPreparacion = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Introducir hielo en el shaker."
			+"<br><br style=\"text-align: justify;\">Agregar todos los ingredientes."
			+"<br><br style=\"text-align: justify;\">Agitar y verter en la copa.</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES PARA M�QUINA COCTELERA*/	
	static String instruccionesCoctelera = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Prepare una copa <u>Martini</u> con hielo."
			+"<br><br style=\"text-align: justify;\">Sit\u00FAe la copa en la bandeja."
			+"<br><br style=\"text-align: justify;\">Pulse para comenzar con la preparaci\u00F3n del c\u00F3ctel.";
	
//--------------------------------------------------------------------------------------------------------//	
/*CIFRADO PARA ARDUINO*/static String stringArduino="c2e1lAz";
//--------------------------------------------------------------------------------------------------------//	
	
			
	BlueBell(){		
		super(nombreCoctel, nombreImagen, listaIngredientes, instruccionesPreparacion, instruccionesCoctelera, stringArduino);
	}
	
}