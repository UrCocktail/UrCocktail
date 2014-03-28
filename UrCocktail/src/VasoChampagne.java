import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VasoChampagne{

	JPanel panelBaseChampagne = new JPanel();

	public VasoChampagne() {

		panelBaseChampagne.setBackground(Color.WHITE);

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{63, 30, 130, 58, 300, 250, 0};
		gbl_panel.rowHeights = new int[]{20, 20, 11, 35, 193, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelBaseChampagne.setLayout(gbl_panel);

		JLabel lbltitulo = new JLabel("COPA PARA CHAMPAGNE");
		lbltitulo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		GridBagConstraints gbc_lblVasoCollins = new GridBagConstraints();
		gbc_lblVasoCollins.gridwidth = 4;
		gbc_lblVasoCollins.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblVasoCollins.insets = new Insets(0, 0, 5, 5);
		gbc_lblVasoCollins.gridx = 1;
		gbc_lblVasoCollins.gridy = 1;
		panelBaseChampagne.add(lbltitulo, gbc_lblVasoCollins);

		JLabel lblsubtitulo = new JLabel("Nada entre burbujas ");
		lblsubtitulo.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		panelBaseChampagne.add(lblsubtitulo, gbc_lblNewLabel);

		JLabel imagen = new JLabel("");
		imagen.setIcon(new ImageIcon(getClass().getResource("VasoChampagne.png")));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.NORTH;
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 4;
		panelBaseChampagne.add(imagen, gbc_label);

		JEditorPane descripcion = new JEditorPane();
		descripcion.setEditable(false);
		descripcion.setContentType("text/html");
		descripcion.setText("<p style=\"text-align: justify;\"><span style=\"font-family: 'calibri';font-size: 20pt\">Copa delgada con pie alto. Ideal para vinos espumantes y c&oacute;cteles con champagne como Bellini o Mimosa. La forma alargada de la copa permite mantener las burbujas en la copa por mayor tiempo, evitando que la bebida se convierta en un c&oacute;ctel sin efervescencia. Se aconseja enfriar la copa antes de usarla. <br><br>Su capacidad usualmente oscila entre 6 y 10 oz. (180 y 300 ml), aunque existen otros tama&ntilde;os.</span></p>\r\n");

		GridBagConstraints gbc_descripcion = new GridBagConstraints();
		gbc_descripcion.gridwidth = 2;
		gbc_descripcion.fill = GridBagConstraints.BOTH;
		gbc_descripcion.gridx = 4;
		gbc_descripcion.gridy = 4;
		panelBaseChampagne.add(descripcion, gbc_descripcion);

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
		panelBaseChampagne.add(btnVolver, gbc_btnVolver);

		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelEleccion");
			}
		});

	}

}
