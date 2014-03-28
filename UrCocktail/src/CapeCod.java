import javax.swing.*;

public class CapeCod extends CocktailGenerico {
	

//Rellenar los siguientes campos:
	
//-------------------------------------------------------------------//
/*NOMBRE DE COCTEL*/static String nombreCoctel = "CAPE COD";
//-------------------------------------------------------------------//	
/*ARCHIVO DE IMAGEN*/static String nombreImagen = "CapeCod.png";
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
			
			+"<style=\"text-align: justify;\">2 partes <u>"+ c +"</u>"
			+"<br style=\"text-align: justify;\">3 partes <u>"+ h +"</u>"
			
			
			+"<p><p span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			+"<style=\"text-align: justify;\">Complemento:"
	
			+"<br style=\"text-align: justify;\">Cu&ntilde;a de Lima.</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES DE PREPARACIÓN*/
	static String instruccionesPreparacion = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Introducir hielo en un vaso <u>Old-Fashioned</u>."
			+"<br><br style=\"text-align: justify;\">Agregar todos los ingredientes y remover."
			+"<br><br style=\"text-align: justify;\">Decorar con la cu&ntilde;a de Lima.</span>";
//--------------------------------------------------------------------------------------------------------//	
	
/*INSTRUCCIONES PARA MÁQUINA COCTELERA*/	
	static String instruccionesCoctelera = "<span style=\"font-family: 'calibri'; font-size: 20pt;\">"
			
			+"<style=\"text-align: justify;\">Prepare un vaso <u>Old-Fashioned</u> con hielo."
			+"<br><br style=\"text-align: justify;\">Sit&uacute;e el vaso en la bandeja."
			+"<br><br style=\"text-align: justify;\">Pulse para comenzar con la preparaci&oacute;n del c&oacute;ctel.";
	
//--------------------------------------------------------------------------------------------------------//	
/*CIFRADO PARA ARDUINO*/static String stringArduino="c2h3z";
//--------------------------------------------------------------------------------------------------------//	
	
			
	CapeCod(){		
		super(nombreCoctel, nombreImagen, listaIngredientes, instruccionesPreparacion, instruccionesCoctelera, stringArduino);
	}
	
}