package Ej15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Set<Integer> numerosDistintos = new HashSet<>();

        Random random = new Random();
        while (numerosDistintos.size() < 20) {
            int numero = random.nextInt(100); // Números aleatorios menores que 100
            if (numerosDistintos.add(numero)) {
                numeros.add(numero);
            }
        }

        // Ordenar la lista en orden decreciente
        Collections.sort(numeros, Collections.reverseOrder());

        // Mostrar la colección por pantalla
        System.out.println("Colección de números en orden decreciente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
