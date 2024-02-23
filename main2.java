package Ej13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class main2 {
    public static void main(String[] args) {
        System.out.print("Ingrese el nombre del archivo fuente: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String nombreArchivoFuente = br.readLine();

            String nombreArchivoDestino = "copia_de_" + nombreArchivoFuente;

            try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivoFuente));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivoDestino))) {

                String linea;
                while ((linea = reader.readLine()) != null) {
                    writer.write(linea);
                    writer.newLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("El archivo se ha duplicado exitosamente con el prefijo 'copia_de'");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
