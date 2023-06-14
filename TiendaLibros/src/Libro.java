public class Libro implements Mostrable, Vendible {

    private String titulo;
    private String autor;
    private double precioLibro;

    public Libro(String titulo, String autor, double precioLibro){
        this.titulo = titulo;
        this.autor = autor;
        this.precioLibro = precioLibro;

    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Titulo: [ " + titulo + "] autor: [" + autor + "] precio: [" + precioLibro + "]");

    }

    @Override
    public double obtenerPrecio() {
        return precioLibro;
    }


}
