
public class LicorVodka extends Listado {

	LicorVodka(){
		super("VODKA", "Clásico en el este...");
		gbl_panel_int.rowHeights = new int[]{30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
		gbl_panel_int.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_int.setLayout(gbl_panel_int);
		
		//Argentine Pomelo
		super.argentinepomelo(1, 1);
		
		//Bay Breeze
		super.baybreeze(4, 1);
		
		//Blue Bell
		super.bluebell(1, 3);
		
		//Blue Hawaii
		super.bluehawaii(4, 3);
		
		//Cape Cod
		super.capecod(1, 5);
				
		//Cosmopolitan
		super.cosmopolitan(4, 5);
		
		//Greyhound
		super.greyhound(1, 7);
		
		//Hawaiian Vodka
		super.hawaiianvodka(4, 7);
		
		//Lemon Drop
		super.lemondrop(1, 9);
		
		//Long Island Iced Tea
		super.longislandicedtea(4, 9);
		
		//Mint Julep Vodka
		super.mintjulepvodka(1, 11);
		
		//Punch on the Pier
		super.punchonthepier(4, 11);		
		
		//Salty Dog
		super.saltydog(1, 13);
		
		//Screwdriver
		super.screwdriver(4, 13);
		
		//Sea Breeze
		super.seabreeze(1, 15);
		
		//Splash
		super.splash(4, 15);
		
		//Tropical Storm
		super.tropicalstorm(1, 17);
	}
	
}
