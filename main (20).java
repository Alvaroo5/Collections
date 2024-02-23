package Ej14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {

    public static void main(String[] args) {
        String nombreArchivo = "carta.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {

            int contadorCaracteres = 0;
            int contadorLineas = 0;
            int contadorPalabras = 0;

            String linea;
            while ((linea = br.readLine()) != null) {
                contadorLineas++;

                contadorCaracteres += linea.length();

                String[] palabras = linea.split(" ");
                contadorPalabras += palabras.length;
            }

            System.out.println("Caracteres: " + contadorCaracteres);
            System.out.println("Líneas: " + contadorLineas);
            System.out.println("Palabras: " + contadorPalabras);

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}