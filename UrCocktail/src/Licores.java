import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Licores extends UrCocktail{


	CardLayout cardLayout = (CardLayout) panelBaseUrcocktail.getLayout();
	JPanel MenuLicores = new JPanel();

	public Licores() {

		MenuLicores.setBackground(Color.WHITE);

		GridBagLayout gbl_MenuLicores = new GridBagLayout();
		gbl_MenuLicores.columnWidths = new int[]{45, 35, 20, 130, 30, 134, 30, 115, 30, 118, 80, 0};
		gbl_MenuLicores.rowHeights = new int[]{20, 20, 35, 30, 130, 0};
		gbl_MenuLicores.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_MenuLicores.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		MenuLicores.setLayout(gbl_MenuLicores);


		JLabel tituloLicores = new JLabel("<html><u>LICORES&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</u></html> ");
		tituloLicores.setFont(new Font("Champagne & Limousines", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_tituloLicores = new GridBagConstraints();
		gbc_tituloLicores.gridwidth = 9;
		gbc_tituloLicores.anchor = GridBagConstraints.SOUTHWEST;
		gbc_tituloLicores.insets = new Insets(0, 0, 5, 5);
		gbc_tituloLicores.gridx = 1;
		gbc_tituloLicores.gridy = 1;
		MenuLicores.add(tituloLicores, gbc_tituloLicores);

		JLabel subtituloLicores = new JLabel("Elige el mejor sabor ...");
		subtituloLicores.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 20));
		GridBagConstraints gbc_subtituloLicores = new GridBagConstraints();
		gbc_subtituloLicores.gridwidth = 3;
		gbc_subtituloLicores.anchor = GridBagConstraints.NORTHWEST;
		gbc_subtituloLicores.insets = new Insets(0, 0, 5, 5);
		gbc_subtituloLicores.gridx = 2;
		gbc_subtituloLicores.gridy = 2;
		MenuLicores.add(subtituloLicores, gbc_subtituloLicores);

		JButton btnVodka = new JButton("");
		btnVodka.setForeground(Color.WHITE);
		btnVodka.setBackground(Color.WHITE);
		btnVodka.setIcon(new ImageIcon(getClass().getResource("Vodka2.png")));
		btnVodka.setRolloverIcon(new ImageIcon(getClass().getResource("Vodka3.png")));

		btnVodka.setFocusable(false);
		btnVodka.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVodka.setFocusPainted(false);
		btnVodka.setBorder(null);
		btnVodka.setBorderPainted(false);
		btnVodka.setOpaque(false);
		btnVodka.setBackground(Color.WHITE);
		btnVodka.setContentAreaFilled(false);

		GridBagConstraints gbc_btnVodka = new GridBagConstraints();
		gbc_btnVodka.gridwidth = 2;
		gbc_btnVodka.anchor = GridBagConstraints.SOUTH;
		gbc_btnVodka.insets = new Insets(0, 0, 0, 5);
		gbc_btnVodka.gridx = 2;
		gbc_btnVodka.gridy = 4;
		MenuLicores.add(btnVodka, gbc_btnVodka);


		JButton btnGinebra = new JButton("");
		btnGinebra.setIcon(new ImageIcon(getClass().getResource("Ginebra2.png")));
		btnGinebra.setRolloverIcon(new ImageIcon(getClass().getResource("Ginebra3.png")));

		btnGinebra.setFocusable(false);
		btnGinebra.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnGinebra.setOpaque(false);
		btnGinebra.setForeground(Color.WHITE);
		btnGinebra.setContentAreaFilled(false);
		btnGinebra.setBorderPainted(false);
		btnGinebra.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnGinebra = new GridBagConstraints();
		gbc_btnGinebra.anchor = GridBagConstraints.SOUTH;
		gbc_btnGinebra.insets = new Insets(0, 0, 0, 5);
		gbc_btnGinebra.gridx = 5;
		gbc_btnGinebra.gridy = 4;
		MenuLicores.add(btnGinebra, gbc_btnGinebra);


		JButton btnRon = new JButton("");
		btnRon.setIcon(new ImageIcon(getClass().getResource("Ron2.png")));
		btnRon.setRolloverIcon(new ImageIcon(getClass().getResource("Ron3.png")));

		btnRon.setFocusable(false);
		btnRon.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnRon.setOpaque(false);
		btnRon.setForeground(Color.WHITE);
		btnRon.setContentAreaFilled(false);
		btnRon.setBorderPainted(false);
		btnRon.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnRon = new GridBagConstraints();
		gbc_btnRon.anchor = GridBagConstraints.SOUTH;
		gbc_btnRon.insets = new Insets(0, 0, 0, 5);
		gbc_btnRon.gridx = 7;
		gbc_btnRon.gridy = 4;
		MenuLicores.add(btnRon, gbc_btnRon);


		JButton btnTequila = new JButton("");
		btnTequila.setIcon(new ImageIcon(getClass().getResource("Tequila2.png")));
		btnTequila.setRolloverIcon(new ImageIcon(getClass().getResource("Tequila3.png")));

		btnTequila.setFocusable(false);
		btnTequila.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnTequila.setOpaque(false);
		btnTequila.setForeground(Color.WHITE);
		btnTequila.setContentAreaFilled(false);
		btnTequila.setBorderPainted(false);
		btnTequila.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnTequila = new GridBagConstraints();
		gbc_btnTequila.insets = new Insets(0, 0, 0, 5);
		gbc_btnTequila.anchor = GridBagConstraints.SOUTH;
		gbc_btnTequila.gridx = 9;
		gbc_btnTequila.gridy = 4;
		MenuLicores.add(btnTequila, gbc_btnTequila);


		JButton btnVolver = new JButton("<html>&#8617;VOLVER</html>");
		btnVolver.setFont(new Font("Calibri", Font.BOLD, 26));
		btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorder(null);
		btnVolver.setBorderPainted(false);
		btnVolver.setOpaque(false);
		btnVolver.setContentAreaFilled(false);
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnVolver.insets = new Insets(0, 0, 5, 0);
		gbc_btnVolver.gridx = 9;
		gbc_btnVolver.gridy = 1;
		MenuLicores.add(btnVolver, gbc_btnVolver);

		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelPrincipal");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(980, 635);
			}
		});

		panelBaseUrcocktail.add(MenuLicores,"panelEleccion");

		ActionListener vodka = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(licorvodka.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setBounds(100,100,925,615);
			}
		};

		ActionListener ginebra = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(licorginebra.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setBounds(100,100,925,615);
			}
		};

		ActionListener ron = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(licorron.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setBounds(100,100,925,615);
			}
		};

		ActionListener tequila = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(licortequila.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setBounds(100,100,925,615);
			}
		};

		btnVodka.addActionListener(vodka);
		btnGinebra.addActionListener(ginebra);
		btnRon.addActionListener(ron);
		btnTequila.addActionListener(tequila);

	}

}

