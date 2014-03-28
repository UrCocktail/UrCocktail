import javax.swing.*;


public class CityRickey extends CocktailGenerico {
	

//Rellenar los siguientes campos:
	
//-------------------------------------------------------------------//
/*NOMBRE DE COCTEL*/static String nombreCoctel = "CITY RICKEY";
//-------------------------------------------------------------------//	
/*ARCHIVO DE IMAGEN*/static String nombreImagen = "CityRickey.png";
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
			
			+"<style=\"text-align: justify;\">3 partes <u>"+ a +"</u>"
			+"<br style=\"text-align: justify;\">2 partes <u>"+ f +"</u>"
			+"<br style=\"text-align: justify;\">4 partes <u>"+ h +"</u>"
			+"<br style=\"text-align: justify;\">1 parte <u>"+ l +"</u>"
			+"<br style=\"text-align: justify;\">4 partes <u>"+ o +"</u>"
			
			+"<p><p span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			+"<style=\"text-align: justify;\">Complemento:"
			
			+"<br style=\"text-align: justify;\">Cu&ntilde;a de Lima y cu&ntilde;a de Naranja</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES DE PREPARACI�N*/
	static String instruccionesPreparacion = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Introducir hielo en un vaso <u>Highball</u>."
			+"<br><br style=\"text-align: justify;\">Agregar todos los ingredientes."
			+"<br><br style=\"text-align: justify;\">Decorar con la cu&ntilde;a de Lima y de Naranja.</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES PARA M�QUINA COCTELERA*/	
	static String instruccionesCoctelera = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Prepare un vaso <u>Collins</u> o <u>Highball</u> con hielo."
			+"<br><br style=\"text-align: justify;\">Sit&uacute;e el vaso en la bandeja."
			+"<br><br style=\"text-align: justify;\">Pulse para comenzar con la preparaci&oacute;n del c&oacute;ctel.";
	
//--------------------------------------------------------------------------------------------------------//	
/*CIFRADO PARA ARDUINO*/static String stringArduino="a3f2h4l1o4z";
//--------------------------------------------------------------------------------------------------------//	
	
			
	CityRickey(){
		super(nombreCoctel, nombreImagen, listaIngredientes, instruccionesPreparacion, instruccionesCoctelera, stringArduino);
	}
	
}








