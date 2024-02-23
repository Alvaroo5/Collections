package Ej31;

public class main {

    public static void main(String[] args) {
        try {
            Cliente cliente1 = new Cliente(25);

        } catch (EdadInvalidaException e) {
            System.out.println("Error al crear el cliente: " + e.getMessage());
        }
    }
}
