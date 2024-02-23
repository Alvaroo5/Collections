package Ej41;

public class main {
	public static void main(String[] args) {
        RegistroLibros registro = new RegistroLibros(5);

        System.out.println("Añadir libros al registro:");
        System.out.println(registro.añadirLibro("Don Quijote", "Miguel de Cervantes"));
        System.out.println(registro.añadirLibro("Java Programming", "John Doe"));
        System.out.println(registro.añadirLibro("El código Da Vinci", "Dan Brown"));

        System.out.println("Buscar libro en el registro:");
        System.out.println(registro.buscaLibro("Java"));
    }

}
