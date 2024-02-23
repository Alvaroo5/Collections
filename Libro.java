package Ej41;

class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) throws NombreAutorInvalidoException {
        if (autor.contains("\\d")) {
            throw new NombreAutorInvalidoException("El nombre del autor no debe contener números.");
        }
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo + ": " + autor;   
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return titulo.equals(libro.titulo) && autor.equals(libro.autor);
    }

    @Override
    public int compareTo(Libro otroLibro) {
        return titulo.compareTo(otroLibro.titulo);
    }
}