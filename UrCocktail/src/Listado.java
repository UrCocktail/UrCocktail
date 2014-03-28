import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Listado{

	//Variables
	
	Cursor mano = new Cursor(Cursor.HAND_CURSOR);					//Cursor en forma de mano
	PanelImagen panelBase =new PanelImagen("fondo3.png");			//Panel de fondo
	GridBagLayout gbl_panelBase = new GridBagLayout();				//Layout del panel de fondo
	JPanel panel_int = new JPanel();								//Panel interior del scroll
	GridBagLayout gbl_panel_int = new GridBagLayout();				//Layout del panel interior
	JButton btnVolver = new JButton("<html>&#8617;VOLVER</html>");	//Botón "Volver"
	ActionListener volver;											//Action listener del botón "Volver"
	String nombre=null;												//Cadena que identifica el nombre del cóctel a abrir


	//Constructor paramétrico
	
	Listado(String titulo, String subtitulo){

		//Restricciones del layout del panel de fondo
		gbl_panelBase.columnWidths = new int[]{43, 35, 20, 294, 244, 210, 60};
		gbl_panelBase.rowHeights = new int[]{20, 20, 35, 10, 400};
		gbl_panelBase.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		gbl_panelBase.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0};
		panelBase.setLayout(gbl_panelBase);

		//Título
		JLabel lblTitulo = new JLabel("<html><u>"+titulo+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</u></html> \r\n");
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 0);
		gbc_lblTitulo.anchor = GridBagConstraints.NORTH;
		gbc_lblTitulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTitulo.gridwidth = 6;
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 1;
		panelBase.add(lblTitulo, gbc_lblTitulo);
		lblTitulo.setFont(new Font("Champagne & Limousines", Font.BOLD | Font.ITALIC, 50));

		//Subtítulo
		JLabel lblSubtitulo = new JLabel(subtitulo);
		lblSubtitulo.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 20));
		GridBagConstraints gbc_lblSubtitulo = new GridBagConstraints();
		gbc_lblSubtitulo.gridwidth = 2;
		gbc_lblSubtitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblSubtitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSubtitulo.gridx = 2;
		gbc_lblSubtitulo.gridy = 2;
		panelBase.add(lblSubtitulo, gbc_lblSubtitulo);

		//Creación del ScrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);	//Scroll vertical siempre visible
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);		//Incremento del scroll
		
		scrollPane.setOpaque(false);				//ScrollPane transparente
		scrollPane.getViewport().setOpaque(false);
		
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 7;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 4;
		panelBase.add(scrollPane, gbc_scrollPane);

		//Panel interior
		panel_int.setOpaque(false);
		scrollPane.setViewportView(panel_int);
		gbl_panel_int.columnWidths = new int[]{50, 130, 130, 40, 130, 130, 0, 0};
		gbl_panel_int.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_int.setLayout(gbl_panel_int);

		//Botón "Volver"

		btnVolver.setFont(new Font("Calibri", Font.BOLD, 26));
		btnVolver.setCursor(mano);
		btnVolver.setFocusPainted(false);
		btnVolver.setBorder(null);
		btnVolver.setBorderPainted(false);
		btnVolver.setOpaque(false);
		btnVolver.setContentAreaFilled(false);
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.anchor = GridBagConstraints.EAST;
		gbc_btnVolver.insets = new Insets(0, 0, 5, 5);
		gbc_btnVolver.gridx = 5;
		gbc_btnVolver.gridy = 2;
		panelBase.add(btnVolver, gbc_btnVolver);

		volver = new ActionListener() {			//ActionListener del botón "Volver"
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();	//Obtención del layout del panel base de la clase UrCocktail
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelEleccion");					//Se muestra el "panel elección" de la clase UrCocktail
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(925,550);	//Se redimensiona la ventana
			}
		};
		
		btnVolver.addActionListener(volver);

	}

	//---------------------------------------------------------//

	//Función para agregar los parámetros a cada botón de la lista

	public void creaboton(JButton icon, JButton label, final String name, GridBagConstraints gbc_icon, GridBagConstraints gbc_label, int posx, int posy, ActionListener listen){

		//Botón con icono
		
		icon.setIcon(new ImageIcon(getClass().getResource(name+"2.png")));		//Agregar icono
		
		icon.setOpaque(false);													//Parámetros para hacer "invisible" la forma de botón
		icon.setFocusable(false);
		icon.setFocusPainted(false);
		icon.setContentAreaFilled(false);
		icon.setBorderPainted(false);
		icon.setBorder(null);
		icon.setCursor(mano);
		
		gbc_icon.anchor = GridBagConstraints.CENTER;							//Parámetros para el layout
		gbc_icon.insets = new Insets(0, 0, 5, 5);
		gbc_icon.gridx = posx;
		gbc_icon.gridy = posy;
		

		//Botón con nombre
		
		label.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 30));		//Fuente del texto
		
		label.setOpaque(false);													//Parámetros para hacer "invisible" la forma de botón
		label.setForeground(Color.BLACK);
		label.setFocusable(false);
		label.setFocusPainted(false);
		label.setContentAreaFilled(false);
		label.setBorderPainted(false);
		label.setBorder(null);
		label.setCursor(mano);
		
		gbc_label.anchor = GridBagConstraints.WEST;								//Parámetros para el layout
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = posx+1;
		gbc_label.gridy = posy;

		listen = new ActionListener(){											//ActionListener para el botón
			public void actionPerformed(ActionEvent e) {
				nombre = name;
				abrircoctel(nombre);
			}
		};

		icon.addActionListener(listen);
		label.addActionListener(listen);
	}

	//---------------------------------------------------------//

	//Función que permite abrir cada cóctel al pulsar su botón

	private void abrircoctel(String name){

		try {
			CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();		//Obtención del layout del panel base de la clase UrCocktail

			CocktailGenerico coctelselect = (CocktailGenerico) Class.forName(name).newInstance();		//Creación cada objeto cóctel en base a su nombre

			UrCocktail.panelBaseUrcocktail.add(coctelselect.panelBaseCocktailGen,"panelCoctel");		//Se añade el "panel base" del cóctel creado..
																										//..al "panel coctel" de la clase UrCocktail
			
			cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelCoctel");		//Se muestra el "panel cóctel" de la la clase UrCocktail

			SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setBounds(100,100,925,550);	//Se redimensiona la ventana que contiene..
																											//..el "panel base" de la clase UrCocktail

		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//---------------------------------------------------------//

	//Funciones para crear y agregar los botones de forma parámetrica

	public void acapulco(int x, int y){		//X e Y son las coordenadas del botón dentro del panel interior del scroll

		JButton acapulco_icon = new JButton("");				//Etiqueta con el icono del botón
		JButton acapulco_label = new JButton("ACAPULCO ");		//Etiqueta con el nombre del botón

		GridBagConstraints gbc_acapulco_icon = new GridBagConstraints();	//Restricciones del layout para icono y nombre
		GridBagConstraints gbc_acapulco_label = new GridBagConstraints();

		ActionListener acapulco_evt=null;	//ActionListener asociado al botón

		creaboton(acapulco_icon, acapulco_label, "Acapulco", gbc_acapulco_icon, gbc_acapulco_label, x, y, acapulco_evt);	//Llamada a la función "creaboton"

		panel_int.add(acapulco_icon, gbc_acapulco_icon);	//Se añaden icono y nombre al panel interior del scroll
		panel_int.add(acapulco_label, gbc_acapulco_label);

	}

	public void argentinepomelo(int x, int y){

		JButton argentinepomelo_icon = new JButton("");
		JButton argentinepomelo_label = new JButton("ARGENTINE POMELO ");

		GridBagConstraints gbc_argentinepomelo_icon = new GridBagConstraints();
		GridBagConstraints gbc_argentinepomelo_label = new GridBagConstraints();

		ActionListener argentinepomelo_evt=null;

		creaboton(argentinepomelo_icon, argentinepomelo_label, "ArgentinePomelo", gbc_argentinepomelo_icon, gbc_argentinepomelo_label, x, y, argentinepomelo_evt);

		panel_int.add(argentinepomelo_icon, gbc_argentinepomelo_icon);
		panel_int.add(argentinepomelo_label, gbc_argentinepomelo_label);

	}

	public void bacardi(int x, int y){

		JButton bacardi_icon = new JButton("");
		JButton bacardi_label = new JButton("BACARDI COCKTAIL ");

		GridBagConstraints gbc_bacardi_icon = new GridBagConstraints();
		GridBagConstraints gbc_bacardi_label = new GridBagConstraints();

		ActionListener bacardi_evt = null;

		creaboton(bacardi_icon, bacardi_label, "BacardiCocktail", gbc_bacardi_icon, gbc_bacardi_label, x, y, bacardi_evt);

		panel_int.add(bacardi_icon, gbc_bacardi_icon);
		panel_int.add(bacardi_label, gbc_bacardi_label);

	}

	public void batanga(int x, int y){

		JButton batanga_icon = new JButton("");
		JButton batanga_label = new JButton("BATANGA ");

		GridBagConstraints gbc_batanga_icon = new GridBagConstraints();
		GridBagConstraints gbc_batanga_label = new GridBagConstraints();

		ActionListener batanga_evt=null;

		creaboton(batanga_icon, batanga_label, "Batanga", gbc_batanga_icon, gbc_batanga_label, x, y, batanga_evt);

		panel_int.add(batanga_icon, gbc_batanga_icon);
		panel_int.add(batanga_label, gbc_batanga_label);

	}

	public void baybreeze(int x, int y){

		JButton baybreeze_icon = new JButton("");
		JButton baybreeze_label = new JButton("BAY BREEZE ");

		GridBagConstraints gbc_baybreeze_icon = new GridBagConstraints();
		GridBagConstraints gbc_baybreeze_label = new GridBagConstraints();		

		ActionListener baybreeze_evt = null;

		creaboton(baybreeze_icon, baybreeze_label, "BayBreeze", gbc_baybreeze_icon, gbc_baybreeze_label, x, y, baybreeze_evt);

		panel_int.add(baybreeze_icon, gbc_baybreeze_icon);
		panel_int.add(baybreeze_label, gbc_baybreeze_label);

	}

	public void bluearrow(int x, int y){
		JButton bluearrow_icon = new JButton("");
		JButton bluearrow_label = new JButton("BLUE ARROW ");

		GridBagConstraints gbc_bluearrow_icon = new GridBagConstraints();
		GridBagConstraints gbc_bluearrow_label = new GridBagConstraints();

		ActionListener bluearrow_evt=null;

		creaboton(bluearrow_icon, bluearrow_label, "BlueArrow", gbc_bluearrow_icon, gbc_bluearrow_label, x, y, bluearrow_evt);

		panel_int.add(bluearrow_icon, gbc_bluearrow_icon);
		panel_int.add(bluearrow_label, gbc_bluearrow_label);
	}

	public void bluebell(int x, int y){
		JButton bluebell_icon = new JButton("");
		JButton bluebell_label = new JButton("BLUE BELL ");

		GridBagConstraints gbc_bluebell_icon = new GridBagConstraints();
		GridBagConstraints gbc_bluebell_label = new GridBagConstraints();

		ActionListener bluebell_evt=null;

		creaboton(bluebell_icon, bluebell_label, "BlueBell", gbc_bluebell_icon, gbc_bluebell_label, x, y, bluebell_evt);

		panel_int.add(bluebell_icon, gbc_bluebell_icon);
		panel_int.add(bluebell_label, gbc_bluebell_label);
	}

	public void bluedevil(int x, int y){
		JButton bluedevil_icon = new JButton("");
		JButton bluedevil_label = new JButton("BLUE DEVIL ");

		GridBagConstraints gbc_bluedevil_icon = new GridBagConstraints();
		GridBagConstraints gbc_bluedevil_label = new GridBagConstraints();

		ActionListener bluedevil_evt=null;

		creaboton(bluedevil_icon, bluedevil_label, "BlueDevil", gbc_bluedevil_icon, gbc_bluedevil_label, x, y, bluedevil_evt);

		panel_int.add(bluedevil_icon, gbc_bluedevil_icon);
		panel_int.add(bluedevil_label, gbc_bluedevil_label);
	}

	public void bluehawaii(int x, int y){
		JButton bluehawaii_icon = new JButton("");
		JButton bluehawaii_label = new JButton("BLUE HAWAII ");

		GridBagConstraints gbc_bluehawaii_icon = new GridBagConstraints();
		GridBagConstraints gbc_bluehawaii_label = new GridBagConstraints();

		ActionListener bluehawaii_evt=null;

		creaboton(bluehawaii_icon, bluehawaii_label, "BlueHawaii", gbc_bluehawaii_icon, gbc_bluehawaii_label, x, y, bluehawaii_evt);

		panel_int.add(bluehawaii_icon, gbc_bluehawaii_icon);
		panel_int.add(bluehawaii_label, gbc_bluehawaii_label);
	}

	public void bluepassion(int x, int y){
		JButton bluepassion_icon = new JButton("");
		JButton bluepassion_label = new JButton("BLUE PASSION ");

		GridBagConstraints gbc_bluepassion_icon = new GridBagConstraints();
		GridBagConstraints gbc_bluepassion_label = new GridBagConstraints();

		ActionListener bluepassion_evt=null;

		creaboton(bluepassion_icon, bluepassion_label, "BluePassion", gbc_bluepassion_icon, gbc_bluepassion_label, x, y, bluepassion_evt);

		panel_int.add(bluepassion_icon, gbc_bluepassion_icon);
		panel_int.add(bluepassion_label, gbc_bluepassion_label);
	}

	public void bordercrossing(int x, int y){
		JButton bordercrossing_icon = new JButton("");
		JButton bordercrossing_label = new JButton("BORDER CROSSING ");

		GridBagConstraints gbc_bordercrossing_icon = new GridBagConstraints();
		GridBagConstraints gbc_bordercrossing_label = new GridBagConstraints();

		ActionListener bordercrossing_evt=null;

		creaboton(bordercrossing_icon, bordercrossing_label, "BorderCrossing", gbc_bordercrossing_icon, gbc_bordercrossing_label, x, y, bordercrossing_evt);

		panel_int.add(bordercrossing_icon, gbc_bordercrossing_icon);
		panel_int.add(bordercrossing_label, gbc_bordercrossing_label);
	}

	public void caipirinha(int x, int y){
		JButton caipirinha_icon = new JButton("");
		JButton caipirinha_label = new JButton("CAIPIRINHA ");

		GridBagConstraints gbc_caipirinha_icon = new GridBagConstraints();
		GridBagConstraints gbc_caipirinha_label = new GridBagConstraints();

		ActionListener caipirinha_evt=null;

		creaboton(caipirinha_icon, caipirinha_label, "Caipirinha", gbc_caipirinha_icon, gbc_caipirinha_label, x, y, caipirinha_evt);

		panel_int.add(caipirinha_icon, gbc_caipirinha_icon);
		panel_int.add(caipirinha_label, gbc_caipirinha_label);
	}

	public void capecod(int x, int y){
		JButton capecod_icon = new JButton("");
		JButton capecod_label = new JButton("CAPE COD ");

		GridBagConstraints gbc_capecod_icon = new GridBagConstraints();
		GridBagConstraints gbc_capecod_label = new GridBagConstraints();

		ActionListener capecod_evt = null;

		creaboton(capecod_icon, capecod_label, "CapeCod", gbc_capecod_icon, gbc_capecod_label, x, y, capecod_evt);

		panel_int.add(capecod_icon, gbc_capecod_icon);
		panel_int.add(capecod_label, gbc_capecod_label);
	}

	public void cityrickey(int x, int y){
		JButton cityrickey_icon = new JButton("");
		JButton cityrickey_label = new JButton("CITY RICKEY ");

		GridBagConstraints gbc_cityrickey_icon = new GridBagConstraints();
		GridBagConstraints gbc_cityrickey_label = new GridBagConstraints();

		ActionListener cityrickey_evt = null;

		creaboton(cityrickey_icon, cityrickey_label, "CityRickey", gbc_cityrickey_icon, gbc_cityrickey_label, x, y, cityrickey_evt);

		panel_int.add(cityrickey_icon, gbc_cityrickey_icon);
		panel_int.add(cityrickey_label, gbc_cityrickey_label);
	}

	public void coolblue(int x, int y){
		JButton coolblue_icon = new JButton("");
		JButton coolblue_label = new JButton("COOL BLUE ");

		GridBagConstraints gbc_coolblue_icon = new GridBagConstraints();
		GridBagConstraints gbc_coolblue_label = new GridBagConstraints();

		ActionListener coolblue_evt=null;

		creaboton(coolblue_icon, coolblue_label, "CoolBlue", gbc_coolblue_icon, gbc_coolblue_label, x, y, coolblue_evt);

		panel_int.add(coolblue_icon, gbc_coolblue_icon);
		panel_int.add(coolblue_label, gbc_coolblue_label);
	}

	public void cosmopolitan(int x, int y){
		JButton cosmopolitan_icon = new JButton("");
		JButton cosmopolitan_label = new JButton("COSMOPOLITAN ");

		GridBagConstraints gbc_cosmopolitan_icon = new GridBagConstraints();
		GridBagConstraints gbc_cosmopolitan_label = new GridBagConstraints();

		ActionListener cosmopolitan_evt = null;

		creaboton(cosmopolitan_icon, cosmopolitan_label, "Cosmopolitan", gbc_cosmopolitan_icon, gbc_cosmopolitan_label, x, y, cosmopolitan_evt);

		panel_int.add(cosmopolitan_icon, gbc_cosmopolitan_icon);
		panel_int.add(cosmopolitan_label, gbc_cosmopolitan_label);
	}

	public void cranberrylimerum(int x, int y){
		JButton cranberrylimerum_icon = new JButton("");
		JButton cranberrylimerum_label = new JButton("CRANBERRY-LIME RUM ");

		GridBagConstraints gbc_cranberrylimerum_icon = new GridBagConstraints();		
		GridBagConstraints gbc_cranberrylimerum_label = new GridBagConstraints();

		ActionListener cranberrylimerum_evt = null;

		creaboton(cranberrylimerum_icon, cranberrylimerum_label, "CranberryLimeRum", gbc_cranberrylimerum_icon, gbc_cranberrylimerum_label, x, y, cranberrylimerum_evt);

		panel_int.add(cranberrylimerum_icon, gbc_cranberrylimerum_icon);
		panel_int.add(cranberrylimerum_label, gbc_cranberrylimerum_label);
	}

	public void cubalibre(int x, int y){
		JButton cubalibre_icon = new JButton("");
		JButton cubalibre_label = new JButton("CUBA LIBRE ");

		GridBagConstraints gbc_cubalibre_icon = new GridBagConstraints();
		GridBagConstraints gbc_cubalibre_label = new GridBagConstraints();

		ActionListener cubalibre_evt=null;

		creaboton(cubalibre_icon, cubalibre_label, "CubaLibre", gbc_cubalibre_icon, gbc_cubalibre_label, x, y, cubalibre_evt);

		panel_int.add(cubalibre_icon, gbc_cubalibre_icon);
		panel_int.add(cubalibre_label, gbc_cubalibre_label);
	}

	public void daiquiri(int x, int y){
		JButton daiquiri_icon = new JButton("");
		JButton daiquiri_label = new JButton("DAIQUIRI ");

		GridBagConstraints gbc_daiquiri_icon = new GridBagConstraints();
		GridBagConstraints gbc_daiquiri_label = new GridBagConstraints();

		ActionListener daiquiri_evt=null;

		creaboton(daiquiri_icon, daiquiri_label, "Daiquiri", gbc_daiquiri_icon, gbc_daiquiri_label, x, y, daiquiri_evt);

		panel_int.add(daiquiri_icon, gbc_daiquiri_icon);
		panel_int.add(daiquiri_label, gbc_daiquiri_label);
	}

	public void floridasunshine(int x, int y){
		JButton floridasunshine_icon = new JButton("");
		JButton floridasunshine_label = new JButton("FLORIDA SUNSHINE ");

		GridBagConstraints gbc_floridasunshine_icon = new GridBagConstraints();
		GridBagConstraints gbc_floridasunshine_label = new GridBagConstraints();

		ActionListener floridasunshine_evt=null;

		creaboton(floridasunshine_icon, floridasunshine_label, "FloridaSunshine", gbc_floridasunshine_icon, gbc_floridasunshine_label, x, y, floridasunshine_evt);

		panel_int.add(floridasunshine_icon, gbc_floridasunshine_icon);
		panel_int.add(floridasunshine_label, gbc_floridasunshine_label);
	}

	public void gimlet(int x, int y){
		JButton gimlet_icon = new JButton("");
		JButton gimlet_label = new JButton("GIMLET ");

		GridBagConstraints gbc_gimlet_icon = new GridBagConstraints();
		GridBagConstraints gbc_gimlet_label = new GridBagConstraints();

		ActionListener gimlet_evt=null;

		creaboton(gimlet_icon, gimlet_label, "Gimlet", gbc_gimlet_icon, gbc_gimlet_label, x, y, gimlet_evt);

		panel_int.add(gimlet_icon, gbc_gimlet_icon);
		panel_int.add(gimlet_label, gbc_gimlet_label);
	}

	public void ginandsin(int x, int y){
		JButton ginandsin_icon = new JButton("");
		JButton ginandsin_label = new JButton("GIN AND SIN ");

		GridBagConstraints gbc_ginandsin_icon = new GridBagConstraints();
		GridBagConstraints gbc_ginandsin_label = new GridBagConstraints();	

		ActionListener ginandsin_evt = null;

		creaboton(ginandsin_icon, ginandsin_label, "GinAndSin", gbc_ginandsin_icon, gbc_ginandsin_label, x, y, ginandsin_evt);

		panel_int.add(ginandsin_icon, gbc_ginandsin_icon);
		panel_int.add(ginandsin_label, gbc_ginandsin_label);
	}

	public void ginfizz(int x, int y){
		JButton ginfizz_icon = new JButton("");
		JButton ginfizz_label = new JButton("GIN FIZZ ");

		GridBagConstraints gbc_ginfizz_icon = new GridBagConstraints();
		GridBagConstraints gbc_ginfizz_label = new GridBagConstraints();

		ActionListener ginfizz_evt=null;

		creaboton(ginfizz_icon, ginfizz_label, "GinFizz", gbc_ginfizz_icon, gbc_ginfizz_label, x, y, ginfizz_evt);

		panel_int.add(ginfizz_icon, gbc_ginfizz_icon);
		panel_int.add(ginfizz_label, gbc_ginfizz_label);
	}

	public void greyhound(int x, int y){
		JButton greyhound_icon = new JButton("");
		JButton greyhound_label = new JButton("GREYHOUND ");

		GridBagConstraints gbc_greyhound_icon = new GridBagConstraints();
		GridBagConstraints gbc_greyhound_label = new GridBagConstraints();		

		ActionListener greyhound_evt=null;

		creaboton(greyhound_icon, greyhound_label, "Greyhound", gbc_greyhound_icon, gbc_greyhound_label, x, y, greyhound_evt);

		panel_int.add(greyhound_icon, gbc_greyhound_icon);
		panel_int.add(greyhound_label, gbc_greyhound_label);
	}

	public void hawaiianvodka(int x, int y){
		JButton hawaiianvodka_icon = new JButton("");
		JButton hawaiianvodka_label = new JButton("HAWAIIAN VODKA ");

		GridBagConstraints gbc_hawaiianvodka_icon = new GridBagConstraints();
		GridBagConstraints gbc_hawaiianvodka_label = new GridBagConstraints();

		ActionListener hawaiianvodka_evt=null;

		creaboton(hawaiianvodka_icon, hawaiianvodka_label, "HawaiianVodka", gbc_hawaiianvodka_icon, gbc_hawaiianvodka_label, x, y, hawaiianvodka_evt);

		panel_int.add(hawaiianvodka_icon, gbc_hawaiianvodka_icon);
		panel_int.add(hawaiianvodka_label, gbc_hawaiianvodka_label);
	}

	public void icebreaker(int x, int y){
		JButton icebreaker_icon = new JButton("");
		JButton icebreaker_label = new JButton("ICEBREAKER ");

		GridBagConstraints gbc_icebreaker_icon = new GridBagConstraints();
		GridBagConstraints gbc_icebreaker_label = new GridBagConstraints();

		ActionListener icebreaker_evt=null;

		creaboton(icebreaker_icon, icebreaker_label, "Icebreaker", gbc_icebreaker_icon, gbc_icebreaker_label, x, y, icebreaker_evt);

		panel_int.add(icebreaker_icon, gbc_icebreaker_icon);
		panel_int.add(icebreaker_label, gbc_icebreaker_label);
	}

	public void johncollins(int x, int y){
		JButton johncollins_icon = new JButton("");
		JButton johncollins_label = new JButton("JOHN COLLINS ");

		GridBagConstraints gbc_johncollins_icon = new GridBagConstraints();
		GridBagConstraints gbc_johncollins_label = new GridBagConstraints();

		ActionListener johncollins_evt=null;

		creaboton(johncollins_icon, johncollins_label, "JohnCollins", gbc_johncollins_icon, gbc_johncollins_label, x, y, johncollins_evt);

		panel_int.add(johncollins_icon, gbc_johncollins_icon);
		panel_int.add(johncollins_label, gbc_johncollins_label);
	}

	public void lemondrop(int x, int y){
		JButton lemondrop_icon = new JButton("");
		JButton lemondrop_label = new JButton("LEMON DROP ");

		GridBagConstraints gbc_lemondrop_icon = new GridBagConstraints();
		GridBagConstraints gbc_lemondrop_label = new GridBagConstraints();

		ActionListener lemondrop_evt=null;

		creaboton(lemondrop_icon, lemondrop_label, "LemonDrop", gbc_lemondrop_icon, gbc_lemondrop_label, x, y, lemondrop_evt);

		panel_int.add(lemondrop_icon, gbc_lemondrop_icon);
		panel_int.add(lemondrop_label, gbc_lemondrop_label);
	}

	public void longislandicedtea(int x, int y){
		JButton longisland_icon = new JButton("");
		JButton longisland_label = new JButton("LONG ISLAND ICED TEA ");

		GridBagConstraints gbc_longisland_icon = new GridBagConstraints();
		GridBagConstraints gbc_longisland_label = new GridBagConstraints();

		ActionListener longisland_evt=null;		

		creaboton(longisland_icon, longisland_label, "LongIslandIcedTea", gbc_longisland_icon, gbc_longisland_label, x, y, longisland_evt);

		panel_int.add(longisland_icon, gbc_longisland_icon);
		panel_int.add(longisland_label, gbc_longisland_label);
	}

	public void maitailight(int x, int y){
		JButton maitailight_icon = new JButton("");
		JButton maitailight_label = new JButton("MAI TAI LIGHT ");

		GridBagConstraints gbc_maitailight_icon = new GridBagConstraints();
		GridBagConstraints gbc_maitailight_label = new GridBagConstraints();

		ActionListener maitailight_evt=null;

		creaboton(maitailight_icon, maitailight_label, "MaiTaiLight", gbc_maitailight_icon, gbc_maitailight_label, x, y, maitailight_evt);

		panel_int.add(maitailight_icon, gbc_maitailight_icon);
		panel_int.add(maitailight_label, gbc_maitailight_label);
	}

	public void margarita(int x, int y){
		JButton margarita_icon = new JButton("");
		JButton margarita_label = new JButton("MARGARITA ");

		GridBagConstraints gbc_margarita_icon = new GridBagConstraints();
		GridBagConstraints gbc_margarita_label = new GridBagConstraints();

		ActionListener margarita_evt=null;

		creaboton(margarita_icon, margarita_label, "Margarita", gbc_margarita_icon, gbc_margarita_label, x, y, margarita_evt);

		panel_int.add(margarita_icon, gbc_margarita_icon);
		panel_int.add(margarita_label, gbc_margarita_label);
	}

	public void margaritablue(int x, int y){
		JButton margaritablue_icon = new JButton("");
		JButton margaritablue_label = new JButton("MARGARITA BLUE ");

		GridBagConstraints gbc_margaritablue_icon = new GridBagConstraints();
		GridBagConstraints gbc_margaritablue_label = new GridBagConstraints();

		ActionListener margaritablue_evt=null;

		creaboton(margaritablue_icon, margaritablue_label, "MargaritaBlue", gbc_margaritablue_icon, gbc_margaritablue_label, x, y, margaritablue_evt);

		panel_int.add(margaritablue_icon, gbc_margaritablue_icon);
		panel_int.add(margaritablue_label, gbc_margaritablue_label);
	}

	public void mexicano(int x, int y){
		JButton mexicano_icon = new JButton("");
		JButton mexicano_label = new JButton("MEXICANO ");

		GridBagConstraints gbc_mexicano_icon = new GridBagConstraints();
		GridBagConstraints gbc_mexicano_label = new GridBagConstraints();

		ActionListener mexicano_evt = null;

		creaboton(mexicano_icon, mexicano_label, "Mexicano", gbc_mexicano_icon, gbc_mexicano_label, x, y, mexicano_evt);

		panel_int.add(mexicano_icon, gbc_mexicano_icon);
		panel_int.add(mexicano_label, gbc_mexicano_label);
	}

	public void mintjulepvodka(int x, int y){
		JButton mintjulepvodka_icon = new JButton("");
		JButton mintjulepvodka_label = new JButton("MINT JULEP VODKA ");

		GridBagConstraints gbc_mintjulepvodka_icon = new GridBagConstraints();
		GridBagConstraints gbc_mintjulepvodka_label = new GridBagConstraints();

		ActionListener mintjulepvodka_evt=null;

		creaboton(mintjulepvodka_icon, mintjulepvodka_label, "MintJulepVodka", gbc_mintjulepvodka_icon, gbc_mintjulepvodka_label, x, y, mintjulepvodka_evt);

		panel_int.add(mintjulepvodka_icon, gbc_mintjulepvodka_icon);
		panel_int.add(mintjulepvodka_label, gbc_mintjulepvodka_label);
	}

	public void mojito(int x, int y){
		JButton mojito_icon = new JButton("");
		JButton mojito_label = new JButton("MOJITO ");

		GridBagConstraints gbc_mojito_icon = new GridBagConstraints();
		GridBagConstraints gbc_mojito_label = new GridBagConstraints();

		ActionListener mojito_evt=null;

		creaboton(mojito_icon, mojito_label, "Mojito", gbc_mojito_icon, gbc_mojito_label, x, y, mojito_evt);

		panel_int.add(mojito_icon, gbc_mojito_icon);
		panel_int.add(mojito_label, gbc_mojito_label);
	}

	public void monkeygland(int x, int y){
		JButton monkeygland_icon = new JButton("");
		JButton monkeygland_label = new JButton("MONKEY GLAND ");

		GridBagConstraints gbc_monkeygland_icon = new GridBagConstraints();
		GridBagConstraints gbc_monkeygland_label = new GridBagConstraints();

		ActionListener monkeygland_evt=null;

		creaboton(monkeygland_icon, monkeygland_label, "MonkeyGland", gbc_monkeygland_icon, gbc_monkeygland_label, x, y, monkeygland_evt);

		panel_int.add(monkeygland_icon, gbc_monkeygland_icon);
		panel_int.add(monkeygland_label, gbc_monkeygland_label);
	}

	public void pinkrum(int x, int y){
		JButton pinkrum_icon = new JButton("");
		JButton pinkrum_label = new JButton("PINK RUM ");

		GridBagConstraints gbc_pinkrum_icon = new GridBagConstraints();
		GridBagConstraints gbc_pinkrum_label = new GridBagConstraints();

		ActionListener pinkrum_evt = null;

		creaboton(pinkrum_icon, pinkrum_label, "PinkRum", gbc_pinkrum_icon, gbc_pinkrum_label, x, y, pinkrum_evt);

		panel_int.add(pinkrum_icon, gbc_pinkrum_icon);
		panel_int.add(pinkrum_label, gbc_pinkrum_label);
	}

	public void punchonthepier(int x, int y){
		JButton punchonthepier_icon = new JButton("");
		JButton punchonthepier_label = new JButton("PUNCH ON THE PIER ");

		GridBagConstraints gbc_punchonthepier_icon = new GridBagConstraints();
		GridBagConstraints gbc_punchonthepier_label = new GridBagConstraints();

		ActionListener punchonthepier_evt=null;

		creaboton(punchonthepier_icon, punchonthepier_label, "PunchOnThePier", gbc_punchonthepier_icon, gbc_punchonthepier_label, x, y, punchonthepier_evt);

		panel_int.add(punchonthepier_icon, gbc_punchonthepier_icon);
		panel_int.add(punchonthepier_label, gbc_punchonthepier_label);
	}

	public void rickeycocktail(int x, int y){
		JButton rickeycocktail_icon = new JButton("");
		JButton rickeycocktail_label = new JButton("RICKEY COCKTAIL ");

		GridBagConstraints gbc_rickeycocktail_icon = new GridBagConstraints();
		GridBagConstraints gbc_rickeycocktail_label = new GridBagConstraints();

		ActionListener rickeycocktail_evt=null;

		creaboton(rickeycocktail_icon, rickeycocktail_label, "RickeyCocktail", gbc_rickeycocktail_icon, gbc_rickeycocktail_label, x, y, rickeycocktail_evt);

		panel_int.add(rickeycocktail_icon, gbc_rickeycocktail_icon);
		panel_int.add(rickeycocktail_label, gbc_rickeycocktail_label);
	}

	public void saltydog(int x, int y){
		JButton saltydog_icon = new JButton("");
		JButton saltydog_label = new JButton("SALTY DOG ");

		GridBagConstraints gbc_saltydog_icon = new GridBagConstraints();
		GridBagConstraints gbc_saltydog_label = new GridBagConstraints();

		ActionListener saltydog_evt=null;

		creaboton(saltydog_icon, saltydog_label, "SaltyDog", gbc_saltydog_icon, gbc_saltydog_label, x, y, saltydog_evt);

		panel_int.add(saltydog_icon, gbc_saltydog_icon);
		panel_int.add(saltydog_label, gbc_saltydog_label);

	}

	public void screwdriver(int x, int y){
		JButton screwdriver_icon = new JButton("");
		JButton screwdriver_label = new JButton("SCREWDRIVER ");

		GridBagConstraints gbc_screwdriver_icon = new GridBagConstraints();
		GridBagConstraints gbc_screwdriver_label = new GridBagConstraints();

		ActionListener screwdriver_evt=null;

		creaboton(screwdriver_icon, screwdriver_label, "Screwdriver", gbc_screwdriver_icon, gbc_screwdriver_label, x, y, screwdriver_evt);

		panel_int.add(screwdriver_icon, gbc_screwdriver_icon);
		panel_int.add(screwdriver_label, gbc_screwdriver_label);
	}

	public void seabreeze(int x, int y){
		JButton seabreeze_icon = new JButton("");
		JButton seabreeze_label = new JButton("SEA BREEZE ");

		GridBagConstraints gbc_seabreeze_icon = new GridBagConstraints();
		GridBagConstraints gbc_seabreeze_label = new GridBagConstraints();

		ActionListener seabreeze_evt = null;

		creaboton(seabreeze_icon, seabreeze_label, "Seabreeze", gbc_seabreeze_icon, gbc_seabreeze_label, x, y, seabreeze_evt);

		panel_int.add(seabreeze_icon, gbc_seabreeze_icon);
		panel_int.add(seabreeze_label, gbc_seabreeze_label);
	}

	public void southsidefizz(int x, int y){
		JButton southsidefizz_icon = new JButton("");
		JButton southsidefizz_label = new JButton("SOUTH SIDE FIZZ ");

		GridBagConstraints gbc_southsidefizz_icon = new GridBagConstraints();
		GridBagConstraints gbc_southsidefizz_label = new GridBagConstraints();

		ActionListener southsidefizz_evt=null;

		creaboton(southsidefizz_icon, southsidefizz_label, "SouthSideFizz", gbc_southsidefizz_icon, gbc_southsidefizz_label, x, y, southsidefizz_evt);

		panel_int.add(southsidefizz_icon, gbc_southsidefizz_icon);
		panel_int.add(southsidefizz_label, gbc_southsidefizz_label);
	}

	public void splash(int x, int y){
		JButton splash_icon = new JButton("");
		JButton splash_label = new JButton("SPLASH ");

		GridBagConstraints gbc_splash_icon = new GridBagConstraints();
		GridBagConstraints gbc_splash_label = new GridBagConstraints();

		ActionListener splash_evt = null;

		creaboton(splash_icon, splash_label, "Splash", gbc_splash_icon, gbc_splash_label, x, y, splash_evt);

		panel_int.add(splash_icon, gbc_splash_icon);
		panel_int.add(splash_label, gbc_splash_label);
	}

	public void springfling(int x, int y){
		JButton springfling_icon = new JButton("");
		JButton springfling_label = new JButton("SPRING FLING ");

		GridBagConstraints gbc_springfling_icon = new GridBagConstraints();
		GridBagConstraints gbc_springfling_label = new GridBagConstraints();

		ActionListener springfling_evt=null;

		creaboton(springfling_icon, springfling_label, "SpringFling", gbc_springfling_icon, gbc_springfling_label, x, y, springfling_evt);

		panel_int.add(springfling_icon, gbc_springfling_icon);
		panel_int.add(springfling_label, gbc_springfling_label);
	}

	public void tequilasunrise(int x, int y){
		JButton tequilasunrise_icon = new JButton("");
		JButton tequilasunrise_label = new JButton("TEQUILA SUNRISE ");

		GridBagConstraints gbc_tequilasunrise_icon = new GridBagConstraints();
		GridBagConstraints gbc_tequilasunrise_label = new GridBagConstraints();

		ActionListener tequilasunrise_evt=null;

		creaboton(tequilasunrise_icon, tequilasunrise_label, "TequilaSunrise", gbc_tequilasunrise_icon, gbc_tequilasunrise_label, x, y, tequilasunrise_evt);

		panel_int.add(tequilasunrise_icon, gbc_tequilasunrise_icon);
		panel_int.add(tequilasunrise_label, gbc_tequilasunrise_label);
	}

	public void tequilasunriseclassic(int x, int y){
		JButton tequilasunriseclassic_icon = new JButton("");
		JButton tequilasunriseclassic_label = new JButton("TEQUILA SUNRISE CLASSIC");

		GridBagConstraints gbc_tequilasunriseclassic_icon = new GridBagConstraints();
		GridBagConstraints gbc_tequilasunriseclassic_label = new GridBagConstraints();

		ActionListener tequilasunriseclassic_evt = null;

		creaboton(tequilasunriseclassic_icon, tequilasunriseclassic_label, "TequilaSunriseClassic", gbc_tequilasunriseclassic_icon, gbc_tequilasunriseclassic_label, x, y, tequilasunriseclassic_evt);

		panel_int.add(tequilasunriseclassic_icon, gbc_tequilasunriseclassic_icon);
		panel_int.add(tequilasunriseclassic_label, gbc_tequilasunriseclassic_label);
	}

	public void tropicalstorm(int x, int y){
		JButton tropicalstorm_icon = new JButton("");
		JButton tropicalstorm_label = new JButton("TROPICAL STORM ");

		GridBagConstraints gbc_tropicalstorm_icon = new GridBagConstraints();
		GridBagConstraints gbc_tropicalstorm_label = new GridBagConstraints();

		ActionListener tropicalstorm_evt=null;

		creaboton(tropicalstorm_icon, tropicalstorm_label, "TropicalStorm", gbc_tropicalstorm_icon, gbc_tropicalstorm_label, x, y, tropicalstorm_evt);

		panel_int.add(tropicalstorm_icon, gbc_tropicalstorm_icon);
		panel_int.add(tropicalstorm_label, gbc_tropicalstorm_label);
	}

	public void vivavilla(int x, int y){
		JButton vivavilla_icon = new JButton("");
		JButton vivavilla_label = new JButton("VIVA VILLA ");

		GridBagConstraints gbc_vivavilla_icon = new GridBagConstraints();
		GridBagConstraints gbc_vivavilla_label = new GridBagConstraints();

		ActionListener vivavilla_evt=null;

		creaboton(vivavilla_icon, vivavilla_label, "VivaVilla", gbc_vivavilla_icon, gbc_vivavilla_label, x, y, vivavilla_evt);

		panel_int.add(vivavilla_icon, gbc_vivavilla_icon);
		panel_int.add(vivavilla_label, gbc_vivavilla_label);
	}

	public void whitelady(int x, int y){
		JButton whitelady_icon = new JButton("");
		JButton whitelady_label = new JButton("WHITE LADY ");

		GridBagConstraints gbc_whitelady_icon = new GridBagConstraints();
		GridBagConstraints gbc_whitelady_label = new GridBagConstraints();

		ActionListener whitelady_evt=null;

		creaboton(whitelady_icon, whitelady_label, "WhiteLady", gbc_whitelady_icon, gbc_whitelady_label, x, y, whitelady_evt);

		panel_int.add(whitelady_icon, gbc_whitelady_icon);
		panel_int.add(whitelady_label, gbc_whitelady_label);

	}







}
