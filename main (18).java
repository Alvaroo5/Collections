package Ej12;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        File archivo = new File("datos.txt");

        try {
            if (archivo.exists()) {
                new FileWriter(archivo, false).close();
            } else {
                archivo.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(archivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Nombre: " + nombre);
            bufferedWriter.newLine();
            bufferedWriter.write("Edad: " + edad);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Datos guardados correctamente en 'datos.txt'");
    }
}

