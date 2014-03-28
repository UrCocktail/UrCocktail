import javax.swing.*;

public class GinAndSin extends CocktailGenerico {
	

//Rellenar los siguientes campos:
	
//-------------------------------------------------------------------//
/*NOMBRE DE COCTEL*/static String nombreCoctel = "GIN AND SIN";
//-------------------------------------------------------------------//	
/*ARCHIVO DE IMAGEN*/static String nombreImagen = "GinAndSin.png";
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
			
			+"<style=\"text-align: justify;\">1 parte <u>"+ a +"</u>"
			+"<br style=\"text-align: justify;\">1 parte <u>"+ m +"</u>"
			+"<br style=\"text-align: justify;\">1 parte <u>"+ k +"</u>"
			+"<br style=\"text-align: justify;\">0,5 partes <u>"+ j +"</u></span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES DE PREPARACIÓN*/
	static String instruccionesPreparacion = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Introducir hielo en el shaker."
			+"<br><br style=\"text-align: justify;\">Agregar todos los ingredientes."
			+"<br><br style=\"text-align: justify;\">Agitar bien y verter en una copa <u>Martini</u>."
			+"<br><br style=\"text-align: justify;\">(Opcionalmente, en un vaso con hielo).</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES PARA MÁQUINA COCTELERA*/	
	static String instruccionesCoctelera = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Prepare una copa <u>Martini</u> o vaso <u>Old-Fashioned</u> con hielo."
			+"<br><br style=\"text-align: justify;\">Sit&uacute;e el vaso/copa en la bandeja."
			+"<br><br style=\"text-align: justify;\">Pulse para comenzar con la preparaci&oacute;n del c&oacute;ctel.";
	
//--------------------------------------------------------------------------------------------------------//	
/*CIFRADO PARA ARDUINO*/static String stringArduino="a1m1k1jAz";
//--------------------------------------------------------------------------------------------------------//	
	
			
	GinAndSin(){		
		super(nombreCoctel, nombreImagen, listaIngredientes, instruccionesPreparacion, instruccionesCoctelera, stringArduino);
	}
	
}