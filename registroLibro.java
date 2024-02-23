package Ej41;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class RegistroLibros {
    private Libro[] tablaLibros;
    private int numLibrosRegistrados;

    public RegistroLibros(int numMaxLibros) {
        tablaLibros = new Libro[numMaxLibros];
        numLibrosRegistrados = 0;
    }

    public boolean añadirLibro(String titulo, String autor) {
        try {
            Libro nuevoLibro = new Libro(titulo, autor);
            if (numLibrosRegistrados < tablaLibros.length) {
                tablaLibros[numLibrosRegistrados++] = nuevoLibro;
                return true;
            } else {
                return false;
            }
        } catch (NombreAutorInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean buscaLibro(String titulo) {
        for (Libro libro : tablaLibros) {
            if (libro != null && libro.toString().contains(titulo)) {
                return true;
            }
        }
        return false;
    }
    
}
