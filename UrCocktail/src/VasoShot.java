import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VasoShot{

	final JPanel panelBaseShot = new JPanel();

	public VasoShot() {

		panelBaseShot.setBackground(Color.WHITE);

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{63, 30, 130, 58, 300, 250, 0};
		gbl_panel.rowHeights = new int[]{20, 20, 11, 35, 193, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelBaseShot.setLayout(gbl_panel);

		JLabel titulo = new JLabel("VASO SHOT");
		titulo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		GridBagConstraints gbc_titulo = new GridBagConstraints();
		gbc_titulo.gridwidth = 4;
		gbc_titulo.anchor = GridBagConstraints.SOUTHWEST;
		gbc_titulo.insets = new Insets(0, 0, 5, 5);
		gbc_titulo.gridx = 1;
		gbc_titulo.gridy = 1;
		panelBaseShot.add(titulo, gbc_titulo);

		JLabel subtitulo = new JLabel("De un trago ");
		subtitulo.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 18));
		GridBagConstraints gbc_subtitulo = new GridBagConstraints();
		gbc_subtitulo.gridwidth = 4;
		gbc_subtitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_subtitulo.insets = new Insets(0, 0, 5, 5);
		gbc_subtitulo.gridx = 1;
		gbc_subtitulo.gridy = 2;
		panelBaseShot.add(subtitulo, gbc_subtitulo);

		JLabel imagen = new JLabel("");
		imagen.setIcon(new ImageIcon(getClass().getResource("VasoShot.png")));
		GridBagConstraints gbc_imagen = new GridBagConstraints();
		gbc_imagen.insets = new Insets(0, 0, 0, 5);
		gbc_imagen.gridx = 2;
		gbc_imagen.gridy = 4;
		panelBaseShot.add(imagen, gbc_imagen);

		JEditorPane descripcion = new JEditorPane();
		descripcion.setEditable(false);
		descripcion.setContentType("text/html");
		descripcion.setText("<p style=\"text-align: justify;\"><span style=\"font-family: 'calibri';font-size: 20pt\">Tambi&eacute;n llamado \"chupito\" o \"shooter\", es uno de los vasos m&aacute;s conocidos. Es el vaso m&aacute;s peque&ntilde;o y generalmente est&aacute; fabricado con vidrio grueso, sobretodo en la base. Est&aacute; dise&ntilde;ado para servir peque&ntilde;as cantidades de licores y otras bebidas que se consumen de un trago. <br><br>Su capacidad media es de &nbsp;1,5 oz (45 ml), aunque se puede encontrar una gran variedad de tama&ntilde;os. <br><br>Debido a su corta capacidad, tambi&eacute;n es usado en algunos casos como elemento de medida.</span></p>\r\n");
		GridBagConstraints gbc_descripcion = new GridBagConstraints();
		gbc_descripcion.gridwidth = 2;
		gbc_descripcion.fill = GridBagConstraints.BOTH;
		gbc_descripcion.gridx = 4;
		gbc_descripcion.gridy = 4;
		panelBaseShot.add(descripcion, gbc_descripcion);

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
		panelBaseShot.add(btnVolver, gbc_btnVolver);

		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelEleccion");
			}
		});

	}

}
