import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VasoPilsner{


	final JPanel panelBasePilsner = new JPanel();

	public VasoPilsner() {

		panelBasePilsner.setBackground(Color.WHITE);

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{63, 30, 130, 58, 300, 250, 0};
		gbl_panel.rowHeights = new int[]{20, 20, 11, 35, 193, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelBasePilsner.setLayout(gbl_panel);

		JLabel titulo = new JLabel("VASO PILSNER");
		titulo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		GridBagConstraints gbc_titulo = new GridBagConstraints();
		gbc_titulo.gridwidth = 4;
		gbc_titulo.anchor = GridBagConstraints.SOUTHWEST;
		gbc_titulo.insets = new Insets(0, 0, 5, 5);
		gbc_titulo.gridx = 1;
		gbc_titulo.gridy = 1;
		panelBasePilsner.add(titulo, gbc_titulo);

		JLabel subtitulo = new JLabel("No s\u00F3lo para cerveza ");
		subtitulo.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 18));
		GridBagConstraints gbc_subtitulo = new GridBagConstraints();
		gbc_subtitulo.gridwidth = 4;
		gbc_subtitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_subtitulo.insets = new Insets(0, 0, 5, 5);
		gbc_subtitulo.gridx = 1;
		gbc_subtitulo.gridy = 2;
		panelBasePilsner.add(subtitulo, gbc_subtitulo);

		JLabel imagen = new JLabel("");
		imagen.setIcon(new ImageIcon(getClass().getResource("VasoPilsner.png")));
		GridBagConstraints gbc_imagen = new GridBagConstraints();
		gbc_imagen.anchor = GridBagConstraints.NORTH;
		gbc_imagen.insets = new Insets(0, 0, 0, 5);
		gbc_imagen.gridx = 2;
		gbc_imagen.gridy = 4;
		panelBasePilsner.add(imagen, gbc_imagen);

		JEditorPane descripcion = new JEditorPane();
		descripcion.setEditable(false);
		descripcion.setContentType("text/html");
		descripcion.setText("<p style=\"text-align: justify;\"><span style=\"font-family: 'calibri';font-size: 20pt\">Vaso largo y ancho de forma c&oacute;nica, muy atractivo, que se utiliza pr&aacute;cticamente en la gran mayor&iacute;a de los casos para servir cerveza, aunque tambi&eacute;n se utiliza para preparar algunos c&oacute;cteles. Su base es gruesa y resistente, siendo el peso de este vaso algo mayor que el resto. <br><br>Su capacidad oscila entre 10 y 16 oz (200 y 475ml).</span></p>\r\n");
		GridBagConstraints gbc_descripcion = new GridBagConstraints();
		gbc_descripcion.gridwidth = 2;
		gbc_descripcion.fill = GridBagConstraints.BOTH;
		gbc_descripcion.gridx = 4;
		gbc_descripcion.gridy = 4;
		panelBasePilsner.add(descripcion, gbc_descripcion);

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
		panelBasePilsner.add(btnVolver, gbc_btnVolver);

		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelEleccion");
			}
		});
	}

}
