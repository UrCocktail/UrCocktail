import javax.swing.*;

public class HawaiianVodka extends CocktailGenerico {
	

//Rellenar los siguientes campos:
	
//-------------------------------------------------------------------//
/*NOMBRE DE COCTEL*/static String nombreCoctel = "HAWAIIAN VODKA";
//-------------------------------------------------------------------//	
/*ARCHIVO DE IMAGEN*/static String nombreImagen = "HawaiianVodka.png";
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
			
			+"<style=\"text-align: justify;\">3 partes <u>"+ c +"</u>"
			+"<br style=\"text-align: justify;\">1 parte <u>"+ k +"</u>"
			+"<br style=\"text-align: justify;\">1 parte <u>"+ m +"</u>"
			+"<br style=\"text-align: justify;\">1 parte <u>"+ n +"</u>"
			+"<br style=\"text-align: justify;\">0,5 partes <u>"+ j +"</u>"
			
			+"<p><p span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			+"<style=\"text-align: justify;\">Complemento:"
			
			+"<br style=\"text-align: justify;\">Rodaja de Lim&oacute;n</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES DE PREPARACI�N*/
	static String instruccionesPreparacion = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Introducir hielo en el shaker."
			+"<br><br style=\"text-align: justify;\">Agregar todos los ingredientes y agitar."
			+"<br><br style=\"text-align: justify;\">Verter en un vaso con hielo y decorar con la rodaja de Lim&oacute;n.</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES PARA M�QUINA COCTELERA*/	
	static String instruccionesCoctelera = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Prepare un vaso <u>Old-Fashioned</u> con hielo."
			+"<br><br style=\"text-align: justify;\">Sit\u00FAe el vaso en la bandeja."
			+"<br><br style=\"text-align: justify;\">Pulse para comenzar con la preparaci\u00F3n del c\u00F3ctel.";
	
//--------------------------------------------------------------------------------------------------------//	
/*CIFRADO PARA ARDUINO*/static String stringArduino="c3k1m1n1jAz";
//--------------------------------------------------------------------------------------------------------//	
	
			
	HawaiianVodka(){		
		super(nombreCoctel, nombreImagen, listaIngredientes, instruccionesPreparacion, instruccionesCoctelera, stringArduino);
	}
	
}