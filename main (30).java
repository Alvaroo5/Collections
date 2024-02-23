package Ej27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        String nombreFichero = "frase.bin";

        try (FileOutputStream fos = new FileOutputStream(nombreFichero)) {
            byte[] bytes = frase.getBytes();
            fos.write(bytes);
            System.out.println("Frase guardada en el archivo binario correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(nombreFichero)) {
            byte[] bytes = fis.readAllBytes();
            String fraseRecuperada = new String(bytes);
            System.out.println("Frase recuperada desde el archivo binario:");
            System.out.println(fraseRecuperada);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
