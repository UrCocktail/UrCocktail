import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VasoCollins{

	final JPanel panelBaseCollins = new JPanel();

	public VasoCollins() {

		panelBaseCollins.setBackground(Color.WHITE);

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{63, 30, 130, 58, 300, 250, 0};
		gbl_panel.rowHeights = new int[]{20, 20, 11, 35, 193, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelBaseCollins.setLayout(gbl_panel);


		JLabel lbltitulo = new JLabel("VASO COLLINS");
		lbltitulo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		GridBagConstraints gbc_lbltitulo = new GridBagConstraints();
		gbc_lbltitulo.gridwidth = 4;
		gbc_lbltitulo.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lbltitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lbltitulo.gridx = 1;
		gbc_lbltitulo.gridy = 1;
		panelBaseCollins.add(lbltitulo, gbc_lbltitulo);

		JLabel lblsubtitulo = new JLabel("Ideal para un buen Tom Collins ");
		lblsubtitulo.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 18));
		GridBagConstraints gbc_lblsubtitulo = new GridBagConstraints();
		gbc_lblsubtitulo.gridwidth = 4;
		gbc_lblsubtitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblsubtitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblsubtitulo.gridx = 1;
		gbc_lblsubtitulo.gridy = 2;
		panelBaseCollins.add(lblsubtitulo, gbc_lblsubtitulo);

		JLabel imagen = new JLabel("");
		imagen.setIcon(new ImageIcon(getClass().getResource("VasoCollins.png")));
		GridBagConstraints gbc_imagen = new GridBagConstraints();
		gbc_imagen.anchor = GridBagConstraints.NORTH;
		gbc_imagen.insets = new Insets(0, 0, 0, 5);
		gbc_imagen.gridx = 2;
		gbc_imagen.gridy = 4;
		panelBaseCollins.add(imagen, gbc_imagen);

		JEditorPane descripcion = new JEditorPane();
		descripcion.setEditable(false);
		descripcion.setContentType("text/html");
		descripcion.setText("<p style=\"text-align: justify;\"><span style=\"font-family: 'calibri';font-size: 20pt\">Vaso largo, delgado y bastante amplio. Debe su nombre al popular trago Tom Collins, que se prepara en este tipo de vaso. Es un vaso indispensable para &ldquo;tragos largos&rdquo;. Se utiliza para servir bebidas de todo tipo, incluyendo zumos o refrescos. <br><br>Su capacidad oscila entre 8 y 14 oz (235 y 415 ml). <br><br>A menudo reemplaza al vaso Highball; la diferencia es que el Collins es un poco m&aacute;s alto y estrecho.</span></p>\r\n");
		GridBagConstraints gbc_descripcion = new GridBagConstraints();
		gbc_descripcion.gridwidth = 2;
		gbc_descripcion.fill = GridBagConstraints.BOTH;
		gbc_descripcion.gridx = 4;
		gbc_descripcion.gridy = 4;
		panelBaseCollins.add(descripcion, gbc_descripcion);
		
		JButton btnVolver = new JButton("<html>&#8617;VOLVER</html>");
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
		gbc_btnVolver.gridx = 5;
		gbc_btnVolver.gridy = 1;
		panelBaseCollins.add(btnVolver, gbc_btnVolver);
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelEleccion");
			}
		});

	}

}
