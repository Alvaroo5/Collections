package Ej31;

public class Cliente {

    private int edad;

    public Cliente(int edad) throws EdadInvalidaException {
        if (edad < 18) {
            throw new EdadInvalidaException("No se pueden crear clientes menores de 18 años.");
        } else if (edad < 0 || edad > 100) {
            throw new EdadInvalidaException("La edad del cliente debe estar entre 0 y 100 años.");
        }

        this.edad = edad;
    }
}
