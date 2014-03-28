import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CocktailGenerico {


	static String a = "Ginebra";		//Defici�n de cadenas de texto para simplificar la escritura de datos	
	static String b = "Tequila Blanco";
	static String c = "Vodka";
	static String d = "Ron Blanco";
	static String e = "Cura&ccedil;ao Azul";
	static String f = "Triple Sec";
	static String g = "Coca-Cola";
	static String h = "Zumo de Ar&aacute;ndanos";
	static String i = "Zumo de Pomelo";
	static String j = "Granadina";
	static String k = "Zumo de Lim&oacute;n";
	static String l = "Zumo de Lima";
	static String m = "Zumo de Naranja";
	static String n = "Zumo de Pi&ntilde;a";
	static String o = "Soda";
	static String p = "Jarabe de Az&uacute;car";


	JPanel panelBaseCocktailGen = new JPanel();	//Declaraci�n del panel base para Card Layout 

	PanelImagen Ingr =new PanelImagen("fondolista2.png"); 	//Declaraci�n de los distintos paneles del Card Layout
	PanelImagen Prep =new PanelImagen("fondolista2.png");
	PanelImagen Coct =new PanelImagen("fondolista2.png");

	CardLayout cl= new CardLayout();	//Declaraci�n del Card Layout

	JButton btnVolverIngr = new JButton("<html>&#8617;VOLVER</html>");	//Declaraci�n de los botones de "Volver"
	JButton btnVolverPrep = new JButton("<html>&#8617;VOLVER</html>");
	JButton btnVolverCoct = new JButton("<html>&#8617;VOLVER</html>");

	Cursor mano = new Cursor(Cursor.HAND_CURSOR);	//Declaraci�n del cursor en forma de mano

	JLabel flechaIngr = new JLabel("<html>&#10154;</html>");		//Declaraci�n de la flecha (->) que acompa�a al bot�n de panel seleccionado
	JLabel flechaPrep = new JLabel("<html>&#10154;</html>");
	JLabel flechaCoct = new JLabel("<html>&#10154;</html>");

	//Constructor param�trico CocktailGenerico

	public CocktailGenerico(String Coctel,String Imagen,String Ingredientes,String Preparacion,String Coctelera,final String Arduino) {


		panelBaseCocktailGen.setLayout(cl);	//Aplicaci�n del layout al panel base

		panelBaseCocktailGen.add(Ingr, "Ingredientes");	//Agregar el resto de paneles al panel base
		panelBaseCocktailGen.add(Prep, "Preparacion");
		panelBaseCocktailGen.add(Coct, "Coctelera");

		String ingredientes = "<html><u>INGREDIENTES</u></html>";			//Definici�n de las etiquetas para los botones de cambio de panel
		String ingredientes_bold = "<html><u><b>INGREDIENTES</u></b></html>";
		String preparacion = "<html><u>PREPARACI\u00D3N</u></html>";
		String preparacion_bold = "<html><b><u>PREPARACI\u00D3N</u></b></html>";
		String coctelera = "<html><u>COCTELERA</u></html>";
		String coctelera_bold = "<html><b><u>COCTELERA</u></b></html>";


		////PANEL INGREDIENTES

		//**********************************************************************//	
		//Variables

		GridBagLayout GridBagIng = new GridBagLayout();				//Declaraci�n del GridBag Layout

		GridBagConstraints GridBagIng_Tit = new GridBagConstraints();	//Declaraci�n de restricciones para el layout
		GridBagConstraints GridBagIng_Ingr = new GridBagConstraints();
		GridBagConstraints GridBagIng_Prepr = new GridBagConstraints();
		GridBagConstraints GridBagIng_Coctl = new GridBagConstraints();
		GridBagConstraints GridBagIng_Img = new GridBagConstraints();
		GridBagConstraints GridBagIng_ingredientes = new GridBagConstraints();

		JLabel nombreCoctel1 = new JLabel(Coctel);	//Declaraci�n de la etiqueta para el t�tulo
		JLabel imagen1 = new JLabel("");					//y para la imagen

		JButton btnIngredientes1 = new JButton(ingredientes_bold);	//Declaraci�n de botones de cambio de panel
		JButton btnPreparacion1 = new JButton(preparacion);
		JButton btnCoctelera1 = new JButton(coctelera);

		JEditorPane txtIngredientes = new JEditorPane();	//Declaraci�n del cuadro de texto

		//**********************************************************************//	
		//Definici�n del panel

		GridBagIng.columnWidths = new int[]{60, 220, 170, 40, 170, 40, 145, 70, 0};		//Par�metros del GridBag Layout
		GridBagIng.rowHeights = new int[]{20, 70, 0, 45, 270, 20, 0, 0};
		GridBagIng.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		GridBagIng.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};	
		Ingr.setLayout(GridBagIng);

		nombreCoctel1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));	//Definici�n e inserci�n del t�tulo
		GridBagIng_Tit.gridwidth = 7;
		GridBagIng_Tit.anchor = GridBagConstraints.WEST;
		GridBagIng_Tit.fill = GridBagConstraints.VERTICAL;
		GridBagIng_Tit.insets = new Insets(0, 0, 5, 0);
		GridBagIng_Tit.gridx = 1;
		GridBagIng_Tit.gridy = 1;
		Ingr.add(nombreCoctel1, GridBagIng_Tit);

		flechaIngr.setFont(new Font("Calibri", Font.PLAIN, 20));		//Definici�n e inserci�n de la flecha (->) que acompa�a al bot�n seleccionado
		GridBagConstraints gbc_flechaIngr = new GridBagConstraints();
		gbc_flechaIngr.anchor = GridBagConstraints.EAST;
		gbc_flechaIngr.insets = new Insets(0, 0, 5, 5);
		gbc_flechaIngr.gridx = 1;
		gbc_flechaIngr.gridy = 2;
		Ingr.add(flechaIngr, gbc_flechaIngr);

		btnIngredientes1.setFont(new Font("Calibri", Font.PLAIN, 26));		//Definici�n e inserci�n del bot�n "Ingredientes"
		btnIngredientes1.setCursor(mano);
		btnIngredientes1.setFocusPainted(false);
		btnIngredientes1.setBorderPainted(false);
		btnIngredientes1.setOpaque(false);
		btnIngredientes1.setContentAreaFilled(false);
		btnIngredientes1.setBorder(null);
		GridBagIng_Ingr.anchor = GridBagConstraints.SOUTH;
		GridBagIng_Ingr.insets = new Insets(0, 0, 5, 5);
		GridBagIng_Ingr.gridx = 2;
		GridBagIng_Ingr.gridy = 2;
		Ingr.add(btnIngredientes1, GridBagIng_Ingr);

		btnPreparacion1.setFont(new Font("Calibri", Font.PLAIN, 20));		//Definici�n e inserci�n del bot�n "Preparaci�n"
		btnPreparacion1.setCursor(mano);
		btnPreparacion1.setFocusPainted(false);
		btnPreparacion1.setBorderPainted(false);
		btnPreparacion1.setOpaque(false);
		btnPreparacion1.setContentAreaFilled(false);
		btnPreparacion1.setBorder(null);
		GridBagIng_Prepr.anchor = GridBagConstraints.SOUTH;
		GridBagIng_Prepr.insets = new Insets(0, 0, 5, 5);
		GridBagIng_Prepr.gridx = 4;
		GridBagIng_Prepr.gridy = 2;
		Ingr.add(btnPreparacion1, GridBagIng_Prepr);

		btnCoctelera1.setFont(new Font("Calibri", Font.PLAIN, 20));		//Definici�n e inserci�n del bot�n "Coctelera"
		btnCoctelera1.setCursor(mano);
		btnCoctelera1.setFocusPainted(false);
		btnCoctelera1.setBorderPainted(false);
		btnCoctelera1.setOpaque(false);
		btnCoctelera1.setContentAreaFilled(false);
		btnCoctelera1.setBorder(null);
		GridBagIng_Coctl.anchor = GridBagConstraints.SOUTH;
		GridBagIng_Coctl.insets = new Insets(0, 0, 5, 5);
		GridBagIng_Coctl.gridx = 6;
		GridBagIng_Coctl.gridy = 2;
		Ingr.add(btnCoctelera1, GridBagIng_Coctl);

		imagen1.setIcon(new ImageIcon(getClass().getResource(Imagen)));		//Definici�n e inserci�n de la Imagen
		GridBagIng_Img.anchor = GridBagConstraints.NORTH;
		GridBagIng_Img.insets = new Insets(0, 0, 5, 5);
		GridBagIng_Img.gridx = 1;
		GridBagIng_Img.gridy = 4;
		Ingr.add(imagen1, GridBagIng_Img);

		txtIngredientes.setContentType("text/html");		//Definici�n e inserci�n de la lista de ingredientes
		txtIngredientes.setText("<html><b>"+Ingredientes+"</b></html>");
		txtIngredientes.setOpaque(false);
		txtIngredientes.setEditable(false);		
		GridBagIng_ingredientes.gridwidth = 4;
		GridBagIng_ingredientes.insets = new Insets(0, 0, 5, 5);
		GridBagIng_ingredientes.fill = GridBagConstraints.BOTH;
		GridBagIng_ingredientes.gridx = 2;
		GridBagIng_ingredientes.gridy = 4;
		Ingr.add(txtIngredientes, GridBagIng_ingredientes);

		btnVolverIngr.setFont(new Font("Calibri", Font.BOLD, 26));   //Definici�n e inserci�n del bot�n "Volver"
		btnVolverIngr.setCursor(mano);
		btnVolverIngr.setFocusPainted(false);
		btnVolverIngr.setBorderPainted(false);
		btnVolverIngr.setOpaque(false);
		btnVolverIngr.setContentAreaFilled(false);
		btnVolverIngr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelLista");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setBounds(100,100,925,615);
			}
		});
		GridBagConstraints gbc_btnVolverIngr = new GridBagConstraints();
		gbc_btnVolverIngr.anchor = GridBagConstraints.WEST;
		gbc_btnVolverIngr.insets = new Insets(0, 0, 0, 5);
		gbc_btnVolverIngr.gridx = 1;
		gbc_btnVolverIngr.gridy = 6;
		Ingr.add(btnVolverIngr, gbc_btnVolverIngr);


		////PANEL PREPARACI�N

		//**********************************************************************//	
		//Variables
		
		GridBagLayout GridBagPrep = new GridBagLayout();		//Definici�n de GridBag Layout

		GridBagConstraints GridBagPrep_Tit = new GridBagConstraints();	//Definici�n de restricciones para el layout
		GridBagConstraints GridBagPrep_Ing = new GridBagConstraints();
		GridBagConstraints GridBagPrep_Prepr = new GridBagConstraints();
		GridBagConstraints GridBagPrep_Coctl = new GridBagConstraints();
		GridBagConstraints GridBagPrep_Img = new GridBagConstraints();
		GridBagConstraints GridBagPrep_preparacion = new GridBagConstraints();

		JLabel nombreCoctel2 = new JLabel(Coctel);	//Definici�n de la etiqueta para el t�tulo
		JLabel imagen2 = new JLabel("");					//y para la imagen

		JButton btnIngredientes2 = new JButton(ingredientes);	//Definici�n de botones
		JButton btnPreparacion2 = new JButton(preparacion_bold);
		JButton btnCoctelera2 = new JButton(coctelera);

		JEditorPane txtPreparacion = new JEditorPane();		//Definici�n del cuadro de texto


		//**********************************************************************//
		//Definici�n del panel
		
		GridBagPrep.columnWidths = new int[]{60, 220, 170, 40, 170, 40, 145, 70, 0};		//Par�metros del GridBag Layout
		GridBagPrep.rowHeights = new int[]{20, 70, 0, 45, 270, 20, 0, 0};
		GridBagPrep.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		GridBagPrep.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Prep.setLayout(GridBagPrep);


		nombreCoctel2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));	//Definici�n e inserci�n del t�tulo
		GridBagPrep_Tit.gridwidth = 6;
		GridBagPrep_Tit.anchor = GridBagConstraints.WEST;
		GridBagPrep_Tit.fill = GridBagConstraints.VERTICAL;
		GridBagPrep_Tit.insets = new Insets(0, 0, 5, 5);
		GridBagPrep_Tit.gridx = 1;
		GridBagPrep_Tit.gridy = 1;
		Prep.add(nombreCoctel2, GridBagPrep_Tit);

		flechaPrep.setFont(new Font("Calibri", Font.PLAIN, 20));		//Definici�n e inserci�n de la flecha (->) que acompa�a al bot�n seleccionado
		GridBagConstraints gbc_flechaPrep = new GridBagConstraints();
		gbc_flechaPrep.anchor = GridBagConstraints.EAST;
		gbc_flechaPrep.insets = new Insets(0, 0, 5, 5);
		gbc_flechaPrep.gridx = 3;
		gbc_flechaPrep.gridy = 2;
		Prep.add(flechaPrep, gbc_flechaPrep);
		
		btnIngredientes2.setFont(new Font("Calibri", Font.PLAIN, 20));		//Definici�n e inserci�n del bot�n "Ingredientes"
		btnIngredientes2.setCursor(mano);
		btnIngredientes2.setFocusPainted(false);
		btnIngredientes2.setBorderPainted(false);
		btnIngredientes2.setOpaque(false);
		btnIngredientes2.setContentAreaFilled(false);
		btnIngredientes2.setBorder(null);
		GridBagPrep_Ing.anchor = GridBagConstraints.SOUTH;
		GridBagPrep_Ing.insets = new Insets(0, 0, 5, 5);
		GridBagPrep_Ing.gridx = 2;
		GridBagPrep_Ing.gridy = 2;
		Prep.add(btnIngredientes2, GridBagPrep_Ing);

		btnPreparacion2.setFont(new Font("Calibri", Font.PLAIN, 26));		//Definici�n e inserci�n del bot�n "Preparaci�n"
		btnPreparacion2.setCursor(mano);
		btnPreparacion2.setFocusPainted(false);
		btnPreparacion2.setBorderPainted(false);
		btnPreparacion2.setOpaque(false);
		btnPreparacion2.setContentAreaFilled(false);
		btnPreparacion2.setBorder(null);
		GridBagPrep_Prepr.anchor = GridBagConstraints.SOUTH;
		GridBagPrep_Prepr.insets = new Insets(0, 0, 5, 5);
		GridBagPrep_Prepr.gridx = 4;
		GridBagPrep_Prepr.gridy = 2;
		Prep.add(btnPreparacion2, GridBagPrep_Prepr);

		btnCoctelera2.setFont(new Font("Calibri", Font.PLAIN, 20));				//Definici�n e inserci�n del bot�n "Coctelera"
		btnCoctelera2.setCursor(mano);
		btnCoctelera2.setFocusPainted(false);
		btnCoctelera2.setBorderPainted(false);
		btnCoctelera2.setOpaque(false);
		btnCoctelera2.setContentAreaFilled(false);
		btnCoctelera2.setBorder(null);
		GridBagPrep_Coctl.anchor = GridBagConstraints.SOUTH;
		GridBagPrep_Coctl.insets = new Insets(0, 0, 5, 5);
		GridBagPrep_Coctl.gridx = 6;
		GridBagPrep_Coctl.gridy = 2;
		Prep.add(btnCoctelera2, GridBagPrep_Coctl);

		imagen2.setIcon(new ImageIcon(getClass().getResource(Imagen)));		//Definici�n e inserci�n de la Imagen
		GridBagPrep_Img.anchor = GridBagConstraints.NORTH;
		GridBagPrep_Img.insets = new Insets(0, 0, 5, 5);
		GridBagPrep_Img.gridx = 1;
		GridBagPrep_Img.gridy = 4;
		Prep.add(imagen2, GridBagPrep_Img);

		txtPreparacion.setContentType("text/html");		//Definici�n e inserci�n del m�todo de preparaci�n
		txtPreparacion.setText("<html><b>"+Preparacion+"</b></html>");
		txtPreparacion.setOpaque(false);
		txtPreparacion.setEditable(false);
		GridBagPrep_preparacion.gridwidth = 3;
		GridBagPrep_preparacion.insets = new Insets(0, 0, 5, 5);
		GridBagPrep_preparacion.fill = GridBagConstraints.BOTH;
		GridBagPrep_preparacion.gridx = 2;
		GridBagPrep_preparacion.gridy = 4;
		Prep.add(txtPreparacion, GridBagPrep_preparacion);

		btnVolverPrep.setFont(new Font("Calibri", Font.BOLD, 26));   //Definici�n e inserci�n del bot�n "Volver"
		btnVolverPrep.setCursor(mano);
		btnVolverPrep.setOpaque(false);
		btnVolverPrep.setFocusPainted(false);
		btnVolverPrep.setContentAreaFilled(false);
		btnVolverPrep.setBorderPainted(false);
		btnVolverPrep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelLista");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setBounds(100,100,925,615);
			}
		});
		GridBagConstraints gbc_btnVolverPrep = new GridBagConstraints();
		gbc_btnVolverPrep.anchor = GridBagConstraints.WEST;
		gbc_btnVolverPrep.insets = new Insets(0, 0, 0, 5);
		gbc_btnVolverPrep.gridx = 1;
		gbc_btnVolverPrep.gridy = 6;
		Prep.add(btnVolverPrep, gbc_btnVolverPrep);



		////PANEL COCTELERA	

		//**********************************************************************//	
		//Variables
		
		GridBagLayout GridBagCoct = new GridBagLayout();		//Definici�n de GridBag Layout

		GridBagConstraints GridBagCoct_Tit = new GridBagConstraints();	//Definici�n de restricciones para el layout
		GridBagConstraints GridBagCoct_Ing = new GridBagConstraints();
		GridBagConstraints GridBagCoct_Prepr = new GridBagConstraints();
		GridBagConstraints GridBagCoct_Coctl = new GridBagConstraints();
		GridBagConstraints GridBagCoct_Img = new GridBagConstraints();
		GridBagConstraints GridBagCoct_coctelera = new GridBagConstraints();
		GridBagCoct_coctelera.gridwidth = 4;
		GridBagConstraints GridBagCoct_Cont = new GridBagConstraints();
		GridBagCoct_Cont.fill = GridBagConstraints.HORIZONTAL;
		GridBagCoct_Cont.gridwidth = 2;

		JLabel nombreCoctel3 = new JLabel(Coctel);	//Definici�n de la etiqueta para el t�tulo
		JLabel imagen3 = new JLabel("");					//y para la imagen

		JButton btnIngredientes3 = new JButton(ingredientes);	//Definici�n de botones
		JButton btnPreparacion3 = new JButton(preparacion);
		JButton btnCoctelera3 = new JButton(coctelera_bold);
		JButton btnContinuar = new JButton("<html>CONTINUAR&nbsp;&nbsp;&#10144;</html>");

		JEditorPane txtCoctelera = new JEditorPane();

		//**********************************************************************//	

		GridBagCoct.columnWidths = new int[]{60, 220, 170, 40, 170, 40, 145, 70, 0};		//Par�metros del GridBag Layout
		GridBagCoct.rowHeights = new int[]{20, 70, 0, 45, 270, 20, 0, 0};
		GridBagCoct.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		GridBagCoct.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Coct.setLayout(GridBagCoct);

		nombreCoctel3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));	//Definici�n e inserci�n del t�tulo
		GridBagCoct_Tit.gridwidth = 6;
		GridBagCoct_Tit.anchor = GridBagConstraints.WEST;
		GridBagCoct_Tit.fill = GridBagConstraints.VERTICAL;
		GridBagCoct_Tit.insets = new Insets(0, 0, 5, 5);
		GridBagCoct_Tit.gridx = 1;
		GridBagCoct_Tit.gridy = 1;
		Coct.add(nombreCoctel3, GridBagCoct_Tit);
		
		flechaCoct.setFont(new Font("Calibri", Font.PLAIN, 20));		//Definici�n e inserci�n de la flecha (->) que acompa�a al bot�n seleccionado
		GridBagConstraints gbc_flechaCoct = new GridBagConstraints();
		gbc_flechaCoct.anchor = GridBagConstraints.EAST;
		gbc_flechaCoct.insets = new Insets(0, 0, 5, 5);
		gbc_flechaCoct.gridx = 5;
		gbc_flechaCoct.gridy = 2;
		Coct.add(flechaCoct, gbc_flechaCoct);

		btnIngredientes3.setFont(new Font("Calibri", Font.PLAIN, 20));		//Definici�n e inserci�n del bot�n "Ingredientes"
		btnIngredientes3.setCursor(mano);
		btnIngredientes3.setFocusPainted(false);
		btnIngredientes3.setBorderPainted(false);
		btnIngredientes3.setOpaque(false);
		btnIngredientes3.setContentAreaFilled(false);
		btnIngredientes3.setBorder(null);
		GridBagCoct_Ing.anchor = GridBagConstraints.SOUTH;
		GridBagCoct_Ing.insets = new Insets(0, 0, 5, 5);
		GridBagCoct_Ing.gridx = 2;
		GridBagCoct_Ing.gridy = 2;
		Coct.add(btnIngredientes3, GridBagCoct_Ing);

		btnPreparacion3.setFont(new Font("Calibri", Font.PLAIN, 20));		//Definici�n e inserci�n del bot�n "Preparaci�n"
		btnPreparacion3.setCursor(mano);
		btnPreparacion3.setFocusPainted(false);
		btnPreparacion3.setBorderPainted(false);
		btnPreparacion3.setOpaque(false);
		btnPreparacion3.setContentAreaFilled(false);
		btnPreparacion3.setBorder(null);
		GridBagCoct_Prepr.anchor = GridBagConstraints.SOUTH;
		GridBagCoct_Prepr.insets = new Insets(0, 0, 5, 5);
		GridBagCoct_Prepr.gridx = 4;
		GridBagCoct_Prepr.gridy = 2;
		Coct.add(btnPreparacion3, GridBagCoct_Prepr);

		btnCoctelera3.setFont(new Font("Calibri", Font.PLAIN, 26));				//Definici�n e inserci�n del bot�n "Coctelera"
		btnCoctelera3.setCursor(mano);
		btnCoctelera3.setFocusPainted(false);
		btnCoctelera3.setBorderPainted(false);
		btnCoctelera3.setOpaque(false);
		btnCoctelera3.setBorder(null);
		btnCoctelera3.setContentAreaFilled(false);
		GridBagCoct_Coctl.anchor = GridBagConstraints.SOUTH;
		GridBagCoct_Coctl.insets = new Insets(0, 0, 5, 5);
		GridBagCoct_Coctl.gridx = 6;
		GridBagCoct_Coctl.gridy = 2;
		Coct.add(btnCoctelera3, GridBagCoct_Coctl);

		imagen3.setIcon(new ImageIcon(getClass().getResource(Imagen)));		//Definici�n e inserci�n de la Imagen
		GridBagCoct_Img.anchor = GridBagConstraints.NORTH;
		GridBagCoct_Img.insets = new Insets(0, 0, 5, 5);
		GridBagCoct_Img.gridx = 1;
		GridBagCoct_Img.gridy = 4;
		Coct.add(imagen3, GridBagCoct_Img);

		txtCoctelera.setContentType("text/html");		//Definici�n e inserci�n del m�todo de preparaci�n
		txtCoctelera.setSize(340, Integer.MIN_VALUE);
		txtCoctelera.setOpaque(false);
		txtCoctelera.setEditable(false);
		txtCoctelera.setText("<html><b><body style='width: 280px'"+Coctelera+"</b></html>");
		GridBagCoct_coctelera.insets = new Insets(0, 0, 5, 5);
		GridBagCoct_coctelera.fill = GridBagConstraints.BOTH;
		GridBagCoct_coctelera.gridx = 2;
		GridBagCoct_coctelera.gridy = 4;
		Coct.add(txtCoctelera, GridBagCoct_coctelera);

		btnContinuar.setFont(new Font("Calibri", Font.PLAIN, 24));		//Definici�n e inserci�n del m�todo "Continuar"
		btnContinuar.setCursor(mano);
		btnContinuar.setFocusPainted(false);
		btnContinuar.setContentAreaFilled(false);
		btnContinuar.setBorderPainted(false);
		btnContinuar.setOpaque(false);
		GridBagCoct_Cont.anchor = GridBagConstraints.SOUTH;
		GridBagCoct_Cont.insets = new Insets(0, 0, 5, 0);
		GridBagCoct_Cont.gridx = 6;
		GridBagCoct_Cont.gridy = 4;
		Coct.add(btnContinuar, GridBagCoct_Cont);

		btnVolverCoct.setFont(new Font("Calibri", Font.BOLD, 26));   //Definici�n e inserci�n del bot�n "Volver"
		btnVolverCoct.setCursor(mano);
		btnVolverCoct.setOpaque(false);
		btnVolverCoct.setFocusPainted(false);
		btnVolverCoct.setContentAreaFilled(false);
		btnVolverCoct.setBorderPainted(false);
		btnVolverCoct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelLista");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setBounds(100,100,925,615);
			}
		});
		GridBagConstraints gbc_btnVolverCoct = new GridBagConstraints();
		gbc_btnVolverCoct.anchor = GridBagConstraints.WEST;
		gbc_btnVolverCoct.insets = new Insets(0, 0, 0, 5);
		gbc_btnVolverCoct.gridx = 1;
		gbc_btnVolverCoct.gridy = 6;
		Coct.add(btnVolverCoct, gbc_btnVolverCoct);



		//-------------------------------------------------------------------------------------------------------------------------------------------//	
		//Implementacion de los LISTENER

		ActionListener ing = new ActionListener(){public void actionPerformed(ActionEvent e) {cl.show(panelBaseCocktailGen, "Ingredientes");}};	//Mostrar panel de Ingredientes
		ActionListener pre = new ActionListener(){public void actionPerformed(ActionEvent e) {cl.show(panelBaseCocktailGen, "Preparacion");}};		//Mostrar panel de Preparaci�n
		ActionListener coc = new ActionListener(){public void actionPerformed(ActionEvent e) {cl.show(panelBaseCocktailGen, "Coctelera");}};		//Mostrar panel de Coctelera

		//ActionListener ardu = new ActionListener(){public void actionPerformed(ActionEvent e) {Cadena.enviarDatos(Arduino);}};	//Enviar la cadena de informaci�n

		btnIngredientes2.addActionListener(ing);	//Asignaci�n de Listeners a los diferentes botones
		btnPreparacion2.addActionListener(pre);
		btnCoctelera2.addActionListener(coc);
		btnCoctelera1.addActionListener(coc);
		btnPreparacion1.addActionListener(pre);
		btnIngredientes1.addActionListener(ing);
		btnCoctelera3.addActionListener(coc);
		btnPreparacion3.addActionListener(pre);
		btnIngredientes3.addActionListener(ing);

		//btnContinuar.addActionListener(ardu);	
	}			

	//-------------------------------------------------------------------------------------------------------------------------------------------//		


}
