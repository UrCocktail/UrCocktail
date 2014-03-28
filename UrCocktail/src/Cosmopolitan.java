import javax.swing.*;

public class Cosmopolitan extends CocktailGenerico {
	

//Rellenar los siguientes campos:
	
//-------------------------------------------------------------------//
/*NOMBRE DE COCTEL*/static String nombreCoctel = "COSMOPOLITAN";
//-------------------------------------------------------------------//	
/*ARCHIVO DE IMAGEN*/static String nombreImagen = "Cosmopolitan.png";
//-------------------------------------------------------------------//	

/*
	a = Ginebra				
	b = Tequila Blanco
	c = Vodka
	d = Ron Blanco
	
	e = Curaçao Azul
	f = Triple Sec
	
	g = Coca-Cola
	h = Zumo de Arándanos
	i = Zumo de Pomelo
	j = Granadina
	k = Zumo de Limón
	l = Zumo de Lima
	m = Zumo de Naranja
	n = Zumo de Piña
	o = Soda
	p = Jarabe de Azúcar
*/

/*LISTA DE INGREDIENTES*/
	static String listaIngredientes = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">4 partes <u>"+ c +"</u>"
			+"<br style=\"text-align: justify;\">1,5 partes <u>"+ f +"</u>"
			+"<br style=\"text-align: justify;\">2 partes <u>"+ h +"</u>"
			+"<br style=\"text-align: justify;\">1,5 partes <u>"+ l +"</u>"
			
			+"<p><p span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			+"<style=\"text-align: justify;\">Complemento:"
			
			+"<br style=\"text-align: justify;\">Rodaja de Lima</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES DE PREPARACIÓN*/
	static String instruccionesPreparacion = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Introducir hielo en el shaker."
			+"<br><br style=\"text-align: justify;\">Agregar todos los ingredientes y agitar."
			+"<br><br style=\"text-align: justify;\">Verter en una copa <u>Martini</u> y decorar con la rodaja de Lima.</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES PARA MÁQUINA COCTELERA*/	
	static String instruccionesCoctelera = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Prepare una copa <u>Martini</u> con hielo."
			+"<br><br style=\"text-align: justify;\">Sit&uacute;e la copa en la bandeja."
			+"<br><br style=\"text-align: justify;\">Pulse para comenzar con la preparaci&oacute;n del c&oacute;ctel.";
	
//--------------------------------------------------------------------------------------------------------//	
/*CIFRADO PARA ARDUINO*/static String stringArduino="c4jBh2lBz";
//--------------------------------------------------------------------------------------------------------//	
	
			
	Cosmopolitan(){		
		super(nombreCoctel, nombreImagen, listaIngredientes, instruccionesPreparacion, instruccionesCoctelera, stringArduino);
	}
	
}