package Ej25;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class main {

    public static void main(String[] args) {
        String nombreFichero = "numeros.bin";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(nombreFichero))) {
            int n = dis.readInt();

            double[] numeros = new double[n];

            for (int i = 0; i < n; i++) {
                numeros[i] = dis.readDouble();
            }

            System.out.println("Contenido de la tabla:");
            for (int i = 0; i < n; i++) {
                System.out.println(numeros[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
