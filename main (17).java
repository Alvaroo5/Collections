package Ej11;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String texto = "";
		String ruta = "";
		System.out.println("Introduce la ruta");
		ruta=sc.next();
		System.out.println();
		try {
			FileReader in = new FileReader("C:\\PruebaFichero\\"+ruta);
			
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
	}
}
