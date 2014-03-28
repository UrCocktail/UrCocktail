
public class ColorCola extends Listado {


	String nombre=null;

	public ColorCola() {

		super("C\u00D3CTELES POR COLOR","Cola \r\n");
		gbl_panel_int.rowHeights = new int[]{30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
		gbl_panel_int.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_int.setLayout(gbl_panel_int);
	
		
//BOTONES
		
		//Batanga
		super.batanga(1,1);
		
		//Border Crossing
		super.bordercrossing(4,1);

		//Cuba Libre	
		super.cubalibre(1,3);

		//Long Island Iced Tea	
		super.longislandicedtea(4,3);


	}

}

