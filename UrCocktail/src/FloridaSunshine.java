import javax.swing.*;


public class FloridaSunshine extends CocktailGenerico {
	

//Rellenar los siguientes campos:
	
//-------------------------------------------------------------------//
/*NOMBRE DE COCTEL*/static String nombreCoctel = "FLORIDA SUNSHINE";
//-------------------------------------------------------------------//	
/*ARCHIVO DE IMAGEN*/static String nombreImagen = "FloridaSunshine.png";
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
			
			+"<style=\"text-align: justify;\">2 partes <u>"+ b +"</u>"
			+"<br style=\"text-align: justify;\">2 partes <u>"+ m +"</u>"
			+"<br style=\"text-align: justify;\">2 partes <u>"+ n +"</u>"
			+"<br style=\"text-align: justify;\">0,5 partes <u>"+ j +"</u>"
			
			+"<p><p span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			+"<style=\"text-align: justify;\">Complemento:"
			
			+"<br style=\"text-align: justify;\">Cereza</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES DE PREPARACI�N*/
	static String instruccionesPreparacion = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Introducir hielo en un vaso <u>Highball</u>."
			+"<br><br style=\"text-align: justify;\">Agregar todos los ingredientes excepto la Granadina y mezclar."
			+"<br><br style=\"text-align: justify;\">A&ntilde;adir la Granadina y decorar con la Cereza.</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES PARA M�QUINA COCTELERA*/	
	static String instruccionesCoctelera = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Prepare un vaso <u>Collins</u> o <u>Highball</u> con hielo."
			+"<br><br style=\"text-align: justify;\">Sit&uacute;e el vaso en la bandeja."
			+"<br><br style=\"text-align: justify;\">Pulse para comenzar con la preparaci&oacute;n del c&oacute;ctel.";
	
//--------------------------------------------------------------------------------------------------------//	
/*CIFRADO PARA ARDUINO*/static String stringArduino="b2m2n2jAz";
//--------------------------------------------------------------------------------------------------------//	
	
			
	FloridaSunshine(){
		super(nombreCoctel, nombreImagen, listaIngredientes, instruccionesPreparacion, instruccionesCoctelera, stringArduino);
	}
	
}








