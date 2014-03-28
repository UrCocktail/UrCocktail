import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


class PanelImagen extends javax.swing.JPanel {

	String fondo;

	public PanelImagen(String nombrefondo){
		fondo=nombrefondo;
		//this.setSize(400,280);
	}
	@Override
	public void paintComponent (Graphics g){
		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource(fondo));
		g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, this);

		setOpaque(false);
		super.paintComponent(g);
	}
}