import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tipos extends UrCocktail{

	CardLayout cardLayout = (CardLayout) panelBaseUrcocktail.getLayout();
	JPanel MenuTipos = new JPanel();
	
	JButton btn1 = new JButton("");
	JButton btn2 = new JButton("");
	JButton btn3 = new JButton("");
	JButton btn4 = new JButton("");
	
	JButton btnVolver = new JButton("<html>&#8617;VOLVER</html>");
	

	public Tipos() {

		MenuTipos.setBackground(Color.WHITE);
		
		GridBagLayout gbl_fondo = new GridBagLayout();
		gbl_fondo.columnWidths = new int[]{20, 90, 160, 113, 73, 82, 100, 220};
		gbl_fondo.rowHeights = new int[]{15, 60, 25, 30, 300};
		gbl_fondo.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_fondo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		MenuTipos.setLayout(gbl_fondo);
		
		
		JLabel lblTitulo = new JLabel("<html><u>TIPO DE C\u00D3CTEL&nbsp;</u></html> ");
		lblTitulo.setFont(new Font("Champagne & Limousines", Font.BOLD | Font.ITALIC, 50));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridwidth = 6;
		gbc_lblTitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblTitulo.insets = new Insets(0, 0, 0, 0);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 1;
		MenuTipos.add(lblTitulo, gbc_lblTitulo);

		JLabel lblSubtitulo = new JLabel("Un c\u00F3ctel para cada momento ...");
		lblSubtitulo.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 20));
		GridBagConstraints gbc_lblSubtitulo = new GridBagConstraints();
		gbc_lblSubtitulo.gridwidth = 6;
		gbc_lblSubtitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblSubtitulo.insets = new Insets(0, 0, 0, 0);
		gbc_lblSubtitulo.gridx = 1;
		gbc_lblSubtitulo.gridy = 2;
		MenuTipos.add(lblSubtitulo, gbc_lblSubtitulo);


		btn1.setBorder(BorderFactory.createEmptyBorder());
		btn1.setIcon(new ImageIcon(getClass().getResource("tipo1-1.png")));
		btn1.setFocusable(false);
		btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn1.setFocusPainted(false);
		btn1.setBorder(null);
		btn1.setBorderPainted(false);
		btn1.setOpaque(false);
		btn1.setContentAreaFilled(false);
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.gridwidth = 1;
		gbc_btn1.anchor = GridBagConstraints.NORTHWEST;
		gbc_btn1.insets = new Insets(0, 0, 0, 0);
		gbc_btn1.gridx = 3;
		gbc_btn1.gridy = 4;
		MenuTipos.add(btn1, gbc_btn1);
		

		btn2.setHorizontalAlignment(SwingConstants.LEFT);
		btn2.setBorder(BorderFactory.createEmptyBorder());
		btn2.setIcon(new ImageIcon(getClass().getResource("tipo2-1.png")));
		btn2.setFocusable(false);
		btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn2.setFocusPainted(false);
		btn2.setBorder(null);
		btn2.setBorderPainted(false);
		btn2.setOpaque(false);
		btn2.setContentAreaFilled(false);
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.gridwidth = 1;
		gbc_btn2.anchor = GridBagConstraints.NORTHWEST;
		gbc_btn2.insets = new Insets(0, 0, 0, 0);
		gbc_btn2.gridx = 4;
		gbc_btn2.gridy = 4;
		MenuTipos.add(btn2, gbc_btn2);


		btn3.setIcon(new ImageIcon(getClass().getResource("tipo3-1.png")));
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.WHITE);
		btn3.setFocusable(false);
		btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn3.setFocusPainted(false);
		btn3.setBorder(null);
		btn3.setBorderPainted(false);
		btn3.setOpaque(false);
		btn3.setContentAreaFilled(false);
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.gridwidth = 1;
		gbc_btn3.anchor = GridBagConstraints.NORTHWEST;
		gbc_btn3.insets = new Insets(0, 0, 0, 0);
		gbc_btn3.gridx = 5;
		gbc_btn3.gridy = 4;
		MenuTipos.add(btn3, gbc_btn3);


		btn4.setIcon(new ImageIcon(getClass().getResource("tipo4-1.png")));
		btn4.setFocusable(false);
		btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn4.setFocusPainted(false);
		btn4.setBorder(null);
		btn4.setBorderPainted(false);
		btn4.setOpaque(false);
		btn4.setBackground(Color.WHITE);
		btn4.setContentAreaFilled(false);
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.gridwidth = 1;
		gbc_btn4.anchor = GridBagConstraints.NORTHWEST;
		gbc_btn4.insets = new Insets(0, 0, 0, 0);
		gbc_btn4.gridx = 6;
		gbc_btn4.gridy = 4;
		MenuTipos.add(btn4, gbc_btn4);

		

		btnVolver.setFont(new Font("Calibri", Font.BOLD, 26));
		btnVolver.setFocusable(false);
		btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVolver.setFocusPainted(false);
		btnVolver.setBorder(null);
		btnVolver.setBorderPainted(false);
		btnVolver.setOpaque(false);
		btnVolver.setContentAreaFilled(false);
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.gridwidth = 1;
		gbc_btnVolver.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnVolver.insets = new Insets(0, 0, 0, 0);
		gbc_btnVolver.gridx = 7;
		gbc_btnVolver.gridy = 1;
		MenuTipos.add(btnVolver, gbc_btnVolver);

		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelPrincipal");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(980, 635);
			}
		});

		panelBaseUrcocktail.add(MenuTipos,"panelEleccion");


		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn1.setIcon(new ImageIcon(getClass().getResource("tipo1-2.png")));
				btn2.setIcon(new ImageIcon(getClass().getResource("tipo2-2.png")));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn1.setIcon(new ImageIcon(getClass().getResource("tipo1-1.png")));
				btn2.setIcon(new ImageIcon(getClass().getResource("tipo2-1.png")));
			}
		});

		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn1.setIcon(new ImageIcon(getClass().getResource("tipo1-3.png")));
				btn2.setIcon(new ImageIcon(getClass().getResource("tipo2-3.png")));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn1.setIcon(new ImageIcon(getClass().getResource("tipo1-1.png")));
				btn2.setIcon(new ImageIcon(getClass().getResource("tipo2-1.png")));
			}
		});

		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn2.setIcon(new ImageIcon(getClass().getResource("tipo2-4.png")));
				btn3.setIcon(new ImageIcon(getClass().getResource("tipo3-4.png")));
				btn4.setIcon(new ImageIcon(getClass().getResource("tipo4-4.png")));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn2.setIcon(new ImageIcon(getClass().getResource("tipo2-1.png")));
				btn3.setIcon(new ImageIcon(getClass().getResource("tipo3-1.png")));
				btn4.setIcon(new ImageIcon(getClass().getResource("tipo4-1.png")));
			}

		});

		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn3.setIcon(new ImageIcon(getClass().getResource("tipo3-5.png")));
				btn4.setIcon(new ImageIcon(getClass().getResource("tipo4-5.png")));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn3.setIcon(new ImageIcon(getClass().getResource("tipo3-1.png")));
				btn4.setIcon(new ImageIcon(getClass().getResource("tipo4-1.png")));
			}

		});



		ActionListener tropical = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(tipotropical.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};

		ActionListener caribe = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(tipocaribe.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};

		ActionListener clasico = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(tipoclasico.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};

		ActionListener elegante = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelBaseUrcocktail.add(tipoelegante.panelBase, "panelLista");
				cardLayout.show(panelBaseUrcocktail,"panelLista");
			}
		};


		btn1.addActionListener(tropical);
		btn2.addActionListener(caribe);
		btn3.addActionListener(clasico);
		btn4.addActionListener(elegante);
	}

}

