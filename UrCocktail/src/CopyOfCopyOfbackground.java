import javax.swing.border.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.awt.event.*;

public class CopyOfCopyOfbackground extends JFrame {

	int pgHorzontal;
	JViewport viewport;
	URL wordpress,twitter;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CopyOfCopyOfbackground frame = new CopyOfCopyOfbackground();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CopyOfCopyOfbackground() {

		try {
			wordpress = new URL("http://urcocktail.wordpress.com");
			twitter = new URL("http://twitter.com/urcocktail");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		setTitle("UrCocktail");

		pgHorzontal = 75;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 634);

		PanelImagen p = new PanelImagen("fondo_mod.jpg");
		setContentPane(p);
		GridBagLayout gbl_p = new GridBagLayout();
		gbl_p.columnWidths = new int[]{30, 85, 85, 162, 30, 183, 30, 73, 80, 0, 0, 0};
		gbl_p.rowHeights = new int[]{101, 80, 29, 100, 30, 52, 58, 0, 0};
		gbl_p.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_p.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		p.setLayout(gbl_p);

		JLabel button_6 = new JLabel("");
		button_6.setIcon(new ImageIcon(getClass().getResource("UrCocktail_big.png")));
		button_6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_6.setOpaque(false);
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.gridheight = 2;
		gbc_button_6.anchor = GridBagConstraints.WEST;
		gbc_button_6.gridwidth = 3;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 1;
		gbc_button_6.gridy = 0;
		p.add(button_6, gbc_button_6);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(getClass().getResource("UrCocktail_little.png")));
		label_1.setBorder(null);
		label_1.setOpaque(false);
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.gridheight = 2;
		gbc_label_1.anchor = GridBagConstraints.SOUTH;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 8;
		gbc_label_1.gridy = 1;
		p.add(label_1, gbc_label_1);

		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(getClass().getResource("tipos.png")));
		button_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_2.setFocusPainted(false);
		button_2.setBorder(null);
		button_2.setBorderPainted(false);
		button_2.setOpaque(false);
		button_2.setContentAreaFilled(false);
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.anchor = GridBagConstraints.NORTH;
		gbc_button_2.gridheight = 2;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 7;
		gbc_button_2.gridy = 2;
		p.add(button_2, gbc_button_2);

		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(getClass().getResource("licores.png")));
		button_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_1.setFocusPainted(false);
		button_1.setBorder(null);
		button_1.setBorderPainted(false);
		button_1.setOpaque(false);
		button_1.setContentAreaFilled(false);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.NORTH;
		gbc_button_1.gridheight = 2;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 5;
		gbc_button_1.gridy = 2;
		p.add(button_1, gbc_button_1);

		JButton button = new JButton("");
		button.setIcon(new ImageIcon(getClass().getResource("colores.png")));
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button.setFocusPainted(false);
		button.setBorder(null);
		button.setBorderPainted(false);
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.gridheight = 2;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 3;
		gbc_button.gridy = 2;
		p.add(button, gbc_button);

		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(getClass().getResource("config.png")));
		button_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_5.setFocusPainted(false);
		button_5.setBorder(null);
		button_5.setBorderPainted(false);
		button_5.setOpaque(false);
		button_5.setContentAreaFilled(false);
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 7;
		gbc_button_5.gridy = 5;
		p.add(button_5, gbc_button_5);

		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(getClass().getResource("vasos.png")));
		button_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_4.setFocusPainted(false);
		button_4.setBorder(null);
		button_4.setBorderPainted(false);
		button_4.setOpaque(false);
		button_4.setContentAreaFilled(false);
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 5;
		gbc_button_4.gridy = 5;
		p.add(button_4, gbc_button_4);

		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(getClass().getResource("todos.png")));
		button_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_3.setFocusPainted(false);
		button_3.setBorder(null);
		button_3.setBorderPainted(false);
		button_3.setOpaque(false);
		button_3.setContentAreaFilled(false);
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 3;
		gbc_button_3.gridy = 5;
		p.add(button_3, gbc_button_3);

		JButton button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openWebpage(wordpress);
			}
		});
		button_8.setIcon(new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\wordpress-logo-notext-cmyk.png"));
		button_8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_8.setFocusPainted(false);
		button_8.setBorder(null);
		button_8.setBorderPainted(false);
		button_8.setOpaque(false);
		button_8.setContentAreaFilled(false);
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 0, 5);
		gbc_button_8.gridx = 9;
		gbc_button_8.gridy = 7;
		p.add(button_8, gbc_button_8);

		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openWebpage(twitter);
			}
		});
		button_7.setIcon(new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\Twitter_logo_blue.png"));
		button_7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_7.setFocusPainted(false);
		button_7.setBorder(null);
		button_7.setBorderPainted(false);
		button_7.setOpaque(false);
		button_7.setContentAreaFilled(false);
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.gridx = 10;
		gbc_button_7.gridy = 7;
		p.add(button_7, gbc_button_7);

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
