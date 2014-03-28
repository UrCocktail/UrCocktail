import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class background extends JFrame {
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
background frame = new background();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
public background() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 909, 634);
PanelImagen p = new PanelImagen("fondo.jpg");
p.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(p);
GridBagLayout gbl_p = new GridBagLayout();
gbl_p.columnWidths = new int[]{206, 604, 0};
gbl_p.rowHeights = new int[]{144, 150, 0, 0, 0};
gbl_p.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
gbl_p.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
p.setLayout(gbl_p);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\Coctelera\\Sin t\u00EDtulo-1mod.png"));
GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
gbc_lblNewLabel.gridx = 0;
gbc_lblNewLabel.gridy = 0;
p.add(lblNewLabel, gbc_lblNewLabel);
JPanel panel = new JPanel();
GridBagConstraints gbc_panel = new GridBagConstraints();
gbc_panel.fill = GridBagConstraints.BOTH;
gbc_panel.gridx = 1;
gbc_panel.gridy = 3;
p.add(panel, gbc_panel);
GridBagLayout gbl_panel = new GridBagLayout();
gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
gbl_panel.rowHeights = new int[]{0, 0, 0};
gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
panel.setLayout(gbl_panel);
JLabel lblHola = new JLabel("HOLA");
GridBagConstraints gbc_lblHola = new GridBagConstraints();
gbc_lblHola.insets = new Insets(0, 0, 0, 5);
gbc_lblHola.gridx = 2;
gbc_lblHola.gridy = 1;
panel.add(lblHola, gbc_lblHola);
JLabel lblNewLabel_1 = new JLabel("ADIOS");
GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
gbc_lblNewLabel_1.anchor = GridBagConstraints.ABOVE_BASELINE;
gbc_lblNewLabel_1.gridx = 9;
gbc_lblNewLabel_1.gridy = 1;
panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
JLabel lblNewLabel_2 = new JLabel("HASTA LUEGO");
GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
gbc_lblNewLabel_2.gridx = 16;
gbc_lblNewLabel_2.gridy = 1;
panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
}
}
