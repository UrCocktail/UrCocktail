import java.io.*;
import java.util.*;
import javax.swing.*;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;


public class Cadena{

	SerialPort serialPort;		//Puerto serie

	private final String PUERTO=Configuracion.puertoMostrado;		//Nombre del puerto usado tomado de la clase Configuracion

	private static OutputStream output=null;	//Stream de salida a trav�s del puerto

	private static final int TIMEOUT=2000;		//Milisegundos de bloqueo hasta la apertura del puerto

	private static final int DATA_RATE=9600;	//Bits por segundo por defecto para el puerto

	static CommPortIdentifier puertoID=null;	//Nombre del puerto


	Cadena(){	//Constructor de la clase...

		inicializarConexion();	//... que inicializa la conexi�n
	}

 
	public void inicializarConexion(){	//M�todo para inicializar la conexi�n a traves del puerto 

		puertoID=null;	//Variable que identifica el puerto
		
		Enumeration puertoEnum=CommPortIdentifier.getPortIdentifiers();		//Lista de puertos del ordenador

		while(puertoEnum.hasMoreElements()){	//Bucle para la detecci�n del puerto en uso
			CommPortIdentifier actualPuertoID=(CommPortIdentifier) puertoEnum.nextElement();
			if(PUERTO.equals(actualPuertoID.getName())){
				puertoID=actualPuertoID;
				break;
			}
		}

		if (puertoID == null) {		//Se comprueba si el puerto ha sido detectado y se muestra un mensaje
			JOptionPane.showMessageDialog(null, "No se encuentra el puerto de conexi�n.", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
		} else{
			JOptionPane.showMessageDialog(null, "Puerto de conexi�n encontrado.", null, JOptionPane.INFORMATION_MESSAGE);	
		}

		try{
			serialPort = (SerialPort) puertoID.open(this.getClass().getName(), TIMEOUT);	//Apertura del puerto

			serialPort.setSerialPortParams(DATA_RATE,				//Par�metros del puerto serie
					SerialPort.DATABITS_8,
					SerialPort.STOPBITS_1,
					SerialPort.PARITY_NONE); 

			output = serialPort.getOutputStream();

		}catch(Exception e){
			System.err.println(e.toString());
		}
	}

	
	static public synchronized void enviarDatos(String datos){	//M�todo para el envio de datos por el puerto
		try {
			if (puertoID == null) {		//Se comprueba de neuvo si el puerto ha sido detectado y en caso contrario se muestra un mensaje de error
				JOptionPane.showMessageDialog(null, "No se encuentra el puerto de conexi�n.", "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			else{
				output.write(datos.getBytes());		//Escritura en el Stream de salida
			}


		} catch(Exception e){
			System.err.println(e.toString());
		}
	}

 
	public synchronized void close() {	//M�todo para cerrar el puerto
		if (serialPort != null) {
			serialPort.removeEventListener();
			serialPort.close();
		}
	}


}
