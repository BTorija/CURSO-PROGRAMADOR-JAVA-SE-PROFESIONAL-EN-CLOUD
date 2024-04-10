package curso.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectorTeclado extends BufferedReader{
	public LectorTeclado() {
		super (new InputStreamReader(System.in)); //le añadimos el parámetro para que pueda leer en teclado
	}
	
	public String readString() {
		try {
			return readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public int readInt() {
		try {
			return Integer.parseInt(readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
		
	
	public double readDouble() {
		try {
			return Double.parseDouble(readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0.0;
		}
	}

}
