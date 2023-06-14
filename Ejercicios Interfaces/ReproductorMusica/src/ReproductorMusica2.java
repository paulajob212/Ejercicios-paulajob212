public class ReproductorMusica2 implements ReproductorMusica{

    private String nombre;

    public ReproductorMusica2(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reproducirMusica() {
        System.out.println("Se esta reproduciendo la musica");

    }

    @Override
    public void pausarMusica() {
        System.out.println("se ha pausado la musica");

    }

    @Override
    public void detenerMusica() {
        System.out.println("se ha detenido la reproduccion de la musica");

    }

    public String getNombre() {
        return nombre;
    }
}
