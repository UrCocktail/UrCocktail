import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class VasoMargarita{

	final JPanel panelBaseMargarita = new JPanel();

	public VasoMargarita() {

		panelBaseMargarita.setBackground(Color.WHITE);

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{63, 30, 130, 58, 300, 180, 0};
		gbl_panel.rowHeights = new int[]{20, 20, 11, 35, 193, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelBaseMargarita.setLayout(gbl_panel);

		JLabel titulo = new JLabel("COPA MARGARITA");
		titulo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		GridBagConstraints gbc_titulo = new GridBagConstraints();
		gbc_titulo.gridwidth = 4;
		gbc_titulo.anchor = GridBagConstraints.SOUTHWEST;
		gbc_titulo.insets = new Insets(0, 0, 5, 5);
		gbc_titulo.gridx = 1;
		gbc_titulo.gridy = 1;
		panelBaseMargarita.add(titulo, gbc_titulo);

		JLabel subtitulo = new JLabel("Aut\u00E9ntica elegancia ");
		subtitulo.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 18));
		GridBagConstraints gbc_subtitulo = new GridBagConstraints();
		gbc_subtitulo.gridwidth = 4;
		gbc_subtitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_subtitulo.insets = new Insets(0, 0, 5, 5);
		gbc_subtitulo.gridx = 1;
		gbc_subtitulo.gridy = 2;
		panelBaseMargarita.add(subtitulo, gbc_subtitulo);

		JLabel imagen = new JLabel("");
		imagen.setIcon(new ImageIcon(getClass().getResource("VasoMargarita.png")));
		GridBagConstraints gbc_imagen = new GridBagConstraints();
		gbc_imagen.anchor = GridBagConstraints.NORTH;
		gbc_imagen.insets = new Insets(0, 0, 0, 5);
		gbc_imagen.gridx = 2;
		gbc_imagen.gridy = 4;
		panelBaseMargarita.add(imagen, gbc_imagen);

		JEditorPane descripcion = new JEditorPane();
		descripcion.setEditable(false);
		descripcion.setContentType("text/html");
		descripcion.setText("<p style=\"text-align: justify;\"><span style=\"font-family: 'calibri';font-size: 20pt\">Esta copa, conocida tambi&eacute;n como copa Coupette, se emplea principalmente para servir Margaritas y Daiquiris. Posee una forma particular que la hace atractiva y con m&aacute;s personalidad. Generalmente, se decora el borde de la copa con az&uacute;car o glaseados. <br><br>Su capacidad oscila entre 7 y 12 oz (205 y 350 ml).</span></p>\r\n");
		GridBagConstraints gbc_descripcion = new GridBagConstraints();
		gbc_descripcion.gridwidth = 2;
		gbc_descripcion.fill = GridBagConstraints.BOTH;
		gbc_descripcion.gridx = 4;
		gbc_descripcion.gridy = 4;
		panelBaseMargarita.add(descripcion, gbc_descripcion);


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
		panelBaseMargarita.add(btnVolver, gbc_btnVolver);

		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelEleccion");
			}
		});

	}

}
