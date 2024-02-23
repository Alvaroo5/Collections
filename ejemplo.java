package Prueba;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejemplo {

	public static void main(String[] arg) {
		String texto = "";
		/*
		try {
			FileReader in = new FileReader("C:\\PruebaFichero\\ejemplo.txt");
			
			int c = in.read();
			while (c != -1) {
				texto += (char) c;
				c = in.read();
			}
			in.close();
		}catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(texto);
		*/
		try {
			BufferedReader in = new BufferedReader(new FileReader("C:\\PruebaFichero\\ejemplo.txt"));
			String linea = in.readLine();
			while (linea != null) {
			texto += linea+"\n";
			linea = in.readLine();
			}
			in.close();
			} catch (IOException ex) {
			System.out.println(ex.getMessage());
			}
			System.out.println(texto);
	}
}