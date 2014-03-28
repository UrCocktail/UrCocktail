
public class LicorRon extends Listado {

	LicorRon(){
		super("RON", "Navega en el Caribe...");
		gbl_panel_int.rowHeights = new int[]{30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
		gbl_panel_int.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_int.setLayout(gbl_panel_int);
		
		//Acapulco
		super.acapulco(1, 1);
		
		//Bacardi Cocktail
		super.bacardi(4, 1);
		
		//Blue Hawaii
		super.bluehawaii(1, 3);
		
		//Blue Passion
		super.bluepassion(4, 3);
		
		//Caipirinha
		super.caipirinha(1, 5);
				
		//Cool Blue
		super.coolblue(4, 5);
		
		//Cranberry-Lime Rum
		super.cranberrylimerum(1, 7);
		
		//Cuba Libre
		super.cubalibre(4, 7);
		
		//Daiquiri
		super.daiquiri(1, 9);
		
		//Long Island Iced Tea
		super.longislandicedtea(4, 9);
		
		//Mai Tai Light
		super.maitailight(1, 11);
		
		//Mojito
		super.mojito(4, 11);
		
		//Pink Rum
		super.pinkrum(1, 13);		
		
		//Rickey Cocktail
		super.rickeycocktail(4, 13);
		
	}
}
