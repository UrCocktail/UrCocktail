import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.awt.event.*;

public class MenuPrincipal extends UrCocktail {

	URL wordpress,twitter;
	CardLayout cardLayout = (CardLayout) panelBaseUrcocktail.getLayout();

	public MenuPrincipal() {

		super ("UrCocktail");

		try {
			wordpress = new URL("http://urcocktail.wordpress.com");
			twitter = new URL("http://twitter.com/urcocktail");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PanelImagen fondo = new PanelImagen("fondo_mod.gif");
		GridBagLayout gbl_fondo = new GridBagLayout();
		gbl_fondo.columnWidths = new int[]{30, 85, 85, 162, 30, 183, 30, 73, 80, 0, 0, 0};
		gbl_fondo.rowHeights = new int[]{101, 80, 29, 100, 30, 52, 58, 0, 0};
		gbl_fondo.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_fondo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		fondo.setLayout(gbl_fondo);

		JLabel icono_grande = new JLabel("");
		icono_grande.setIcon(new ImageIcon(getClass().getResource("UrCocktail_big.png")));
		icono_grande.setCursor(new Cursor(Cursor.HAND_CURSOR));
		icono_grande.setOpaque(false);
		GridBagConstraints gbc_icono_grande = new GridBagConstraints();
		gbc_icono_grande.gridheight = 2;
		gbc_icono_grande.anchor = GridBagConstraints.WEST;
		gbc_icono_grande.gridwidth = 3;
		gbc_icono_grande.insets = new Insets(0, 0, 5, 5);
		gbc_icono_grande.gridx = 1;
		gbc_icono_grande.gridy = 0;
		fondo.add(icono_grande, gbc_icono_grande);

		JButton btnColores = new JButton("");
		btnColores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Colores colores = new Colores();
				panelBaseUrcocktail.add(colores.MenuColores, "panelEleccion");
				cardLayout.show(panelBaseUrcocktail,"panelEleccion");		
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(925,550);
			}
		});
		btnColores.setIcon(new ImageIcon(getClass().getResource("colores.png")));
		btnColores.setRolloverIcon(new ImageIcon(getClass().getResource("colores_neon.png")));
		btnColores.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnColores.setFocusPainted(false);
		btnColores.setBorder(null);
		btnColores.setBorderPainted(false);
		btnColores.setOpaque(false);
		btnColores.setContentAreaFilled(false);
		GridBagConstraints gbc_btnColores = new GridBagConstraints();
		gbc_btnColores.anchor = GridBagConstraints.NORTH;
		gbc_btnColores.gridheight = 2;
		gbc_btnColores.insets = new Insets(0, 0, 5, 5);
		gbc_btnColores.gridx = 3;
		gbc_btnColores.gridy = 2;
		fondo.add(btnColores, gbc_btnColores);

		JButton btnLicores = new JButton("");
		btnLicores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Licores licores = new Licores();
				panelBaseUrcocktail.add(licores.MenuLicores, "panelEleccion");
				cardLayout.show(panelBaseUrcocktail,"panelEleccion");		
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(925,550);
			}
		});
		btnLicores.setIcon(new ImageIcon(getClass().getResource("licores.png")));
		btnLicores.setRolloverIcon(new ImageIcon(getClass().getResource("licores_neon.png")));
		btnLicores.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLicores.setFocusPainted(false);
		btnLicores.setBorder(null);
		btnLicores.setBorderPainted(false);
		btnLicores.setOpaque(false);
		btnLicores.setContentAreaFilled(false);
		GridBagConstraints gbc_btnLicores = new GridBagConstraints();
		gbc_btnLicores.anchor = GridBagConstraints.NORTH;
		gbc_btnLicores.gridheight = 2;
		gbc_btnLicores.insets = new Insets(0, 0, 5, 5);
		gbc_btnLicores.gridx = 5;
		gbc_btnLicores.gridy = 2;
		fondo.add(btnLicores, gbc_btnLicores);

		JButton btnTipos = new JButton("");
		btnTipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tipos tipos = new Tipos();
				panelBaseUrcocktail.add(tipos.MenuTipos, "panelEleccion");
				cardLayout.show(panelBaseUrcocktail,"panelEleccion");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(925,550);
			}
		});
		btnTipos.setIcon(new ImageIcon(getClass().getResource("tipos.png")));
		btnTipos.setRolloverIcon(new ImageIcon(getClass().getResource("tipos_neon.png")));
		btnTipos.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnTipos.setFocusPainted(false);
		btnTipos.setBorder(null);
		btnTipos.setBorderPainted(false);
		btnTipos.setOpaque(false);
		btnTipos.setContentAreaFilled(false);
		GridBagConstraints gbc_btnTipos = new GridBagConstraints();
		gbc_btnTipos.anchor = GridBagConstraints.NORTH;
		gbc_btnTipos.gridheight = 2;
		gbc_btnTipos.insets = new Insets(0, 0, 5, 5);
		gbc_btnTipos.gridx = 7;
		gbc_btnTipos.gridy = 2;
		fondo.add(btnTipos, gbc_btnTipos);

		JButton btnTodos = new JButton("");
		btnTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelBaseUrcocktail.add(todos.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(925,615);	
			}
		});
		btnTodos.setIcon(new ImageIcon(getClass().getResource("todos.png")));
		btnTodos.setRolloverIcon(new ImageIcon(getClass().getResource("todos_neon.png")));
		btnTodos.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnTodos.setFocusPainted(false);
		btnTodos.setBorder(null);
		btnTodos.setBorderPainted(false);
		btnTodos.setOpaque(false);
		btnTodos.setContentAreaFilled(false);
		GridBagConstraints gbc_btnTodos = new GridBagConstraints();
		gbc_btnTodos.insets = new Insets(0, 0, 5, 5);
		gbc_btnTodos.gridx = 3;
		gbc_btnTodos.gridy = 5;
		fondo.add(btnTodos, gbc_btnTodos);

		JButton btnVasos = new JButton("");
		btnVasos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Vasos vasos = new Vasos();
				panelBaseUrcocktail.add(vasos.MenuVasos, "panelEleccion");
				cardLayout.show(panelBaseUrcocktail,"panelEleccion");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(925,550);
			}
		});
		btnVasos.setIcon(new ImageIcon(getClass().getResource("vasos.png")));
		btnVasos.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVasos.setFocusPainted(false);
		btnVasos.setBorder(null);
		btnVasos.setBorderPainted(false);
		btnVasos.setOpaque(false);
		btnVasos.setContentAreaFilled(false);
		GridBagConstraints gbc_btnVasos = new GridBagConstraints();
		gbc_btnVasos.insets = new Insets(0, 0, 5, 5);
		gbc_btnVasos.gridx = 5;
		gbc_btnVasos.gridy = 5;
		fondo.add(btnVasos, gbc_btnVasos);

		JButton btnConfig = new JButton("");
		btnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Configuracion configuracion = new Configuracion();
				panelBaseUrcocktail.add(configuracion.panelBaseConf, "panelEleccion");
				cardLayout.show(panelBaseUrcocktail,"panelEleccion");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(925,550);
			}
		});
		btnConfig.setIcon(new ImageIcon(getClass().getResource("config.png")));
		btnConfig.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnConfig.setFocusPainted(false);
		btnConfig.setBorder(null);
		btnConfig.setBorderPainted(false);
		btnConfig.setOpaque(false);
		btnConfig.setContentAreaFilled(false);
		GridBagConstraints gbc_btnConfig = new GridBagConstraints();
		gbc_btnConfig.insets = new Insets(0, 0, 5, 5);
		gbc_btnConfig.gridx = 7;
		gbc_btnConfig.gridy = 5;
		fondo.add(btnConfig, gbc_btnConfig);

		JButton btnTwitter = new JButton("");
		btnTwitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openWebpage(twitter);
			}
		});
		btnTwitter.setIcon(new ImageIcon(getClass().getResource("Twitter.png")));
		btnTwitter.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnTwitter.setFocusPainted(false);
		btnTwitter.setBorder(null);
		btnTwitter.setBorderPainted(false);
		btnTwitter.setOpaque(false);
		btnTwitter.setContentAreaFilled(false);
		GridBagConstraints gbc_btnTwitter = new GridBagConstraints();
		gbc_btnTwitter.gridx = 10;
		gbc_btnTwitter.gridy = 7;
		fondo.add(btnTwitter, gbc_btnTwitter);

		JButton btnWordpress = new JButton("");
		btnWordpress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openWebpage(wordpress);
			}
		});
		btnWordpress.setIcon(new ImageIcon(getClass().getResource("WordPress.png")));
		btnWordpress.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnWordpress.setFocusPainted(false);
		btnWordpress.setBorder(null);
		btnWordpress.setBorderPainted(false);
		btnWordpress.setOpaque(false);
		btnWordpress.setContentAreaFilled(false);
		GridBagConstraints gbc_btnWordpress = new GridBagConstraints();
		gbc_btnWordpress.insets = new Insets(0, 0, 0, 5);
		gbc_btnWordpress.gridx = 9;
		gbc_btnWordpress.gridy = 7;
		fondo.add(btnWordpress, gbc_btnWordpress);

		panelBaseUrcocktail.add(fondo,"panelPrincipal");
		clClasGen.show(panelBaseUrcocktail, "panelPrincipal");

	}


	public static void openWebpage(URI uri) {
		Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
		if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
			try {
				desktop.browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void openWebpage(URL url) {
		try {
			openWebpage(url.toURI());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}


}