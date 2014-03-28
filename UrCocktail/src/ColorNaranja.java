
public class ColorNaranja extends Listado {


	String nombre=null;

	public ColorNaranja() {

		super("C\u00D3CTELES POR COLOR","Naranja \r\n");
		gbl_panel_int.rowHeights = new int[]{30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
		gbl_panel_int.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_int.setLayout(gbl_panel_int);

//BOTONES

		//Acapulco
		super.acapulco(1,1);

		//Argentine Pomelo
		super.argentinepomelo(4,1);

		//Florida Sunshine	
		super.floridasunshine(1,3);

		//Greyhound
		super.greyhound(4,3);

		//Hawaiian Vodka
		super.hawaiianvodka(1,5);

		//Icebreaker
		super.icebreaker(4,5);

		//Mai Tai Light		
		super.maitailight(1,7);

		//Monkey Gland
		super.monkeygland(4,7);

		//Punch on the Pier	
		super.punchonthepier(1,9);

		//Salty Dog
		super.saltydog(4,9);

		//Screwdriver	
		super.screwdriver(1,11);

		//Tequila Sunrise	
		super.tequilasunrise(4,11);

		//Tropical Storm
		super.tropicalstorm(1,13);
	}

}

