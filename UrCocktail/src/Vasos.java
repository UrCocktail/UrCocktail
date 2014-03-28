import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Vasos extends UrCocktail {

	JPanel MenuVasos = new JPanel();
	CardLayout cardLayout = (CardLayout) panelBaseUrcocktail.getLayout();

	public Vasos() {

		MenuVasos.setBackground(Color.WHITE);

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{63, 30, 130, 140, 140, 140, 140, 0};
		gbl_panel.rowHeights = new int[]{20, 20, 11, 35, 130, 40, 130, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		MenuVasos.setLayout(gbl_panel);

		JLabel titulo = new JLabel("VASOS");
		titulo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.gridwidth = 4;
		gbc_label_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 1;
		MenuVasos.add(titulo, gbc_label_1);

		JLabel lblNewLabel = new JLabel("Imprescindibles en cualquier bar ...");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		MenuVasos.add(lblNewLabel, gbc_lblNewLabel);

		JButton btnCollins = new JButton("");
		btnCollins.setForeground(Color.WHITE);
		btnCollins.setBackground(Color.WHITE);
		btnCollins.setIcon(new ImageIcon(getClass().getResource("VasoCollins1.png")));
		btnCollins.setRolloverIcon(new ImageIcon(getClass().getResource("VasoCollins2.png")));
		btnCollins.setFocusable(false);
		btnCollins.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCollins.setFocusPainted(false);
		btnCollins.setBorder(null);
		btnCollins.setBorderPainted(false);
		btnCollins.setOpaque(false);
		btnCollins.setBackground(Color.WHITE);
		btnCollins.setContentAreaFilled(false);
		GridBagConstraints gbc_btnCollins = new GridBagConstraints();
		gbc_btnCollins.gridwidth = 2;
		gbc_btnCollins.insets = new Insets(0, 0, 5, 5);
		gbc_btnCollins.gridx = 1;
		gbc_btnCollins.gridy = 4;
		MenuVasos.add(btnCollins, gbc_btnCollins);

		JButton btnHighball = new JButton("");
		btnHighball.setIcon(new ImageIcon(getClass().getResource("VasoHighball1.png")));
		btnHighball.setRolloverIcon(new ImageIcon(getClass().getResource("VasoHighball2.png")));
		btnHighball.setFocusable(false);
		btnHighball.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnHighball.setOpaque(false);
		btnHighball.setForeground(Color.WHITE);
		btnHighball.setContentAreaFilled(false);
		btnHighball.setBorderPainted(false);
		btnHighball.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnHighball = new GridBagConstraints();
		gbc_btnHighball.insets = new Insets(0, 0, 5, 5);
		gbc_btnHighball.gridx = 3;
		gbc_btnHighball.gridy = 4;
		MenuVasos.add(btnHighball, gbc_btnHighball);

		JButton btnMartini = new JButton("");
		btnMartini.setIcon(new ImageIcon(getClass().getResource("VasoMartini1.png")));
		btnMartini.setRolloverIcon(new ImageIcon(getClass().getResource("VasoMartini2.png")));
		btnMartini.setFocusable(false);
		btnMartini.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnMartini.setOpaque(false);
		btnMartini.setForeground(Color.WHITE);
		btnMartini.setContentAreaFilled(false);
		btnMartini.setBorderPainted(false);
		btnMartini.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnMartini = new GridBagConstraints();
		gbc_btnMartini.insets = new Insets(0, 0, 5, 5);
		gbc_btnMartini.gridx = 4;
		gbc_btnMartini.gridy = 4;
		MenuVasos.add(btnMartini, gbc_btnMartini);

		JButton btnMargarita = new JButton("");
		btnMargarita.setIcon(new ImageIcon(getClass().getResource("VasoMargarita1.png")));
		btnMargarita.setRolloverIcon(new ImageIcon(getClass().getResource("VasoMargarita2.png")));
		btnMargarita.setFocusable(false);
		btnMargarita.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnMargarita.setOpaque(false);
		btnMargarita.setForeground(Color.WHITE);
		btnMargarita.setContentAreaFilled(false);
		btnMargarita.setBorderPainted(false);
		btnMargarita.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnMargarita = new GridBagConstraints();
		gbc_btnMargarita.insets = new Insets(0, 0, 5, 5);
		gbc_btnMargarita.gridx = 5;
		gbc_btnMargarita.gridy = 4;
		MenuVasos.add(btnMargarita, gbc_btnMargarita);

		JButton btnOldFashioned = new JButton("");
		btnOldFashioned.setIcon(new ImageIcon(getClass().getResource("VasoOldFashioned1.png")));
		btnOldFashioned.setRolloverIcon(new ImageIcon(getClass().getResource("VasoOldFashioned2.png")));
		btnOldFashioned.setFocusable(false);
		btnOldFashioned.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnOldFashioned.setOpaque(false);
		btnOldFashioned.setForeground(Color.WHITE);
		btnOldFashioned.setContentAreaFilled(false);
		btnOldFashioned.setBorderPainted(false);
		btnOldFashioned.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnOldFashioned = new GridBagConstraints();
		gbc_btnOldFashioned.insets = new Insets(0, 0, 5, 0);
		gbc_btnOldFashioned.gridx = 6;
		gbc_btnOldFashioned.gridy = 4;
		MenuVasos.add(btnOldFashioned, gbc_btnOldFashioned);

		JButton btnShot = new JButton("");
		btnShot.setIcon(new ImageIcon(getClass().getResource("VasoShot1.png")));
		btnShot.setRolloverIcon(new ImageIcon(getClass().getResource("VasoShot2.png")));
		btnShot.setFocusable(false);
		btnShot.setCursor(new Cursor(Cursor.HAND_CURSOR));						
		btnShot.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnShot.setFocusPainted(false);
		btnShot.setBorder(null);
		btnShot.setBorderPainted(false);
		btnShot.setOpaque(false);
		btnShot.setBackground(Color.WHITE);
		btnShot.setContentAreaFilled(false);
		GridBagConstraints gbc_btnShot = new GridBagConstraints();
		gbc_btnShot.gridwidth = 2;
		gbc_btnShot.insets = new Insets(0, 0, 5, 5);
		gbc_btnShot.gridx = 1;
		gbc_btnShot.gridy = 6;
		MenuVasos.add(btnShot, gbc_btnShot);

		JButton btnHuracan = new JButton("");
		btnHuracan.setIcon(new ImageIcon(getClass().getResource("VasoHuracan1.png")));
		btnHuracan.setRolloverIcon(new ImageIcon(getClass().getResource("VasoHuracan2.png")));
		btnHuracan.setFocusable(false);
		btnHuracan.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnHuracan.setOpaque(false);
		btnHuracan.setForeground(Color.WHITE);
		btnHuracan.setContentAreaFilled(false);
		btnHuracan.setBorderPainted(false);
		btnHuracan.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnHuracan = new GridBagConstraints();
		gbc_btnHuracan.insets = new Insets(0, 0, 5, 5);
		gbc_btnHuracan.gridx = 3;
		gbc_btnHuracan.gridy = 6;
		MenuVasos.add(btnHuracan, gbc_btnHuracan);

		JButton btnPilsner = new JButton("");
		btnPilsner.setIcon(new ImageIcon(getClass().getResource("VasoPilsner1.png")));
		btnPilsner.setRolloverIcon(new ImageIcon(getClass().getResource("VasoPilsner2.png")));
		btnPilsner.setFocusable(false);
		btnPilsner.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnPilsner.setOpaque(false);
		btnPilsner.setForeground(Color.WHITE);
		btnPilsner.setContentAreaFilled(false);
		btnPilsner.setBorderPainted(false);
		btnPilsner.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnPilsner = new GridBagConstraints();
		gbc_btnPilsner.insets = new Insets(0, 0, 5, 5);
		gbc_btnPilsner.gridx = 4;
		gbc_btnPilsner.gridy = 6;
		MenuVasos.add(btnPilsner, gbc_btnPilsner);

		JButton btnVino = new JButton("");
		btnVino.setIcon(new ImageIcon(getClass().getResource("VasoVinoTinto1.png")));
		btnVino.setRolloverIcon(new ImageIcon(getClass().getResource("VasoVinoTinto2.png")));
		btnVino.setFocusable(false);
		btnVino.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVino.setOpaque(false);
		btnVino.setForeground(Color.WHITE);
		btnVino.setContentAreaFilled(false);
		btnVino.setBorderPainted(false);
		btnVino.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnVino = new GridBagConstraints();
		gbc_btnVino.insets = new Insets(0, 0, 5, 5);
		gbc_btnVino.gridx = 5;
		gbc_btnVino.gridy = 6;
		MenuVasos.add(btnVino, gbc_btnVino);

		JButton btnChampagne = new JButton("");
		btnChampagne.setIcon(new ImageIcon(getClass().getResource("VasoChampagne1.png")));
		btnChampagne.setRolloverIcon(new ImageIcon(getClass().getResource("VasoChampagne2.png")));
		btnChampagne.setFocusable(false);
		btnChampagne.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnChampagne.setOpaque(false);
		btnChampagne.setForeground(Color.WHITE);
		btnChampagne.setContentAreaFilled(false);
		btnChampagne.setBorderPainted(false);
		btnChampagne.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnChampagne = new GridBagConstraints();
		gbc_btnChampagne.insets = new Insets(0, 0, 5, 0);
		gbc_btnChampagne.gridx = 6;
		gbc_btnChampagne.gridy = 6;
		MenuVasos.add(btnChampagne, gbc_btnChampagne);


		JButton btnVolver = new JButton("<html>&#8617;VOLVER</html>");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		gbc_btnVolver.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnVolver.insets = new Insets(0, 0, 5, 0);
		gbc_btnVolver.gridx = 6;
		gbc_btnVolver.gridy = 1;
		MenuVasos.add(btnVolver, gbc_btnVolver);


		panelBaseUrcocktail.add(MenuVasos,"panelEleccion");


		ActionListener collins = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(vasocollins.panelBaseCollins, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};

		ActionListener highball = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(vasohighball.panelBaseHighball, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};

		ActionListener martini = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(vasomartini.panelBaseMartini, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};

		ActionListener margarita = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(vasomargarita.panelBaseMargarita, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};

		ActionListener oldfashioned = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(vasooldfashioned.panelBaseOldFashioned, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};

		ActionListener shot = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(vasoshot.panelBaseShot, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};

		ActionListener huracan = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(vasohuracan.panelBaseHuracan, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};

		ActionListener pilsner = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(vasopilsner.panelBasePilsner, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};

		ActionListener vino = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(vasovino.panelBaseVino, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};

		ActionListener champagne = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(vasochampagne.panelBaseChampagne, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};

		btnCollins.addActionListener(collins);
		btnHighball.addActionListener(highball);
		btnMartini.addActionListener(martini);
		btnMargarita.addActionListener(margarita);
		btnOldFashioned.addActionListener(oldfashioned);
		btnShot.addActionListener(shot);
		btnHuracan.addActionListener(huracan);
		btnPilsner.addActionListener(pilsner);
		btnVino.addActionListener(vino);
		btnChampagne.addActionListener(champagne);

	}

}
