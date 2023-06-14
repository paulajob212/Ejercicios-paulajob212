import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        //crea dos instancias de la clase libro con diferentes titulos autores y precios.

        Libro libro1 = new Libro ("cien años de soledad", "Gabriel garcia marquez", 100000);
        Libro libro2 = new Libro ("cualquier libro", "cualquier autor", 50000);

        libro1.mostrarInformacion();
        System.out.println("el libro cuesta: " + libro1.obtenerPrecio());

        libro2.mostrarInformacion();
        System.out.println("el libro cuesta: " + libro2.obtenerPrecio());
    }
}