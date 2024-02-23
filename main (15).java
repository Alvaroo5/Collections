package Ej31;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        // Crear un HashMap con clave Integer y valor String
        HashMap<Integer, String> hashMap = new HashMap<>();

        agregarPersona("46221877D", "Juan", hashMap);
        agregarPersona("12345678A", "Maria", hashMap);
        agregarPersona("98765432Z", "Pedro", hashMap);

        System.out.println("Elementos del HashMap:");
        for (Integer clave : hashMap.keySet()) {
            String valor = hashMap.get(clave);
            System.out.println(clave + " - " + valor);
        }
    }

    // Método para calcular la suma de los dígitos de un DNI y agregarlo al HashMap
    private static void agregarPersona(String dni, String nombre, HashMap<Integer, String> hashMap) {
        int sumaDigitos = calcularSumaDigitosDNI(dni);
        hashMap.put(sumaDigitos, nombre);
    }

    // Método para calcular la suma de los dígitos de un DNI
    private static int calcularSumaDigitosDNI(String dni) {
        int suma = 0;
        for (int i = 0; i < dni.length() - 1; i++) {
            suma += Character.getNumericValue(dni.charAt(i));
        }
        return suma;
    }
}
