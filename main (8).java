package Ej13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class main {
	public static void main(String[] arg) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		
		for(int i = 0; i < 20; i++) {
			int numero = random.nextInt(10);
			numeros.add(numero);
		}
		
		Collections.sort(numeros, Collections.reverseOrder());
		
		for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            System.out.println(numero);
        }
	}
}
