import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

public class Tipos3 extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tipos3 frame = new Tipos3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tipos3() {


		setResizable(false);

		setTitle("LICORES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		final JPanel panelBase = new JPanel();

		setContentPane(panelBase);
		final CardLayout cl= new CardLayout();

		panelBase.setLayout(cl);


		JPanel Ingr = new JPanel();

		panelBase.add(Ingr, "Ingredientes");



		Ingr.setBackground(Color.WHITE);
		Ingr.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("20px"),
				ColumnSpec.decode("90px"),
				ColumnSpec.decode("75px"),
				ColumnSpec.decode("113px"),
				ColumnSpec.decode("73px"),
				ColumnSpec.decode("82px"),
				ColumnSpec.decode("100px"),
				ColumnSpec.decode("240px"),},
			new RowSpec[] {
				RowSpec.decode("15px"),
				RowSpec.decode("60px"),
				RowSpec.decode("23px"),
				RowSpec.decode("400px"),}));




		JLabel lblColores = new JLabel("<html><u>TIPO DE C\u00D3CTEL&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</u></html> ");
		lblColores.setFont(new Font("Champagne & Limousines", Font.BOLD | Font.ITALIC, 50));
		Ingr.add(lblColores, "2, 2, 7, 1, fill, fill");

		JLabel lblNewLabel = new JLabel("Un c\u00F3ctel para cada momento ...");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 20));
		Ingr.add(lblNewLabel, "2, 3, 7, 1, fill, fill");



		final JButton button = new JButton("");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setBorder(BorderFactory.createEmptyBorder());
	/*	button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoCaribe caribe = new TipoCaribe();
				caribe.setVisible(true);				
			}
		});*/

		final JButton btnNewButton = new JButton("");
		

		btnNewButton.setBorder(BorderFactory.createEmptyBorder());

	/*	btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoTropical tropical = new TipoTropical();
				tropical.setVisible(true);						
			}
		});*/

		btnNewButton.setIcon(new ImageIcon(getClass().getResource("tipo1-1.png")));
		//btnNewButton.setRolloverIcon(new ImageIcon(getClass().getResource("Vodka3.png")));

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
		Ingr.add(btnNewButton, "4, 4, right, fill");


		button.setIcon(new ImageIcon(getClass().getResource("tipo2-1.png")));
		//button.setRolloverIcon(new ImageIcon(getClass().getResource("Ginebra3.png")));

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
		Ingr.add(button, "5, 4, fill, fill");

		final JButton button_1 = new JButton("");
	/*	button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoClasico clasico = new TipoClasico();
				clasico.setVisible(true);	
			}
		});*/
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
		Ingr.add(button_1, "6, 4, fill, fill");

		final JButton button_2 = new JButton("");
		/*button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoElegante elegante = new TipoElegante();
				elegante.setVisible(true);	
			}
		});*/
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
		Ingr.add(button_2, "7, 4, left, fill");


		
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
		
		
	}

}

