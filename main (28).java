package Ej24;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un entero n: ");
        int n = scanner.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        String nombreFichero = "numeros.bin";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(nombreFichero))) {
            dos.writeInt(n);

            for (int i = 0; i < n; i++) {
                dos.writeDouble(numeros[i]);
            }

            System.out.println("Datos guardados en el archivo binario correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
