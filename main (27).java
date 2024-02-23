package Ej23;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombreFichero = "numeros.bin";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(nombreFichero))) {
            System.out.println("Introduce números enteros positivos (introduce un número negativo para terminar):");

            int numero;
            do {
                System.out.print("Número: ");
                numero = scanner.nextInt();

                if (numero >= 0) {
                    dos.writeInt(numero);
                }

            } while (numero >= 0);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(nombreFichero)) {
            System.out.println("Números almacenados en el fichero:");

            while (true) {
                int numero = fis.read();
                System.out.println(numero);
            }

        } catch (EOFException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
