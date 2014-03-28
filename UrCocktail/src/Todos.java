import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Todos extends Listado {

	
	Todos(){
		super("CÓCTELES", "Todos los cócteles de un vistazo...");
		gbl_panel_int.rowHeights = new int[]{30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
		gbl_panel_int.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_int.setLayout(gbl_panel_int);
		
		btnVolver.removeActionListener(volver);
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelPrincipal");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(980, 635);
			}
		});
	
		
		//Acapulco
		super.acapulco(1, 1);
				
		//Argentine Pomelo
		super.argentinepomelo(4, 1);
		
		//Bacardi Cocktail
		super.bacardi(1, 3);
		
		//Batanga
		super.batanga(4,3);
		
		//Bay Breeze
		super.baybreeze(1, 5);
		
		//Blue Arrow
		super.bluearrow(4, 5);
				
		//Blue Bell
		super.bluebell(1, 7);
		
		//Blue Devil
		super.bluedevil(4, 7);
		
		//Blue Hawaii
		super.bluehawaii(1, 9);
		
		//Blue Passion
		super.bluepassion(4, 9);
		
		//Border Crossing
		super.bordercrossing(1, 11);
		
		//Caipirinha
		super.caipirinha(4, 11);
		
		//Cape Cod
		super.capecod(1, 13);
		
		//City Rickey
		super.cityrickey(4, 13);
		
		//Cool Blue
		super.coolblue(1, 15);
				
		//Cosmopolitan
		super.cosmopolitan(4, 15);
		
		//Cranberry-Lime Rum
		super.cranberrylimerum(1, 17);
		
		//Cuba Libre
		super.cubalibre(4, 17);
		
		//Daiquiri
		super.daiquiri(1, 19);
		
		//Florida Sunshine
		super.floridasunshine(4, 19);
		
		//Gimlet
		super.gimlet(1, 21);
		
		//Gin And Sin
		super.ginandsin(4, 21);
		
		//Gin Fizz
		super.ginfizz(1, 23);
		
		//Greyhound
		super.greyhound(4, 23);
		
		//Hawaiian Vodka
		super.hawaiianvodka(1, 25);
		
		//Icebreaker
		super.icebreaker(4, 25);
		
		//John Collins
		super.johncollins(1, 27);
		
		//Lemon Drop
		super.lemondrop(4, 27);
		
		//Long Island Iced Tea
		super.longislandicedtea(1, 29);
		
		//Mai Tai Light
		super.maitailight(4, 29);
		
		//Margarita
		super.margarita(1, 31);
		
		//Margarita Blue
		super.margaritablue(4, 31);
		
		//Mexicano
		super.mexicano(1, 33);
		
		//Mint Julep Vodka
		super.mintjulepvodka(4, 33);
		
		//Mojito
		super.mojito(1, 35);
		
		//Monkey Gland
		super.monkeygland(4, 35);
		
		//Pink Rum
		super.pinkrum(1, 37);
		
		//Punch on the Pier
		super.punchonthepier(4, 37);
		
		//Rickey Cocktail
		super.rickeycocktail(1, 39);
		
		//Salty Dog
		super.saltydog(4, 39);
		
		//Screwdriver
		super.screwdriver(1, 41);
		
		//Sea Breeze
		super.seabreeze(4, 41);
		
		//South Side Fizz
		super.southsidefizz(1, 43);
		
		//Splash
		super.splash(4, 43);
		
		//Spring Fling
		super.springfling(1, 45);
		
		//Tequila Sunrise
		super.tequilasunrise(4, 45);
		
		//Tequila Sunrise Classic
		super.tequilasunriseclassic(1, 47);
		
		//Tropical Storm
		super.tropicalstorm(4, 47);
		
		//Viva Villa
		super.vivavilla(1, 49);	
		
		//White Lady
		super.whitelady(4, 49);
	}
	
	
	

}
