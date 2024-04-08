package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PruebaEscrituraAppend {

	public static void main(String[] args) {
		//String ruta="c:\\temp\\dias.txt";
		String ruta="dias.txt";
		//Forma clásica de hacerlo:
		/*FileOutputStream fos=null;
		PrintStream out=null;
		try {
			fos=new FileOutputStream(ruta, true);
			out=new PrintStream(fos);
			out.println("lunes");
			out.println("martes");
			out.println("miércoles");
			System.out.println("Información almacenada en el fichero");
			
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		//para evitar el finally con los try catch, declarar las variables fuera,... y asegurarse de que el sc se cierra añadieron e try con recursos en Java 7
		finally {
			try {
				if(fos!=null) {
					fos.close();
				}
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
			if(out!=null) {
				out.close();
			}
		}*/
		
		//con try con recursos:
		
				try(FileOutputStream fos=new FileOutputStream(ruta, true); //Entre los parentesis solo variables de objetos que se van a cerrar (.clouse)
						PrintStream out=new PrintStream(fos);){
					out.println("lunes");
					out.println("martes");
					out.println("miércoles");
					System.out.println("Información almacenada en el fichero");
				}
				catch(FileNotFoundException ex) {
					ex.printStackTrace();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
				
			}

		}
