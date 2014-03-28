import javax.swing.*;

public class BlueHawaii extends CocktailGenerico {
	

//Rellenar los siguientes campos:
	
//-------------------------------------------------------------------//
/*NOMBRE DE COCTEL*/static String nombreCoctel = "BLUE HAWAII";
//-------------------------------------------------------------------//	
/*ARCHIVO DE IMAGEN*/static String nombreImagen = "BlueHawaii.png";
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
			
			+"<style=\"text-align: justify;\">1,5 partes <u>"+ c +"</u>"
			+"<br style=\"text-align: justify;\">1,5 partes <u>"+ d +"</u>"
			+"<br style=\"text-align: justify;\">1 parte <u>"+ e +"</u>"
			+"<br style=\"text-align: justify;\">6 partes <u>"+ n +"</u>"
			+"<br style=\"text-align: justify;\">1 parte <u>"+ k +"</u>"
			+"<br style=\"text-align: justify;\">1 parte <u>"+ p +"</u></span>"
	
			+"<p><p span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			+"<style=\"text-align: justify;\">Complemento:"
	
			+"<br style=\"text-align: justify;\">Cu&ntilde;a de pi&ntilde;a y cereza.</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES DE PREPARACIÓN*/
	static String instruccionesPreparacion = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Introducir hielo en el shaker."
			+"<br><br style=\"text-align: justify;\">Agregar todos los ingredientes y agitar."
			+"<br><br style=\"text-align: justify;\">Verter en un vaso <u>Hurac&aacute;n</u> con hielo y decorar con la cu&ntilde;a de Pi&ntilde;a y la Cereza.</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES PARA MÁQUINA COCTELERA*/	
	static String instruccionesCoctelera = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Prepare un vaso <u>Hurac&aacute;n</u> con hielo."
			+"<br><br style=\"text-align: justify;\">Sit&uacute;e el vaso en la bandeja."
			+"<br><br style=\"text-align: justify;\">Pulse para comenzar con la preparaci&oacute;n del c&oacute;ctel.";
	
//--------------------------------------------------------------------------------------------------------//	
/*CIFRADO PARA ARDUINO*/static String stringArduino="cBdBe1n6k1p1z";
//--------------------------------------------------------------------------------------------------------//	
	
			
	BlueHawaii(){		
		super(nombreCoctel, nombreImagen, listaIngredientes, instruccionesPreparacion, instruccionesCoctelera, stringArduino);
	}
	
}