
public class LicorGinebra extends Listado{

	LicorGinebra(){
		super("GINEBRA", "Disfruta de su aroma...");
		gbl_panel_int.rowHeights = new int[]{30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
		gbl_panel_int.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_int.setLayout(gbl_panel_int);
		
		//Blue Arrow
		super.bluearrow(1, 1);
		
		//Blue Devil
		super.bluedevil(4, 1);
		
		//City Rickey
		super.cityrickey(1, 3);
		
		//Gimlet
		super.gimlet(4, 3);
		
		//Gin And Sin
		super.ginandsin(1, 5);
		
		//Gin Fizz
		super.ginfizz(4, 5);
				
		//John Collins
		super.johncollins(1, 7);
		
		//Long Island Iced Tea
		super.longislandicedtea(4, 7);
		
		//Monkey Gland
		super.monkeygland(1, 9);
		
		//South Side Fizz
		super.southsidefizz(4, 9);
		
		//White Lady
		super.whitelady(1, 11);
	}
	
}

