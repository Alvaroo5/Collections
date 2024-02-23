package Ej21;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
    	String nombreArchivo = "numero.bin";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero double: ");
        double numeroDouble = scanner.nextDouble();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(nombreArchivo))) {
            dos.writeDouble(numeroDouble);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo binario: " + e.getMessage());
        }

        System.out.println("Numero guardado exitosamente en el archivo binario.");

        scanner.close();
    }
}