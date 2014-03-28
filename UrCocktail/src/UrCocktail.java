import java.awt.*;

import javax.swing.*;

public class UrCocktail extends JPanel{

	final static JPanel panelBaseUrcocktail = new JPanel();
	final JPanel panelPrincipal = new JPanel();
	final JPanel panelEleccion = new JPanel();
	final JPanel panelLista = new JPanel();
	final JPanel panelCoctel = new JPanel();
	final CardLayout clClasGen= new CardLayout();

	ColorRojo colorrojo=new ColorRojo();
	ColorAzul colorazul=new ColorAzul();
	ColorBlanco colorblanco=new ColorBlanco();
	ColorNaranja colornaranja=new ColorNaranja();
	ColorCola colorcola=new ColorCola();

	LicorVodka licorvodka=new LicorVodka();
	LicorGinebra licorginebra=new LicorGinebra();
	LicorRon licorron=new LicorRon();
	LicorTequila licortequila=new LicorTequila();

	TipoTropical tipotropical = new TipoTropical();
	TipoCaribe tipocaribe = new TipoCaribe();
	TipoClasico tipoclasico = new TipoClasico();
	TipoElegante tipoelegante = new TipoElegante();

	Todos todos=new Todos();

	VasoChampagne vasochampagne=new VasoChampagne();
	VasoCollins vasocollins=new VasoCollins();
	VasoHighball vasohighball=new VasoHighball();
	VasoHuracan vasohuracan=new VasoHuracan();
	VasoMargarita vasomargarita=new VasoMargarita();
	VasoMartini vasomartini=new VasoMartini();
	VasoOldFashioned vasooldfashioned=new VasoOldFashioned();
	VasoPilsner vasopilsner=new VasoPilsner();
	VasoShot vasoshot=new VasoShot();
	VasoVino vasovino=new VasoVino();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	


	public UrCocktail() {
	}

	public UrCocktail(String titulo) {

		JFrame ventana = new JFrame();

		ventana.setResizable(false);
		ventana.setTitle(titulo);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setBounds(100, 100, 980, 640);

		ventana.setContentPane(panelBaseUrcocktail);
		ventana.setVisible(true);

		panelBaseUrcocktail.setLayout(clClasGen);

		panelBaseUrcocktail.add(panelPrincipal,"panelPrincipal");
		panelBaseUrcocktail.add(panelEleccion,"panelEleccion");
		panelBaseUrcocktail.add(panelLista,"panelLista");
		panelBaseUrcocktail.add(panelCoctel,"panelCoctel");

		panelLista.setBackground(Color.WHITE);

	}

}
