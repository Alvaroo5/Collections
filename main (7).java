package Ej12;

import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        int[] numeros = new int[20];

        System.out.println("Lista original:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*100);
            System.out.print(numeros[i] + " ");
        }

        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        System.out.println("\nLista ordenada en sentido decreciente:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}

