
public class TipoCaribe extends Listado {

	TipoCaribe(){
		super("CARIBEÑO", "Cócteles atrevidos...");
		gbl_panel_int.rowHeights = new int[]{30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
		gbl_panel_int.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_int.setLayout(gbl_panel_int);

		//BOTONES

		//Bacardi
		super.batanga(1,1);

		//Bay Breeze		
		super.bluepassion(4,1);

		//Cape Cod	
		super.bordercrossing(1,3);

		//City Rickey	
		super.caipirinha(4,3);

		//Cosmopolitan	
		super.cubalibre(1,5);

		//Cranberry-lime Rum
		super.daiquiri(4,5);

		//Gin And Sin		
		super.margarita(1,7);

		//Mexicano
		super.margaritablue(4,7);

		//Pink Rum	
		super.mexicano(1,9);

		//Sea Breeze	
		super.mojito(4,9);

		//Splash
		super.southsidefizz(1,11);

		//Tequila Sunrise Classic	
		//super.tequilasunriseclassic(4,11);
	}

}
