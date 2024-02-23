package Ej14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		
		System.out.println("Introduce una frase de palabras separadas por espacios");
		frase=sc.nextLine();
		
		List<String> palabras = new ArrayList<>();
        String[] palabrasArray = frase.split(" ");
        for (String palabra : palabrasArray) {
            palabras.add(palabra);
        }
        
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();
        for (String palabra : palabras) {
            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }
        
        System.out.println("Palabras repetidas:");
        for (Map.Entry<String, Integer> entry : frecuenciaPalabras.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

        // Mostrar palabras no repetidas
        System.out.println("Palabras no repetidas:");
        for (String palabra : palabras) {
            if (frecuenciaPalabras.get(palabra) == 1) {
                System.out.println(palabra);
            }
        }
	}
}
