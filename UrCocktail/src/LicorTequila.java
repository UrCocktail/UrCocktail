
public class LicorTequila extends Listado {

	LicorTequila() {
		super("TEQUILA", "Estilo mexicano...");
		gbl_panel_int.rowHeights = new int[]{30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
		gbl_panel_int.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_int.setLayout(gbl_panel_int);
		
		//Acapulco
		super.acapulco(1, 1);
		
		//Batanga
		super.batanga(4, 1);
		
		//Border Crossing
		super.bordercrossing(1, 3);
		
		//Florida Sunshine
		super.floridasunshine(4, 3);
		
		//Icebreaker
		super.icebreaker(1, 5);
				
		//Long Island Iced Tea
		super.longislandicedtea(4, 5);
		
		//Margarita
		super.margarita(1, 7);
		
		//Margarita Blue
		super.margaritablue(4, 7);
		
		//Mexicano
		super.mexicano(1, 9);
		
		//Spring Fling
		super.springfling(4, 9);
		
		//Tequila Sunrise
		super.tequilasunrise(1, 11);
		
		//Tequila Sunrise Classic
		super.tequilasunriseclassic(4, 11);
		
		//Viva Villa
		super.vivavilla(1, 13);		
		

	}

}
