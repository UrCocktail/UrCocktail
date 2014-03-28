
public class ColorRojo extends Listado {


	String nombre=null;

	public ColorRojo() {
		
		super("C\u00D3CTELES POR COLOR","Rojo \r\n");
		gbl_panel_int.rowHeights = new int[]{30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
		gbl_panel_int.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_int.setLayout(gbl_panel_int);
		
//BOTONES
				
		//Bacardi
		super.bacardi(1,1);
		
		//Bay Breeze		
		super.baybreeze(4,1);
		
		//Cape Cod	
		super.capecod(1,3);

		//City Rickey	
		super.cityrickey(4,3);

		//Cosmopolitan	
		super.cosmopolitan(1,5);
		
		//Cranberry-lime Rum
		super.cranberrylimerum(4,5);
		
		//Gin And Sin		
		super.ginandsin(1,7);

		//Mexicano
		super.mexicano(4,7);
		
		//Pink Rum	
		super.pinkrum(1,9);

		//Sea Breeze	
		super.seabreeze(4,9);
		
		//Splash
		super.splash(1,11);
				
		//Tequila Sunrise Classic	
		super.tequilasunriseclassic(4,11);

	}
}

