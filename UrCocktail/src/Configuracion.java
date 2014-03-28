import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;

public class Configuracion implements ActionListener{


	JPanel panelBaseConf = new JPanel();				//Panel base de la ventana
	JRadioButton radioButton1 = new JRadioButton("");	//Primer botón de elección
	JRadioButton radioButton2 = new JRadioButton("");	//Segundo botón de elección
	JComboBox desplegable;								//Lista desplegable
	JTextField entrada_texto = new JTextField();		//Cuadro de texto para entrada de texto
	JButton btnGuardar = new JButton("GUARDAR");		//Botón de "Guardar"
	JButton btnProbarConexion = new JButton("PROBAR CONEXI\u00D3N");	//Botón de "Probar Conexión"
	JLabel lblPuertoActual = new JLabel("Puerto actual:");
	JLabel lblNombrePuertoActual = new JLabel("");			//Etiqueta donde se muestra el puerto actual escogido
	static String puertoMostrado =new String();		//Nombre del puerto que se va a mostrar en la etiqueta anterior
	String puertoElegido = new String();		//Nombre del puerto elegido en el desplegable o introducido manualmente

	public Configuracion() {

		panelBaseConf.setBackground(Color.WHITE);

		Object[] items = { new ComboItem("--WINDOWS--",false), new ComboItem("COM2"),
				new ComboItem("COM3"), new ComboItem("COM4"), 
				new ComboItem("--LINUX--",false), new ComboItem("/dev/ttyUSB0"), 
				new ComboItem("/dev/ttyUSB1"), new ComboItem("/dev/ttyUSB2")};	//Elementos mostrados en el desplegable

		GridBagLayout gbl_panel = new GridBagLayout();			//Configuración del layout del panel base
		gbl_panel.columnWidths = new int[]{63, 30, 27, 82, 100, 150, 120, 111, 140, 0};
		gbl_panel.rowHeights = new int[]{20, 20, 11, 35, 20, 20, 27, 15, 20, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelBaseConf.setLayout(gbl_panel);


		JLabel lblConfiguracin = new JLabel("CONFIGURACI\u00D3N");							//Título
		lblConfiguracin.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		GridBagConstraints gbc_lblConfiguracin = new GridBagConstraints();
		gbc_lblConfiguracin.gridwidth = 6;
		gbc_lblConfiguracin.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblConfiguracin.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfiguracin.gridx = 1;
		gbc_lblConfiguracin.gridy = 1;
		panelBaseConf.add(lblConfiguracin, gbc_lblConfiguracin);

		JLabel iconousb = new JLabel("");										//Icono USB
		iconousb.setIcon(new ImageIcon(getClass().getResource("usblogo.png")));
		GridBagConstraints gbc_iconousb = new GridBagConstraints();
		gbc_iconousb.anchor = GridBagConstraints.WEST;
		gbc_iconousb.gridwidth = 2;
		gbc_iconousb.insets = new Insets(0, 0, 5, 5);
		gbc_iconousb.gridx = 2;
		gbc_iconousb.gridy = 3;
		panelBaseConf.add(iconousb, gbc_iconousb);

		JLabel lblPuertoUsb = new JLabel("PUERTO USB");				//Etiqueta "Puerto USB"
		lblPuertoUsb.setFont(new Font("Calibri", Font.BOLD, 30));
		GridBagConstraints gbc_lblPuertoUsb = new GridBagConstraints();
		gbc_lblPuertoUsb.gridwidth = 3;
		gbc_lblPuertoUsb.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblPuertoUsb.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuertoUsb.gridx = 4;
		gbc_lblPuertoUsb.gridy = 3;
		panelBaseConf.add(lblPuertoUsb, gbc_lblPuertoUsb);


		JLabel lblEscogerPuerto = new JLabel("Escoger:");			//Etiqueta "Escoger"
		lblEscogerPuerto.setFont(new Font("Calibri", Font.BOLD, 16));
		GridBagConstraints gbc_lblEscogerPuerto = new GridBagConstraints();
		gbc_lblEscogerPuerto.gridwidth = 2;
		gbc_lblEscogerPuerto.anchor = GridBagConstraints.WEST;
		gbc_lblEscogerPuerto.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscogerPuerto.gridx = 2;
		gbc_lblEscogerPuerto.gridy = 5;
		panelBaseConf.add(lblEscogerPuerto, gbc_lblEscogerPuerto);

		JLabel lblEscribirDeForma = new JLabel("Escribir de forma manual:");	//Etiqueta "Escribir de forma manual:"
		lblEscribirDeForma.setFont(new Font("Calibri", Font.BOLD, 16));
		GridBagConstraints gbc_lblEscribirDeForma = new GridBagConstraints();
		gbc_lblEscribirDeForma.gridwidth = 3;
		gbc_lblEscribirDeForma.anchor = GridBagConstraints.WEST;
		gbc_lblEscribirDeForma.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscribirDeForma.gridx = 2;
		gbc_lblEscribirDeForma.gridy = 8;
		panelBaseConf.add(lblEscribirDeForma, gbc_lblEscribirDeForma);

		radioButton1.setBackground(Color.WHITE);		//Primer botón de elección
		radioButton1.setSelected(true);
		GridBagConstraints gbc_radioButton1 = new GridBagConstraints();
		gbc_radioButton1.anchor = GridBagConstraints.SOUTHEAST;
		gbc_radioButton1.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton1.gridx = 2;
		gbc_radioButton1.gridy = 6;
		panelBaseConf.add(radioButton1, gbc_radioButton1);

		radioButton2.setBackground(Color.WHITE);		//Segundo botón de elección
		GridBagConstraints gbc_radioButton2 = new GridBagConstraints();
		gbc_radioButton2.anchor = GridBagConstraints.SOUTHEAST;
		gbc_radioButton2.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton2.gridx = 2;
		gbc_radioButton2.gridy = 9;
		panelBaseConf.add(radioButton2, gbc_radioButton2);

		ButtonGroup group = new ButtonGroup();		//Asociación de ambos botones de elección, de forma que sean excluyentes
		group.add(radioButton1);
		group.add(radioButton2);

		desplegable = new JComboBox(items);				//Creación del desplegable con los elementos definidos previamente
		desplegable.setRenderer(new ComboRenderer());
		GridBagConstraints gbc_desplegable = new GridBagConstraints();
		gbc_desplegable.gridwidth = 2;
		gbc_desplegable.anchor = GridBagConstraints.SOUTHWEST;
		gbc_desplegable.insets = new Insets(0, 0, 5, 5);
		gbc_desplegable.gridx = 3;
		gbc_desplegable.gridy = 6;
		panelBaseConf.add(desplegable, gbc_desplegable);

		entrada_texto.setColumns(10);		//Definición del cuadro de entrada de texto
		entrada_texto.setEnabled(false);
		GridBagConstraints gbc_entrada_texto = new GridBagConstraints();
		gbc_entrada_texto.gridwidth = 2;
		gbc_entrada_texto.anchor = GridBagConstraints.SOUTHWEST;
		gbc_entrada_texto.insets = new Insets(0, 0, 5, 5);
		gbc_entrada_texto.gridx = 3;
		gbc_entrada_texto.gridy = 9;
		panelBaseConf.add(entrada_texto, gbc_entrada_texto);

		GridBagConstraints gbc_guardar = new GridBagConstraints();		//Situación del botón "Guardar" dentro del panel base
		gbc_guardar.anchor = GridBagConstraints.SOUTH;
		gbc_guardar.insets = new Insets(0, 0, 5, 5);
		gbc_guardar.gridx = 5;
		gbc_guardar.gridy = 6;
		panelBaseConf.add(btnGuardar, gbc_guardar);

		GridBagConstraints gbc_btnProbarConexin = new GridBagConstraints();		//Situación del botón "Probar Conexión" dentro del panel base
		gbc_btnProbarConexin.insets = new Insets(0, 0, 5, 5);
		gbc_btnProbarConexin.gridx = 5;
		gbc_btnProbarConexin.gridy = 7;
		panelBaseConf.add(btnProbarConexion, gbc_btnProbarConexin);

		lblPuertoActual.setFont(new Font("Calibri", Font.BOLD, 16));		//Situación del botón "Guardar" dentro del panel base
		GridBagConstraints gbc_lblPuertoActual = new GridBagConstraints();
		gbc_lblPuertoActual.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblPuertoActual.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuertoActual.gridx = 6;
		gbc_lblPuertoActual.gridy = 6;
		panelBaseConf.add(lblPuertoActual,gbc_lblPuertoActual);

		lblNombrePuertoActual.setFont(new Font("Calibri", Font.BOLD, 15));		//Situación de la etiqueta "Puerto Actual:" dentro del panel base
		GridBagConstraints gbc_lblPuerto = new GridBagConstraints();
		gbc_lblPuerto.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblPuerto.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuerto.gridx = 7;
		gbc_lblPuerto.gridy = 6;
		panelBaseConf.add(lblNombrePuertoActual,gbc_lblPuerto);


		JButton btnVolver = new JButton("<html>&#8617;VOLVER</html>");		//Botón "Volver"
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) UrCocktail.panelBaseUrcocktail.getLayout();
				cardLayout.show(UrCocktail.panelBaseUrcocktail,"panelPrincipal");
				SwingUtilities.getWindowAncestor(UrCocktail.panelBaseUrcocktail).setSize(980, 635);
			}
		});
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
		gbc_btnVolver.gridx = 8;
		gbc_btnVolver.gridy = 1;
		panelBaseConf.add(btnVolver, gbc_btnVolver);


		radioButton1.addActionListener(this);			//Aplicación de listener a todos botones
		radioButton2.addActionListener(this);
		btnGuardar.addActionListener(this);
		btnProbarConexion.addActionListener(this);

		readTextFile();			//Se lee el contenido del fichero de cofiguración

		for(int i=0;i<items.length;i++){	//Si el contenido coincide con algún elemento del despleglable, éste queda seleccionado
			if(puertoMostrado.equals(desplegable.getItemAt(i).toString())){
				desplegable.setSelectedIndex(i);
			}
		}
		lblNombrePuertoActual.setText(puertoMostrado);		//Se muestra el contenido en la etiqueta "Nombre Puerto Actual"

	}

	//----------------------------------------------------------------------------//

	@Override
	public void actionPerformed(ActionEvent e) {		//Definición de los listener
		if(e.getSource()==btnGuardar){				//Listener del botón "Guardar"
			if(entrada_texto.isEnabled())				
				puertoElegido=entrada_texto.getText();	//Si el cuadro de texto está activo, guarda su contenido en el fichero
			else if(desplegable.isEnabled())
				puertoElegido =desplegable.getSelectedItem().toString();	//En cambio, si el desplegable está activo, guarda la opción elegida

			writeTextFile();	//Escribe el fichero
			readTextFile();		//Lee su contenido como comprobación
			lblNombrePuertoActual.setText(puertoMostrado);		//Muestra el contenido leído
		}

		else if(e.getSource()==radioButton1){	//Listener del primer botón
			entrada_texto.setEnabled(false);	//Desctiva el cuadro de texto
			desplegable.setEnabled(true);		//Activa el desplegable
		}

		else if(e.getSource()==radioButton2){	//Listener del segundo botón
			entrada_texto.setEnabled(true);		//Activa el cuadro de texto
			desplegable.setEnabled(false);		//Desactiva el desplegable
		}

		else if(e.getSource()==btnProbarConexion){		//Listener del botón "Probar Conexión"
			Cadena cadenatest=new Cadena();
		}
	}

	private void writeTextFile()	//Función para la escritura del fichero de configuración
	{
		try{
			FileWriter ostream=new FileWriter("config.txt");	//Abre un stream de escritura en fichero
			ostream.write(puertoElegido);						//Escribe la cadena a través del stream
			
			JOptionPane.showMessageDialog(null,"Configuración guardada", "Guardado",JOptionPane.INFORMATION_MESSAGE);	//Mensaje de confirmación
			ostream.close();	//Cierra el stream de escritura
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	private void readTextFile()		//Función para la lectura del fichero de configuración
	{
		try{
			BufferedReader inStream=new BufferedReader(new FileReader("config.txt"));	//Abre un stream de lectura
			String line=inStream.readLine();	//Lee la primera linea a través del stream

			while(line!=null)	//Mientras queden líneas por leer, continua leyendo
			{
				puertoMostrado=line;		//El puerto que se muestra se encuentra en la primera línea
				line=inStream.readLine();	
			}

			inStream.close();	//Cierra el stream de lectura
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}



	class ComboRenderer extends JLabel implements ListCellRenderer {	//Clase que implementa la creación del desplegable

		public ComboRenderer() {
			setOpaque(true);
			setBorder(new EmptyBorder(1, 1, 1, 1));
		}

		public Component getListCellRendererComponent(JList list, Object value,
				int index, boolean isSelected, boolean cellHasFocus) {
			if (isSelected) {
				setBackground(list.getSelectionBackground());
				setForeground(list.getSelectionForeground());
			} else {
				setBackground(list.getBackground());
				setForeground(list.getForeground());
			}
			if (!((CanEnable) value).isEnabled()) {
				setBackground(list.getBackground());
				setForeground(UIManager.getColor("Label.disabledForeground"));
			}
			setFont(list.getFont());
			setText((value == null) ? "" : value.toString());
			return this;
		}
	}

	class ComboItem implements CanEnable {		//Clase empleada para activar o desactivar los elementos del desplegable
		Object obj;

		boolean isEnable;

		ComboItem(Object obj, boolean isEnable) {
			this.obj = obj;
			this.isEnable = isEnable;
		}

		ComboItem(Object obj) {
			this(obj, true);
		}

		public boolean isEnabled() {
			return isEnable;
		}

		public void setEnabled(boolean isEnable) {
			this.isEnable = isEnable;
		}

		public String toString() {
			return obj.toString();
		}
	}
}

interface CanEnable {

	public void setEnabled(boolean isEnable);

	public boolean isEnabled();

}


