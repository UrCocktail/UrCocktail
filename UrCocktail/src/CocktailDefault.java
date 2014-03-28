import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class CocktailDefault extends JFrame {



	//Defición de cadenas de texto para simplificar la escritura de datos	
	static String a = "Ginebra";
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



	//Constructor clase CocktailGenerico
	//----------------------------------	
	public CocktailDefault() {


		String nombreCoctel = "TITULO";	//Asignacion de variables al constructor
		String nombreImagen = "";
		String listaIgredientes = "Ingredientes";
		String instruccionesPreparacion = "Preparacion";
		String instruccionesCoctelera = "Coctelera";
		//-------------------------------------------------//

		setResizable(false);							//La ventana no se puede redimensionar
		Cursor mano = new Cursor(Cursor.HAND_CURSOR);	//Definicion del cursor en forma de mano

		final JPanel panelBase = new JPanel();	//Definicion del panelBasse 
		final CardLayout cl= new CardLayout();	//en el que se inserta un Card Layout
		JPanel Ingr = new JPanel();	//Definicion de los distintos paneles del Card Layout
		JPanel Prep = new JPanel();
		JPanel Coct = new JPanel();

		//Propiedades de la ventana
		setTitle(nombreCoctel);		//Titulo		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Cierre
		setBounds(100, 100, 925, 550);	//Tamaño
		setContentPane(panelBase);	//Panel base

		panelBase.setLayout(cl);	//Aplicar el layout al panel

		panelBase.add(Ingr, "Ingredientes");	//Agregar todor los paneles al panel base
		panelBase.add(Prep, "Preparacion");
		panelBase.add(Coct, "Coctelera");

		Ingr.setBackground(Color.WHITE);	//Color de los paneles
		Prep.setBackground(Color.WHITE);
		Coct.setBackground(Color.WHITE);


		String ingredientes = "<html><u>INGREDIENTES</u></html>";			//Definicion de las etiquetas para los botones
		String ingredientes_neg = "<html><u><b>INGREDIENTES</u></b></html>";
		String preparacion = "<html><u>PREPARACI\u00D3N</u></html>";
		String preparacion_neg = "<html><b><u>PREPARACI\u00D3N</u></b></html>";
		String coctelera = "<html><u>COCTELERA</u></html>";
		String coctelera_neg = "<html><b><u>COCTELERA</u></b></html>";


		//Panel INGREDIENTES

		//**********************************************************************//	
		GridBagLayout GridBagIng = new GridBagLayout();				//Definicion de GridBag Layout

		GridBagConstraints GridBagIng_Tit = new GridBagConstraints();	//Definicion de restricciones para el layout
		GridBagConstraints GridBagIng_Ingr = new GridBagConstraints();
		GridBagConstraints GridBagIng_Prepr = new GridBagConstraints();
		GridBagConstraints GridBagIng_Coctl = new GridBagConstraints();
		GridBagConstraints GridBagIng_Img = new GridBagConstraints();
		GridBagConstraints GridBagIng_ingredientes = new GridBagConstraints();

		JLabel nombreCoctel1 = new JLabel(nombreCoctel);	//Definicion de JLabel para el titulo
		JLabel imagen1 = new JLabel("");					//y para la imagen

		JButton btnIngredientes1 = new JButton(ingredientes_neg);	//Definicion de botones
		JButton btnPreparacion1 = new JButton(preparacion);
		JButton btnCoctelera1 = new JButton(coctelera);

		JEditorPane txtIngredientes = new JEditorPane();	//Definicion del cuadro de texto

		//**********************************************************************//	

		GridBagIng.columnWidths = new int[]{60, 220, 170, 40, 170, 40, 145, 0, 0};
		GridBagIng.rowHeights = new int[]{20, 70, 0, 45, 250, 25, 0};
		GridBagIng.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		GridBagIng.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};	//Preparacion del panel
		Ingr.setLayout(GridBagIng);


		nombreCoctel1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		GridBagIng_Tit.gridwidth = 6;
		GridBagIng_Tit.anchor = GridBagConstraints.WEST;
		GridBagIng_Tit.fill = GridBagConstraints.VERTICAL;
		GridBagIng_Tit.insets = new Insets(0, 0, 5, 5);
		GridBagIng_Tit.gridx = 1;
		GridBagIng_Tit.gridy = 1;


		Ingr.add(nombreCoctel1, GridBagIng_Tit);

		btnIngredientes1.setFont(new Font("Calibri", Font.PLAIN, 26));
		btnIngredientes1.setCursor(mano);
		btnIngredientes1.setFocusPainted(false);
		btnIngredientes1.setBorder(null);
		btnIngredientes1.setBorderPainted(false);
		btnIngredientes1.setOpaque(false);
		btnIngredientes1.setBackground(Color.WHITE);
		btnIngredientes1.setContentAreaFilled(false);

		GridBagIng_Ingr.anchor = GridBagConstraints.SOUTH;
		GridBagIng_Ingr.insets = new Insets(0, 0, 5, 5);
		GridBagIng_Ingr.gridx = 2;
		GridBagIng_Ingr.gridy = 2;


		Ingr.add(btnIngredientes1, GridBagIng_Ingr);

		btnPreparacion1.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnPreparacion1.setCursor(mano);
		btnPreparacion1.setFocusPainted(false);
		btnPreparacion1.setBorder(null);
		btnPreparacion1.setBorderPainted(false);
		btnPreparacion1.setOpaque(false);
		btnPreparacion1.setBackground(Color.WHITE);
		btnPreparacion1.setContentAreaFilled(false);

		GridBagIng_Prepr.anchor = GridBagConstraints.SOUTH;
		GridBagIng_Prepr.insets = new Insets(0, 0, 5, 5);
		GridBagIng_Prepr.gridx = 4;
		GridBagIng_Prepr.gridy = 2;


		Ingr.add(btnPreparacion1, GridBagIng_Prepr);


		btnCoctelera1.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnCoctelera1.setCursor(mano);
		btnCoctelera1.setFocusPainted(false);
		btnCoctelera1.setBorder(null);
		btnCoctelera1.setBorderPainted(false);
		btnCoctelera1.setOpaque(false);
		btnCoctelera1.setBackground(Color.WHITE);
		btnCoctelera1.setContentAreaFilled(false);

		GridBagIng_Coctl.anchor = GridBagConstraints.SOUTH;
		GridBagIng_Coctl.insets = new Insets(0, 0, 5, 5);
		GridBagIng_Coctl.gridx = 6;
		GridBagIng_Coctl.gridy = 2;

		Ingr.add(btnCoctelera1, GridBagIng_Coctl);

		imagen1.setIcon(new ImageIcon(getClass().getResource(nombreImagen)));
		GridBagIng_Img.anchor = GridBagConstraints.NORTH;
		GridBagIng_Img.insets = new Insets(0, 0, 5, 5);
		GridBagIng_Img.gridx = 1;
		GridBagIng_Img.gridy = 4;

		Ingr.add(imagen1, GridBagIng_Img);

		GridBagIng_ingredientes.gridwidth = 4;
		GridBagIng_ingredientes.insets = new Insets(0, 0, 5, 5);
		GridBagIng_ingredientes.fill = GridBagConstraints.BOTH;
		GridBagIng_ingredientes.gridx = 2;
		GridBagIng_ingredientes.gridy = 4;

		txtIngredientes.setContentType("text/html");
		txtIngredientes.setText(listaIgredientes);
		Ingr.add(txtIngredientes, GridBagIng_ingredientes); //Añadir texto



		//Panel PREPARACION

		//**********************************************************************//	
		GridBagLayout GridBagPrep = new GridBagLayout();		//Definicion de GridBag Layout

		GridBagConstraints GridBagPrep_Tit = new GridBagConstraints();	//Definicion de restricciones para el layout
		GridBagConstraints GridBagPrep_Ing = new GridBagConstraints();
		GridBagConstraints GridBagPrep_Prepr = new GridBagConstraints();
		GridBagConstraints GridBagPrep_Coctl = new GridBagConstraints();
		GridBagConstraints GridBagPrep_Img = new GridBagConstraints();
		GridBagConstraints GridBagPrep_preparacion = new GridBagConstraints();

		JLabel nombreCoctel2 = new JLabel(nombreCoctel);	//Definicion de JLabel para el titulo
		JLabel imagen2 = new JLabel("");					//y para la imagen

		JButton btnIngredientes2 = new JButton(ingredientes);	//Definicion de botones
		JButton btnPreparacion2 = new JButton(preparacion_neg);
		JButton btnCoctelera2 = new JButton(coctelera);

		JEditorPane txtPreparacion = new JEditorPane();		//Definicion del cuadro de texto

		//**********************************************************************//

		GridBagPrep.columnWidths = new int[]{60, 220, 170, 40, 170, 40, 145, 0, 0};
		GridBagPrep.rowHeights = new int[]{20, 70, 0, 45, 250, 25, 0};
		GridBagPrep.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		GridBagPrep.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};	//Preparacion del panel
		Prep.setLayout(GridBagPrep);


		nombreCoctel2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		GridBagPrep_Tit.gridwidth = 6;
		GridBagPrep_Tit.anchor = GridBagConstraints.WEST;
		GridBagPrep_Tit.fill = GridBagConstraints.VERTICAL;
		GridBagPrep_Tit.insets = new Insets(0, 0, 5, 5);
		GridBagPrep_Tit.gridx = 1;
		GridBagPrep_Tit.gridy = 1;

		Prep.add(nombreCoctel2, GridBagPrep_Tit);

		btnIngredientes2.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnIngredientes2.setCursor(mano);
		btnIngredientes2.setFocusPainted(false);
		btnIngredientes2.setBorder(null);
		btnIngredientes2.setBorderPainted(false);
		btnIngredientes2.setOpaque(false);
		btnIngredientes2.setBackground(Color.WHITE);
		btnIngredientes2.setContentAreaFilled(false);

		GridBagPrep_Ing.anchor = GridBagConstraints.SOUTH;
		GridBagPrep_Ing.insets = new Insets(0, 0, 5, 5);
		GridBagPrep_Ing.gridx = 2;
		GridBagPrep_Ing.gridy = 2;


		Prep.add(btnIngredientes2, GridBagPrep_Ing);


		btnPreparacion2.setFont(new Font("Calibri", Font.PLAIN, 26));
		btnPreparacion2.setCursor(mano);
		btnPreparacion2.setFocusPainted(false);
		btnPreparacion2.setBorder(null);
		btnPreparacion2.setBorderPainted(false);
		btnPreparacion2.setOpaque(false);
		btnPreparacion2.setBackground(Color.WHITE);
		btnPreparacion2.setContentAreaFilled(false);

		GridBagPrep_Prepr.anchor = GridBagConstraints.SOUTH;
		GridBagPrep_Prepr.insets = new Insets(0, 0, 5, 5);
		GridBagPrep_Prepr.gridx = 4;
		GridBagPrep_Prepr.gridy = 2;


		Prep.add(btnPreparacion2, GridBagPrep_Prepr);

		btnCoctelera2.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnCoctelera2.setCursor(mano);
		btnCoctelera2.setFocusPainted(false);
		btnCoctelera2.setBorder(null);
		btnCoctelera2.setBorderPainted(false);
		btnCoctelera2.setOpaque(false);
		btnCoctelera2.setBackground(Color.WHITE);
		btnCoctelera2.setContentAreaFilled(false);

		GridBagPrep_Coctl.anchor = GridBagConstraints.SOUTH;
		GridBagPrep_Coctl.insets = new Insets(0, 0, 5, 5);
		GridBagPrep_Coctl.gridx = 6;
		GridBagPrep_Coctl.gridy = 2;

		Prep.add(btnCoctelera2, GridBagPrep_Coctl);

		imagen2.setIcon(new ImageIcon(getClass().getResource(nombreImagen)));
		GridBagPrep_Img.anchor = GridBagConstraints.NORTH;
		GridBagPrep_Img.insets = new Insets(0, 0, 5, 5);
		GridBagPrep_Img.gridx = 1;
		GridBagPrep_Img.gridy = 4;

		Prep.add(imagen2, GridBagPrep_Img);

		GridBagPrep_preparacion.gridwidth = 3;
		GridBagPrep_preparacion.insets = new Insets(0, 0, 5, 5);
		GridBagPrep_preparacion.fill = GridBagConstraints.BOTH;
		GridBagPrep_preparacion.gridx = 2;
		GridBagPrep_preparacion.gridy = 4;


		txtPreparacion.setContentType("text/html");
		txtPreparacion.setText(instruccionesPreparacion);
		Prep.add(txtPreparacion, GridBagPrep_preparacion);	//Añadir texto



		//Panel COCTELERA	

		//**********************************************************************//	

		GridBagLayout GridBagCoct = new GridBagLayout();		//Definicion de GridBag Layout

		GridBagConstraints GridBagCoct_Tit = new GridBagConstraints();	//Definicion de restricciones para el layout
		GridBagConstraints GridBagCoct_Ing = new GridBagConstraints();
		GridBagConstraints GridBagCoct_Prepr = new GridBagConstraints();
		GridBagConstraints GridBagCoct_Coctl = new GridBagConstraints();
		GridBagConstraints GridBagCoct_Img = new GridBagConstraints();
		GridBagConstraints GridBagCoct_coctelera = new GridBagConstraints();
		GridBagConstraints GridBagCoct_Cont = new GridBagConstraints();

		JLabel nombreCoctel3 = new JLabel(nombreCoctel);	//Definicion de JLabel para el titulo
		JLabel imagen3 = new JLabel("");					//y para la imagen

		JButton btnIngredientes3 = new JButton(ingredientes);	//Definicion de botones
		JButton btnPreparacion3 = new JButton(preparacion);
		JButton btnCoctelera3 = new JButton(coctelera_neg);
		JButton btnContinuar = new JButton("<html>CONTINUAR&nbsp;&nbsp;&#10144;</html>");


		JEditorPane txtCoctelera = new JEditorPane();	//Definicion del cuadro de texto

		//**********************************************************************//	

		GridBagCoct.columnWidths = new int[]{60, 220, 170, 40, 170, 40, 145, 0, 0};
		GridBagCoct.rowHeights = new int[]{20, 70, 0, 45, 250, 25, 0};
		GridBagCoct.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		GridBagCoct.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};	//Preparacion del panel
		Coct.setLayout(GridBagCoct);


		nombreCoctel3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		GridBagCoct_Tit.gridwidth = 6;
		GridBagCoct_Tit.anchor = GridBagConstraints.WEST;
		GridBagCoct_Tit.fill = GridBagConstraints.VERTICAL;
		GridBagCoct_Tit.insets = new Insets(0, 0, 5, 5);
		GridBagCoct_Tit.gridx = 1;
		GridBagCoct_Tit.gridy = 1;


		Coct.add(nombreCoctel3, GridBagCoct_Tit);

		btnIngredientes3.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnIngredientes3.setCursor(mano);
		btnIngredientes3.setFocusPainted(false);
		btnIngredientes3.setBorder(null);
		btnIngredientes3.setBorderPainted(false);
		btnIngredientes3.setOpaque(false);
		btnIngredientes3.setBackground(Color.WHITE);
		btnIngredientes3.setContentAreaFilled(false);

		GridBagCoct_Ing.anchor = GridBagConstraints.SOUTH;
		GridBagCoct_Ing.insets = new Insets(0, 0, 5, 5);
		GridBagCoct_Ing.gridx = 2;
		GridBagCoct_Ing.gridy = 2;

		Coct.add(btnIngredientes3, GridBagCoct_Ing);

		btnPreparacion3.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnPreparacion3.setCursor(mano);
		btnPreparacion3.setFocusPainted(false);
		btnPreparacion3.setBorder(null);
		btnPreparacion3.setBorderPainted(false);
		btnPreparacion3.setOpaque(false);
		btnPreparacion3.setBackground(Color.WHITE);
		btnPreparacion3.setContentAreaFilled(false);

		GridBagCoct_Prepr.anchor = GridBagConstraints.SOUTH;
		GridBagCoct_Prepr.insets = new Insets(0, 0, 5, 5);
		GridBagCoct_Prepr.gridx = 4;
		GridBagCoct_Prepr.gridy = 2;

		Coct.add(btnPreparacion3, GridBagCoct_Prepr);

		btnCoctelera3.setFont(new Font("Calibri", Font.PLAIN, 26));
		btnCoctelera3.setCursor(mano);
		btnCoctelera3.setFocusPainted(false);
		btnCoctelera3.setBorder(null);
		btnCoctelera3.setBorderPainted(false);
		btnCoctelera3.setOpaque(false);
		btnCoctelera3.setBackground(Color.WHITE);
		btnCoctelera3.setContentAreaFilled(false);

		GridBagCoct_Coctl.anchor = GridBagConstraints.SOUTH;
		GridBagCoct_Coctl.insets = new Insets(0, 0, 5, 5);
		GridBagCoct_Coctl.gridx = 6;
		GridBagCoct_Coctl.gridy = 2;

		Coct.add(btnCoctelera3, GridBagCoct_Coctl);

		imagen3.setIcon(new ImageIcon(getClass().getResource(nombreImagen)));
		GridBagCoct_Img.anchor = GridBagConstraints.NORTH;
		GridBagCoct_Img.insets = new Insets(0, 0, 5, 5);
		GridBagCoct_Img.gridx = 1;
		GridBagCoct_Img.gridy = 4;


		Coct.add(imagen3, GridBagCoct_Img);

		GridBagCoct_coctelera.gridwidth = 3;
		GridBagCoct_coctelera.insets = new Insets(0, 0, 5, 5);
		GridBagCoct_coctelera.fill = GridBagConstraints.BOTH;
		GridBagCoct_coctelera.gridx = 2;
		GridBagCoct_coctelera.gridy = 4;


		txtCoctelera.setContentType("text/html");
		txtCoctelera.setText(instruccionesCoctelera);
		Coct.add(txtCoctelera, GridBagCoct_coctelera);	//Añadir texto



		btnContinuar.setFont(new Font("Calibri", Font.PLAIN, 24));	//Preparar boton de Continuar
		btnContinuar.setCursor(mano);
		btnContinuar.setFocusPainted(false);
		btnContinuar.setContentAreaFilled(false);
		btnContinuar.setBorderPainted(false);
		btnContinuar.setBorder(null);
		btnContinuar.setBackground(Color.WHITE);
		GridBagCoct_Cont.anchor = GridBagConstraints.SOUTH;
		GridBagCoct_Cont.insets = new Insets(0, 0, 5, 5);
		GridBagCoct_Cont.gridx = 6;
		GridBagCoct_Cont.gridy = 4;
		Coct.add(btnContinuar, GridBagCoct_Cont);	//Añadir boton de Continuar



		//-------------------------------------------------------------------------------------------------------------------------------------------//	
		//Implementacion de los LISTENER

		ActionListener ing = new ActionListener(){public void actionPerformed(ActionEvent e) {cl.show(panelBase, "Ingredientes");}};	//Mostrar panel de Ingredientes
		ActionListener pre = new ActionListener(){public void actionPerformed(ActionEvent e) {cl.show(panelBase, "Preparacion");}};		//Mostrar panel de Preparación
		ActionListener coc = new ActionListener(){public void actionPerformed(ActionEvent e) {cl.show(panelBase, "Coctelera");}};		//Mostrar panel de Coctelera

		//ActionListener ardu = new ActionListener(){public void actionPerformed(ActionEvent e) {Cadena.enviarDatos(Arduino);}};	//Enviar la cadena de información

		btnIngredientes2.addActionListener(ing);	//Asignación de Listeners a los diferentes botones
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
