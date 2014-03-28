import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;


public class Inicio extends JFrame {

	private JPanel contentPane;

	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBebeConModeracin = new JLabel("BEBE CON MODERACI\u00D3N");
		lblBebeConModeracin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBebeConModeracin.setBounds(46, 79, 378, 87);
		contentPane.add(lblBebeConModeracin);
	}

}
