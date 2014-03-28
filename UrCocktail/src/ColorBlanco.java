
public class ColorBlanco extends Listado {


	String nombre=null;

	public ColorBlanco() {

		super("C\u00D3CTELES POR COLOR","Blanco \r\n");
		gbl_panel_int.rowHeights = new int[]{30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
		gbl_panel_int.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_int.setLayout(gbl_panel_int);
	
//BOTONES
		
		//Caipirinha
		super.caipirinha(1,1);

		//Daiquiri
		super.daiquiri(4,1);

		//Gimlet
		super.gimlet(1,3);
		
		//Gin Fizz	
		super.ginfizz(4,3);

		//John Collins	
		super.johncollins(1,5);

		//Lemon Drop
		super.lemondrop(4,5);

		//Margarita
		super.margarita(1,7);

		//Mint Julep Vodka
		super.mintjulepvodka(4,7);

		//Mojito	
		super.mojito(1,9);
		
		//Rickey cocktail
		super.rickeycocktail(4,9);

		//South Side Fizz	
		super.southsidefizz(1,11);
		
		//Spring Fling	
		super.springfling(4, 11);
		
		//Viva Villa
		super.vivavilla(1,13);
		
		//White Lady
		super.whitelady(4,13);


	}
}

