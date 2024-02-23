package Ej22;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class main {

    public static void main(String[] args) {
        double numeroLeido = leerDouble();
        
        System.out.println("Numero leido desde el archivo binario: " + numeroLeido);
    }

    public static double leerDouble() {
        String nombreArchivo = "numero.bin";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(nombreArchivo))) {
            double numeroLeido = dis.readDouble();
            return numeroLeido;
        } catch (IOException e) {
            System.err.println("Error al leer desde el archivo binario: " + e.getMessage());
            return 0.0; // Otra forma de manejar el error, devuelve un valor predeterminado en caso de fallo.
        }
    }
}
