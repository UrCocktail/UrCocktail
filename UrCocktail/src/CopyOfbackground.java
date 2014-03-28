import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CopyOfbackground extends JFrame {

	int pgHorzontal;
	JViewport viewport;

	JButton btnIzquierda = new JButton("");
	JButton btnNewButton = new JButton("");


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CopyOfbackground frame = new CopyOfbackground();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CopyOfbackground() {

		pgHorzontal = 75;



		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 634);

		PanelImagen p = new PanelImagen("fondo2.jpg");
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		GridBagLayout gbl_p = new GridBagLayout();
		gbl_p.columnWidths = new int[]{127, 76, 546, 73, 111, 0};
		gbl_p.rowHeights = new int[]{144, 150, 52, 140, 0};
		gbl_p.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_p.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		p.setLayout(gbl_p);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\Coctelera\\Sin t\u00EDtulo-1mod.png"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		p.add(lblNewLabel, gbc_lblNewLabel);
		btnIzquierda.setIcon(new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\Portada urcocktail\\Nueva imagen (2).png"));

		//JButton btnIzquierda = new JButton("IZQUIERDA");
		btnIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				movePanel(-1, 0);				
			}
		});
		
		btnIzquierda.setOpaque(false);
		btnIzquierda.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnIzquierda.setFocusPainted(false);
		btnIzquierda.setBorder(null);
		btnIzquierda.setBorderPainted(false);
		btnIzquierda.setOpaque(false);
		//btnIzquierda.setBackground(Color.WHITE);
		btnIzquierda.setContentAreaFilled(false);
		
		GridBagConstraints gbc_btnIzquierda = new GridBagConstraints();
		gbc_btnIzquierda.insets = new Insets(0, 0, 0, 5);
		gbc_btnIzquierda.gridx = 0;
		gbc_btnIzquierda.gridy = 3;
		p.add(btnIzquierda, gbc_btnIzquierda);
		btnNewButton.setIcon(new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\Portada urcocktail\\Nueva imagen (3).png"));

		//JButton btnNewButton = new JButton("DERECHA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movePanel(1, 0);
			}
		});
		
		btnNewButton.setOpaque(false);
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setOpaque(false);
		//btnIzquierda.setBackground(Color.WHITE);
		btnNewButton.setContentAreaFilled(false);
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 3;
		p.add(btnNewButton, gbc_btnNewButton);

		/*JPanel panel = new JPanel();
		panel.setSize(1000, 100);
		panel.setOpaque(false);

	    JLabel lblHola = new JLabel("HOLA");
	    lblHola.setForeground(Color.WHITE);
	    lblHola.setFont(new Font("Tahoma", Font.BOLD, 25));
	    panel.add(lblHola);*/



		JPanel panel = new JPanel();
		panel.setOpaque(false);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		JLabel lblHola = new JLabel("");
		lblHola.setIcon(new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\Portada urcocktail\\colores_borde.png"));
		lblHola.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHola.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblHola = new GridBagConstraints();
		gbc_lblHola.insets = new Insets(0, 0, 5, 5);
		gbc_lblHola.gridx = 0;
		gbc_lblHola.gridy = 0;
		panel.add(lblHola, gbc_lblHola);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\Portada urcocktail\\licores_borde.png"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\Portada urcocktail\\tipos_borde.png"));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 0;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\Portada urcocktail\\todos_borde.png"));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 6;
		gbc_lblNewLabel_3.gridy = 0;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);


		viewport = new JViewport();
		viewport.setView(panel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\Portada urcocktail\\vasos_borde.png"));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 8;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);

		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\Portada urcocktail\\config_borde.png"));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 10;
		gbc_lblNewLabel_4.gridy = 0;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		viewport.setOpaque(false);

		viewport.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				enableButtons(CopyOfbackground.this.viewport.getViewPosition());
			}
		});


		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 3;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 3;
		p.add(viewport, gbc_panel);

		movePanel(0, 0);

	}


	protected void movePanel(int xmove, int ymove) {
		Point pt = viewport.getViewPosition();
		pt.x += pgHorzontal * xmove;
		pt.x = Math.max(0, pt.x);
		pt.x = Math.min(getMaxXExtent(), pt.x);
		viewport.setViewPosition(pt);
		enableButtons(pt);
	}

	protected void enableButtons(Point pt) {
		if (pt.x == 0)
			enableComponent(btnIzquierda, false);
		else
			enableComponent(btnIzquierda, true);

		if (pt.x >= getMaxXExtent())
			enableComponent(btnNewButton, false);
		else
			enableComponent(btnNewButton, true);
	}

	protected void enableComponent(JComponent c, boolean b) {
		if (c.isEnabled() != b)
			c.setEnabled(b);
	}

	protected int getMaxXExtent() {
		return viewport.getView().getWidth() - viewport.getWidth();
	}

}


/*class PanelImagen extends javax.swing.JPanel {
	public PanelImagen(){
		this.setSize(400,280);
	}
	@Override
	public void paintComponent (Graphics g){
		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\Portada urcocktail\\fondo.jpg");
		g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}
}*/