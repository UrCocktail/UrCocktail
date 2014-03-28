
public class ColorAzul extends Listado {


	String nombre=null;

	public ColorAzul() {

		super("C\u00D3CTELES POR COLOR","Azul \r\n");
		gbl_panel_int.rowHeights = new int[]{30, 0, 30, 0, 30, 0, 30, 0};
		gbl_panel_int.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_int.setLayout(gbl_panel_int);

//BOTONES


		//Blue Arrow
		super.bluearrow(1,1);

		//Blue Bell
		super.bluebell(4,1);

		//Blue Devil	
		super.bluedevil(1,3);

		//Blue Hawaii	
		super.bluehawaii(4,3);

		//Blue Passion	
		super.bluepassion(1,5);

		//Cool Blue
		super.coolblue(4,5);

		//Margarita Blue		
		super.margaritablue(1,7);

	}
}

