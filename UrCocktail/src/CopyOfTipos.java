import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

public class CopyOfTipos extends UrCocktail{

	CardLayout cardLayout = (CardLayout) panelBaseUrcocktail.getLayout();
	JPanel MenuTipos = new JPanel();

	public CopyOfTipos() {

		MenuTipos.setBackground(Color.WHITE);
		MenuTipos.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("20px"),
				ColumnSpec.decode("90px"),
				ColumnSpec.decode("160px"),
				ColumnSpec.decode("113px"),
				ColumnSpec.decode("73px"),
				ColumnSpec.decode("82px"),
				ColumnSpec.decode("100px"),
				ColumnSpec.decode("220px"),},
				new RowSpec[] {
				RowSpec.decode("max(10dlu;default)"),
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("399px:grow"),}));




		JLabel lblColores = new JLabel("<html><u>TIPO DE C\u00D3CTEL&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</u></html> ");
		lblColores.setFont(new Font("Champagne & Limousines", Font.BOLD | Font.ITALIC, 50));
		MenuTipos.add(lblColores, "2, 2, 7, 1, fill, fill");

		JLabel lblNewLabel = new JLabel("Un c\u00F3ctel para cada momento ...");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 20));
		MenuTipos.add(lblNewLabel, "2, 3, 7, 1, fill, fill");



		JButton btnNewButton_1 = new JButton("<html>&#8617;VOLVER</html>");

		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 26));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setContentAreaFilled(false);
		MenuTipos.add(btnNewButton_1, "8, 2, right, bottom");


		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelPrincipal");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(980, 635);
			}
		});


		final JButton button = new JButton("");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setBorder(BorderFactory.createEmptyBorder());


		final JButton btnNewButton = new JButton("");


		btnNewButton.setBorder(BorderFactory.createEmptyBorder());



		btnNewButton.setIcon(new ImageIcon(getClass().getResource("tipo1-1.png")));

		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFocusable(false);
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setContentAreaFilled(false);
		MenuTipos.add(btnNewButton, "4, 4, right, fill");


		button.setIcon(new ImageIcon(getClass().getResource("tipo2-1.png")));

		button.setForeground(Color.WHITE);
		button.setBackground(Color.WHITE);
		button.setFocusable(false);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button.setFocusPainted(false);
		button.setBorder(null);
		button.setBorderPainted(false);
		button.setOpaque(false);
		button.setBackground(Color.WHITE);
		button.setContentAreaFilled(false);
		MenuTipos.add(button, "5, 4, fill, fill");

		final JButton button_1 = new JButton("");

		button_1.setIcon(new ImageIcon(getClass().getResource("tipo3-1.png")));
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(Color.WHITE);
		button_1.setFocusable(false);
		button_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_1.setFocusPainted(false);
		button_1.setBorder(null);
		button_1.setBorderPainted(false);
		button_1.setOpaque(false);
		button_1.setBackground(Color.WHITE);
		button_1.setContentAreaFilled(false);
		MenuTipos.add(button_1, "6, 4, fill, fill");

		final JButton button_2 = new JButton("");

		button_2.setIcon(new ImageIcon(getClass().getResource("tipo4-1.png")));
		button_2.setForeground(Color.WHITE);
		button_2.setBackground(Color.WHITE);
		button_2.setFocusable(false);
		button_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_2.setFocusPainted(false);
		button_2.setBorder(null);
		button_2.setBorderPainted(false);
		button_2.setOpaque(false);
		button_2.setBackground(Color.WHITE);
		button_2.setContentAreaFilled(false);
		MenuTipos.add(button_2, "7, 4, left, fill");


		panelBaseUrcocktail.add(MenuTipos,"panelEleccion");


		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setIcon(new ImageIcon(getClass().getResource("tipo1-2.png")));
				button.setIcon(new ImageIcon(getClass().getResource("tipo2-2.png")));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setIcon(new ImageIcon(getClass().getResource("tipo1-1.png")));
				button.setIcon(new ImageIcon(getClass().getResource("tipo2-1.png")));
			}
		});

		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setIcon(new ImageIcon(getClass().getResource("tipo1-3.png")));
				button.setIcon(new ImageIcon(getClass().getResource("tipo2-3.png")));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setIcon(new ImageIcon(getClass().getResource("tipo1-1.png")));
				button.setIcon(new ImageIcon(getClass().getResource("tipo2-1.png")));
			}
		});

		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setIcon(new ImageIcon(getClass().getResource("tipo2-4.png")));
				button_1.setIcon(new ImageIcon(getClass().getResource("tipo3-4.png")));
				button_2.setIcon(new ImageIcon(getClass().getResource("tipo4-4.png")));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button.setIcon(new ImageIcon(getClass().getResource("tipo2-1.png")));
				button_1.setIcon(new ImageIcon(getClass().getResource("tipo3-1.png")));
				button_2.setIcon(new ImageIcon(getClass().getResource("tipo4-1.png")));
			}

		});

		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_1.setIcon(new ImageIcon(getClass().getResource("tipo3-5.png")));
				button_2.setIcon(new ImageIcon(getClass().getResource("tipo4-5.png")));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button_1.setIcon(new ImageIcon(getClass().getResource("tipo3-1.png")));
				button_2.setIcon(new ImageIcon(getClass().getResource("tipo4-1.png")));
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


		btnNewButton.addActionListener(tropical);
		button.addActionListener(caribe);
		button_1.addActionListener(clasico);
		button_2.addActionListener(elegante);
	}

}

