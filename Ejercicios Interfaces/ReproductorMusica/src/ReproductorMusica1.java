
public class ReproductorMusica1 implements ReproductorMusica {

    private String nombre;

    public ReproductorMusica1(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void reproducirMusica() {
        System.out.println("La musica se esta reproduciendo");

    }

    @Override
    public void pausarMusica() {
        System.out.println("La musica esta pausada");

    }

    @Override
    public void detenerMusica() {
        System.out.println("se ha detenido la reproduccion de la musica");

    }

    public String getNombre(){
        return nombre;
 }


}
