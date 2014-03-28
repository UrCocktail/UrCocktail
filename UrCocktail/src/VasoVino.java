import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VasoVino{

	Cursor mano = new Cursor(Cursor.HAND_CURSOR);	//Cursor en forma de mano
	final JPanel panelBaseVino = new JPanel();	//Definicion del panel Base 
	CardLayout cl= new CardLayout();	//Card Layout del panel base
	JPanel vinoTinto = new JPanel();	//Definicion de los distintos paneles del Card Layout
	JPanel vinoBlanco = new JPanel();


	public VasoVino() {

		panelBaseVino.setLayout(cl);	//Aplicar el layout al panel
		panelBaseVino.add(vinoTinto, "VinoTinto");	//Agregar todor los paneles al panel base
		panelBaseVino.add(vinoBlanco, "VinoBlanco");

		vinoTinto.setBackground(Color.WHITE);
		vinoBlanco.setBackground(Color.WHITE);

		//VINO TINTO
		
		GridBagLayout gbcVinoTinto = new GridBagLayout();		//Definicion de GridBag Layout
		GridBagConstraints gbcVinoTinto_Tit = new GridBagConstraints();	//Definicion de restricciones para el layout
		GridBagConstraints gbcVinoTinto_Img = new GridBagConstraints();
		GridBagConstraints gbcVinoTinto_texto = new GridBagConstraints();


		JLabel titulo1 = new JLabel("COPA PARA VINO");	//Definicion de JLabel para el titulo
		JLabel subtitulo1 = new JLabel("Bebe con los cinco sentidos ");	//para el subtítulo
		JLabel imagen1 = new JLabel("");					//y para la imagen

		JEditorPane txtVinoTinto = new JEditorPane();	//Definicion del cuadro de texto
		txtVinoTinto.setEditable(false);

		gbcVinoTinto.columnWidths = new int[]{63, 220, 170, 170, 40, 200, 34, 0};	//Parámetros del layout
		gbcVinoTinto.rowHeights = new int[]{20, 20, 0, 45, 290, 25, 0};
		gbcVinoTinto.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbcVinoTinto.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		vinoTinto.setLayout(gbcVinoTinto);

		titulo1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));		//Parámetros del título
		gbcVinoTinto_Tit.gridwidth = 5;
		gbcVinoTinto_Tit.anchor = GridBagConstraints.WEST;
		gbcVinoTinto_Tit.fill = GridBagConstraints.VERTICAL;
		gbcVinoTinto_Tit.insets = new Insets(0, 0, 5, 5);
		gbcVinoTinto_Tit.gridx = 1;
		gbcVinoTinto_Tit.gridy = 1;
		vinoTinto.add(titulo1, gbcVinoTinto_Tit);

		subtitulo1.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 18));	//Parámetros del subtítulo
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.NORTHWEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 2;
		vinoTinto.add(subtitulo1, gbc_label);

		JButton btnVinoTinto1 = new JButton("<html>&#10154;<u><b>VINO TINTO</u></b></html>");	//Botón "Vino Tinto"
		btnVinoTinto1.setFont(new Font("Calibri", Font.PLAIN, 26));
		btnVinoTinto1.setCursor(mano);
		btnVinoTinto1.setFocusPainted(false);
		btnVinoTinto1.setBorder(null);
		btnVinoTinto1.setBorderPainted(false);
		btnVinoTinto1.setOpaque(false);
		btnVinoTinto1.setContentAreaFilled(false);
		GridBagConstraints gbcVinoTinto_vinoTinto = new GridBagConstraints();
		gbcVinoTinto_vinoTinto.fill = GridBagConstraints.HORIZONTAL;
		gbcVinoTinto_vinoTinto.anchor = GridBagConstraints.SOUTH;
		gbcVinoTinto_vinoTinto.insets = new Insets(0, 0, 5, 5);
		gbcVinoTinto_vinoTinto.gridx = 3;
		gbcVinoTinto_vinoTinto.gridy = 2;
		vinoTinto.add(btnVinoTinto1, gbcVinoTinto_vinoTinto);
		
		JButton btnVinoBlanco1 = new JButton("<html><u>VINO BLANCO</u></html>");	//Botón "Vino Blanco"
		btnVinoBlanco1.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnVinoBlanco1.setCursor(mano);
		btnVinoBlanco1.setFocusPainted(false);
		btnVinoBlanco1.setBorder(null);
		btnVinoBlanco1.setBorderPainted(false);
		btnVinoBlanco1.setOpaque(false);
		btnVinoBlanco1.setBackground(Color.WHITE);
		btnVinoBlanco1.setContentAreaFilled(false);
		GridBagConstraints gbcVinoTinto_vinoBlanco = new GridBagConstraints();
		gbcVinoTinto_vinoBlanco.fill = GridBagConstraints.HORIZONTAL;
		gbcVinoTinto_vinoBlanco.anchor = GridBagConstraints.SOUTH;
		gbcVinoTinto_vinoBlanco.insets = new Insets(0, 0, 5, 5);
		gbcVinoTinto_vinoBlanco.gridx = 5;
		gbcVinoTinto_vinoBlanco.gridy = 2;
		vinoTinto.add(btnVinoBlanco1, gbcVinoTinto_vinoBlanco);

		imagen1.setIcon(new ImageIcon(getClass().getResource("VasoVinoTinto.png")));	//Parámetros imagen
		gbcVinoTinto_Img.anchor = GridBagConstraints.NORTH;
		gbcVinoTinto_Img.insets = new Insets(0, 0, 5, 5);
		gbcVinoTinto_Img.gridx = 1;
		gbcVinoTinto_Img.gridy = 4;
		vinoTinto.add(imagen1, gbcVinoTinto_Img);

		txtVinoTinto.setContentType("text/html");	//Texto de descripción
		txtVinoTinto.setText("<p style=\"text-align: justify;\"><span style=\"font-family: 'calibri';font-size: 20pt\">A diferencia de la copa de vino blanco, es m&aacute;s ancha y su boca es m&aacute;s grande, lo que permite respirar mejor al vino. Al igual que la copa de vino blanco, su cuello es largo para permitir que el calor de la mano no modifique la temperatura del contenido. Esta copa se utiliza adem&aacute;s en la elaboraci&oacute;n de algunos c&oacute;cteles. <br><br>Su capacidad  ronda entre 8 y 10 oz (235 y 295 ml).</span></p>\r\n");
		gbcVinoTinto_texto.anchor = GridBagConstraints.NORTH;
		gbcVinoTinto_texto.gridwidth = 5;
		gbcVinoTinto_texto.insets = new Insets(0, 0, 5, 5);
		gbcVinoTinto_texto.fill = GridBagConstraints.HORIZONTAL;
		gbcVinoTinto_texto.gridx = 2;
		gbcVinoTinto_texto.gridy = 4;
		vinoTinto.add(txtVinoTinto, gbcVinoTinto_texto);
		
		JButton btnVolver = new JButton("<html>&#8617;VOLVER</html>");		//Definición botón "Volver"
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelEleccion");
			}
		});
		btnVolver.setFont(new Font("Calibri", Font.BOLD, 26));
		btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorder(null);
		btnVolver.setBorderPainted(false);
		btnVolver.setOpaque(false);
		btnVolver.setBackground(Color.WHITE);
		btnVolver.setContentAreaFilled(false);
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnVolver.insets = new Insets(0, 0, 5, 5);
		gbc_btnVolver.gridx = 5;
		gbc_btnVolver.gridy = 1;
		vinoTinto.add(btnVolver, gbc_btnVolver);
		

		//VINO BLANCO
		//**********************************************************************//	
		GridBagLayout gbcVinoBlanco = new GridBagLayout();		//Definicion de GridBag Layout

		GridBagConstraints gbcVinoBlanco_Tit = new GridBagConstraints();	//Definicion de restricciones para el layout
		GridBagConstraints gbcVinoBlanco_Img = new GridBagConstraints();
		GridBagConstraints gbcVinoBlanco_texto = new GridBagConstraints();

		JLabel titulo2 = new JLabel("COPA PARA VINO");	//Definicion de JLabel para el titulo
		JLabel subtitulo2 = new JLabel("Bebe con los cinco sentidos ");	//para el subtitulo
		JLabel imagen2 = new JLabel("");					//y para la imagen

		JEditorPane txtPreparacion = new JEditorPane();		//Definicion del cuadro de texto
		txtPreparacion.setEditable(false);

		gbcVinoBlanco.columnWidths = new int[]{63, 220, 170, 170, 40, 200, 0, 0};	//Parámetros del layout
		gbcVinoBlanco.rowHeights = new int[]{20, 20, 0, 45, 290, 25, 0};
		gbcVinoBlanco.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbcVinoBlanco.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		vinoBlanco.setLayout(gbcVinoBlanco);

		titulo2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));		//Parámetros del título
		gbcVinoBlanco_Tit.gridwidth = 5;
		gbcVinoBlanco_Tit.anchor = GridBagConstraints.SOUTHWEST;
		gbcVinoBlanco_Tit.insets = new Insets(0, 0, 5, 5);
		gbcVinoBlanco_Tit.gridx = 1;
		gbcVinoBlanco_Tit.gridy = 1;
		vinoBlanco.add(titulo2, gbcVinoBlanco_Tit);

		subtitulo2.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 18));	//Parámetros del subtítulo
		GridBagConstraints gbc_lblBebeConLos = new GridBagConstraints();
		gbc_lblBebeConLos.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblBebeConLos.insets = new Insets(0, 0, 5, 5);
		gbc_lblBebeConLos.gridx = 1;
		gbc_lblBebeConLos.gridy = 2;
		vinoBlanco.add(subtitulo2, gbc_lblBebeConLos);

		JButton btnVinoTinto2 = new JButton("<html><u>VINO TINTO</u></html>");	//Botón "Vino Tinto"
		btnVinoTinto2.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnVinoTinto2.setCursor(mano);
		btnVinoTinto2.setFocusPainted(false);
		btnVinoTinto2.setBorder(null);
		btnVinoTinto2.setBorderPainted(false);
		btnVinoTinto2.setOpaque(false);
		btnVinoTinto2.setBackground(Color.WHITE);
		btnVinoTinto2.setContentAreaFilled(false);
		GridBagConstraints gbcVinoBlanco_Ing = new GridBagConstraints();
		gbcVinoBlanco_Ing.fill = GridBagConstraints.HORIZONTAL;
		gbcVinoBlanco_Ing.anchor = GridBagConstraints.SOUTH;
		gbcVinoBlanco_Ing.insets = new Insets(0, 0, 5, 5);
		gbcVinoBlanco_Ing.gridx = 3;
		gbcVinoBlanco_Ing.gridy = 2;
		vinoBlanco.add(btnVinoTinto2, gbcVinoBlanco_Ing);
		
		JButton btnVinoBlanco2 = new JButton("<html>&#10154;<b><u>VINO BLANCO</u></b></html>");	//Botón "Vino Blanco"
		btnVinoBlanco2.setFont(new Font("Calibri", Font.PLAIN, 26));
		btnVinoBlanco2.setCursor(mano);
		btnVinoBlanco2.setFocusPainted(false);
		btnVinoBlanco2.setBorder(null);
		btnVinoBlanco2.setBorderPainted(false);
		btnVinoBlanco2.setOpaque(false);
		btnVinoBlanco2.setBackground(Color.WHITE);
		btnVinoBlanco2.setContentAreaFilled(false);
		GridBagConstraints gbcVinoBlanco_Prepr = new GridBagConstraints();
		gbcVinoBlanco_Prepr.fill = GridBagConstraints.HORIZONTAL;
		gbcVinoBlanco_Prepr.anchor = GridBagConstraints.SOUTH;
		gbcVinoBlanco_Prepr.insets = new Insets(0, 0, 5, 5);
		gbcVinoBlanco_Prepr.gridx = 5;
		gbcVinoBlanco_Prepr.gridy = 2;
		vinoBlanco.add(btnVinoBlanco2, gbcVinoBlanco_Prepr);

		imagen2.setIcon(new ImageIcon(getClass().getResource("VasoVinoBlanco.png")));	//Parámetros imagen
		gbcVinoBlanco_Img.anchor = GridBagConstraints.NORTH;
		gbcVinoBlanco_Img.insets = new Insets(0, 0, 5, 5);
		gbcVinoBlanco_Img.gridx = 1;
		gbcVinoBlanco_Img.gridy = 4;
		vinoBlanco.add(imagen2, gbcVinoBlanco_Img);
		
		txtPreparacion.setContentType("text/html");		//Texto de descripción
		txtPreparacion.setText("<p style=\"text-align: justify;\"><span style=\"font-family: 'calibri';font-size: 20pt\">Posee un cuello largo para que sea sostenida por all&iacute; y no modifique la temperatura en la que el vino se sirve. A diferencia de la copa de vino tinto &eacute;sta es m&aacute;s corta, de cristal suave y claro. El recipiente en s&iacute; es amplio, estrech&aacute;ndose hacia arriba. Tiene un dise&ntilde;o moderno, ideal para saborear a fondo la frescura del vino blanco y de algunos c&oacute;cteles.&nbsp; <br><br>Su capacidad oscila entre 6 y 8 oz (175 y 235 ml).</span></p>\r\n");
		gbcVinoBlanco_texto.anchor = GridBagConstraints.NORTH;
		gbcVinoBlanco_texto.gridwidth = 4;
		gbcVinoBlanco_texto.insets = new Insets(0, 0, 5, 5);
		gbcVinoBlanco_texto.fill = GridBagConstraints.HORIZONTAL;
		gbcVinoBlanco_texto.gridx = 2;
		gbcVinoBlanco_texto.gridy = 4;
		vinoBlanco.add(txtPreparacion, gbcVinoBlanco_texto);

		JButton btnVolver2 = new JButton("<html>&#8617;VOLVER</html>");		//Definición botón "Volver"
		btnVolver2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelEleccion");
			}
		});
		btnVolver2.setFont(new Font("Calibri", Font.BOLD, 26));
		btnVolver2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVolver2.setFocusPainted(false);
		btnVolver2.setBorder(null);
		btnVolver2.setBorderPainted(false);
		btnVolver2.setOpaque(false);
		btnVolver2.setBackground(Color.WHITE);
		btnVolver2.setContentAreaFilled(false);
		GridBagConstraints gbc_btnVolver2 = new GridBagConstraints();
		gbc_btnVolver2.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnVolver2.insets = new Insets(0, 0, 5, 5);
		gbc_btnVolver2.gridx = 5;
		gbc_btnVolver2.gridy = 1;
		vinoBlanco.add(btnVolver2, gbc_btnVolver2);

		
		//Implementacion de los LISTENER

		ActionListener tinto = new ActionListener(){public void actionPerformed(ActionEvent e) {cl.show(panelBaseVino, "VinoTinto");}};	//Mostrar panel de Vino Tinto
		ActionListener blanco = new ActionListener(){public void actionPerformed(ActionEvent e) {cl.show(panelBaseVino, "VinoBlanco");}};		//Mostrar panel de Vino Blanco

		btnVinoTinto1.addActionListener(tinto);
		btnVinoBlanco1.addActionListener(blanco);
		btnVinoTinto2.addActionListener(tinto);
		btnVinoBlanco2.addActionListener(blanco);
	
	}			


}
