package Ej16;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {

    public static void main(String[] args) {
    	String archivo = "firmas.txt";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Mostrar libro de firmas");
            System.out.println("2. Insertar nuevo nombre");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                	try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                        String linea;
                        System.out.println("Libro de Firmas:");
                        while ((linea = br.readLine()) != null) {
                            System.out.println(linea);
                        } 
                    } catch (IOException e) {
                        System.err.println("Error al leer el archivo de firmas: " + e.getMessage());
                    };
                    break;
                case 2:
                	System.out.print("Ingrese un nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();

                    if (existeNombreEnLibroDeFirmas(nuevoNombre)) {
                        System.out.println("Este nombre ya existe en el libro de firmas. No se agregará.");
                        return;
                    }

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
                        bw.write(nuevoNombre);
                        bw.newLine();
                        System.out.println("Nombre agregado con exito.");
                    } catch (IOException e) {
                        System.err.println("Error al escribir en el archivo de firmas: " + e.getMessage());
                    };
                    break;
                case 3:
                    System.out.println("Saliendo de la aplicacion.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida. Intentelo de nuevo.");
            }
        }
    }

    private static boolean existeNombreEnLibroDeFirmas(String nombre) {
        String archivo = "firmas.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(archivo ))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.equalsIgnoreCase(nombre)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de firmas: " + e.getMessage());
        }
        return false;
    }
}
