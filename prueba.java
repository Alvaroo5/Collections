package Prueba;

import java.util.ArrayList;
import java.util.List;

public class prueba {

	public static void main(String[] arg) {
		List<Persona> lista = new ArrayList<Persona> ();
		
		lista.add(new Persona(1, "Alvaro", 30));
		lista.add(new Persona(2, "Manolo", 31));
		lista.add(new Persona(3, "Jesus", 32));
		lista.add(new Persona(4, "Dani", 33));
		
		for(int i = 0; i<lista.size(); i++) {
			System.out.println(lista.get(i).getNombre());
		}
		
		for(Persona perso:lista) {
			System.out.println(perso);
		}
		
	}
}
