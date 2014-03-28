import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Colores extends UrCocktail {

	
	JPanel MenuColores = new JPanel();
	CardLayout cardLayout = (CardLayout) panelBaseUrcocktail.getLayout();
	
	
	public Colores() {
		

		MenuColores.setBackground(Color.WHITE);
		GridBagLayout gbl_MenuColores = new GridBagLayout();
		gbl_MenuColores.columnWidths = new int[]{40, 35, 130, 140, 140, 140, 140, 30, 0};
		gbl_MenuColores.rowHeights = new int[]{20, 20, 11, 35, 130, 80, 0, 0};
		gbl_MenuColores.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_MenuColores.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		MenuColores.setLayout(gbl_MenuColores);
		

		JLabel tituloColores = new JLabel("<html><u>COLORES&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</u></html> ");
		tituloColores.setFont(new Font("Champagne & Limousines", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_tituloColores = new GridBagConstraints();
		gbc_tituloColores.gridwidth = 6;
		gbc_tituloColores.anchor = GridBagConstraints.SOUTHWEST;
		gbc_tituloColores.insets = new Insets(0, 0, 5, 5);
		gbc_tituloColores.gridx = 1;
		gbc_tituloColores.gridy = 1;
		MenuColores.add(tituloColores, gbc_tituloColores);

		JLabel subtituloColores = new JLabel("Para todos los gustos ...");
		subtituloColores.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 20));
		GridBagConstraints gbc_subtituloColores = new GridBagConstraints();
		gbc_subtituloColores.gridwidth = 3;
		gbc_subtituloColores.anchor = GridBagConstraints.NORTHWEST;
		gbc_subtituloColores.insets = new Insets(0, 0, 5, 5);
		gbc_subtituloColores.gridx = 2;
		gbc_subtituloColores.gridy = 2;
		MenuColores.add(subtituloColores, gbc_subtituloColores);

		JButton btnRojo = new JButton("");
		btnRojo.setForeground(Color.WHITE);
		btnRojo.setBackground(Color.WHITE);
		btnRojo.setIcon(new ImageIcon(getClass().getResource("Rojo2.png")));

		btnRojo.setFocusable(false);
		btnRojo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnRojo.setFocusPainted(false);
		btnRojo.setBorder(null);
		btnRojo.setBorderPainted(false);
		btnRojo.setOpaque(false);
		btnRojo.setBackground(Color.WHITE);
		btnRojo.setContentAreaFilled(false);

		GridBagConstraints gbc_btnRojo = new GridBagConstraints();
		gbc_btnRojo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRojo.anchor = GridBagConstraints.SOUTH;
		gbc_btnRojo.gridwidth = 2;
		gbc_btnRojo.insets = new Insets(0, 0, 0, 5);
		gbc_btnRojo.gridx = 1;
		gbc_btnRojo.gridy = 4;
		MenuColores.add(btnRojo, gbc_btnRojo);


		JButton btnAzul = new JButton("");
		btnAzul.setIcon(new ImageIcon(getClass().getResource("Azul2.png")));

		btnAzul.setFocusable(false);
		btnAzul.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnAzul.setOpaque(false);
		btnAzul.setForeground(Color.WHITE);
		btnAzul.setContentAreaFilled(false);
		btnAzul.setBorderPainted(false);
		btnAzul.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnAzul = new GridBagConstraints();
		gbc_btnAzul.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAzul.anchor = GridBagConstraints.SOUTH;
		gbc_btnAzul.insets = new Insets(0, 0, 0, 5);
		gbc_btnAzul.gridx = 3;
		gbc_btnAzul.gridy = 4;
		MenuColores.add(btnAzul, gbc_btnAzul);

		
		JButton btnBlanco = new JButton("");
		btnBlanco.setIcon(new ImageIcon(getClass().getResource("Blanco2.png")));

		btnBlanco.setFocusable(false);
		btnBlanco.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnBlanco.setOpaque(false);
		btnBlanco.setForeground(Color.WHITE);
		btnBlanco.setContentAreaFilled(false);
		btnBlanco.setBorderPainted(false);
		btnBlanco.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnBlanco = new GridBagConstraints();
		gbc_btnBlanco.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBlanco.anchor = GridBagConstraints.SOUTH;
		gbc_btnBlanco.insets = new Insets(0, 0, 0, 5);
		gbc_btnBlanco.gridx = 4;
		gbc_btnBlanco.gridy = 4;
		MenuColores.add(btnBlanco, gbc_btnBlanco);


		JButton btnNaranja = new JButton("");
		btnNaranja.setIcon(new ImageIcon(getClass().getResource("Naranja2.png")));

		btnNaranja.setFocusable(false);
		btnNaranja.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNaranja.setOpaque(false);
		btnNaranja.setForeground(Color.WHITE);
		btnNaranja.setContentAreaFilled(false);
		btnNaranja.setBorderPainted(false);
		btnNaranja.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnNaranja = new GridBagConstraints();
		gbc_btnNaranja.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNaranja.anchor = GridBagConstraints.SOUTH;
		gbc_btnNaranja.insets = new Insets(0, 0, 0, 5);
		gbc_btnNaranja.gridx = 5;
		gbc_btnNaranja.gridy = 4;
		MenuColores.add(btnNaranja, gbc_btnNaranja);


		JButton btnCola = new JButton("");
		btnCola.setIcon(new ImageIcon(getClass().getResource("Cola2.png")));

		btnCola.setFocusable(false);
		btnCola.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCola.setOpaque(false);
		btnCola.setForeground(Color.WHITE);
		btnCola.setContentAreaFilled(false);
		btnCola.setBorderPainted(false);
		btnCola.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnCola = new GridBagConstraints();
		gbc_btnCola.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCola.insets = new Insets(0, 0, 0, 5);
		gbc_btnCola.anchor = GridBagConstraints.SOUTH;
		gbc_btnCola.gridx = 6;
		gbc_btnCola.gridy = 4;
		MenuColores.add(btnCola, gbc_btnCola);
		
		JButton btnVolver = new JButton("<html>&#8617;VOLVER</html>");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelPrincipal");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(980, 635);
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
		gbc_btnVolver.anchor = GridBagConstraints.SOUTH;
		gbc_btnVolver.insets = new Insets(0, 0, 5, 0);
		gbc_btnVolver.gridx = 6;
		gbc_btnVolver.gridy = 1;
		MenuColores.add(btnVolver, gbc_btnVolver);
				
		panelBaseUrcocktail.add(MenuColores,"panelEleccion");
		

		ActionListener rojo = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(colorrojo.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(925,615);
			}
		};
		
		ActionListener azul = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(colorazul.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(925,615);
			}
		};
		
		ActionListener blanco = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(colorblanco.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(925,615);
			}
		};
		
		ActionListener naranja = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(colornaranja.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(925,615);
			}
		};
		
		ActionListener cola = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(colorcola.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(925,615);
			}
		};
		
		btnRojo.addActionListener(rojo);
		btnAzul.addActionListener(azul);
		btnBlanco.addActionListener(blanco);
		btnNaranja.addActionListener(naranja);
		btnCola.addActionListener(cola);
		
	}

}
