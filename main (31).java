package Ej28;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class main {

    public static void main(String[] args) {
        int[] numeros = generarNumerosAleatorios(10); 

        Arrays.sort(numeros);

        String nombreFichero = "numeros.bin";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(nombreFichero))) {
            dos.writeInt(numeros.length); 
            for (int numero : numeros) {
                dos.writeInt(numero);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Números aleatorios guardados en el archivo binario.");

        int[] numerosRecuperados = recuperarNumerosDesdeArchivo(nombreFichero);

        System.out.println("Números recuperados desde el archivo y ordenados de menor a mayor:");
        for (int numero : numerosRecuperados) {
            System.out.println(numero);
        }
    }

    private static int[] generarNumerosAleatorios(int cantidad) {
        Random random = new Random();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(100);
        }

        return numeros;
    }

    private static int[] recuperarNumerosDesdeArchivo(String nombreFichero) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(nombreFichero))) {
            int longitud = dis.readInt();
            int[] numerosRecuperados = new int[longitud];

            for (int i = 0; i < longitud; i++) {
                numerosRecuperados[i] = dis.readInt();
            }

            return numerosRecuperados;

        } catch (IOException e) {
            e.printStackTrace();
            return new int[0];
        }
    }
}
