public class Main {
    public static void main(String[] args) {

        //crear dos reproductores de musica

        ReproductorMusica1 fmstereo = new ReproductorMusica1("fmstereo");
        ReproductorMusica2 caracolStereo = new ReproductorMusica2("caracolStereo");

        //muestra por pantalla el funcionamiento de los metodos

        System.out.println(fmstereo.getNombre());
        fmstereo.reproducirMusica();
        fmstereo.pausarMusica();
        fmstereo.detenerMusica();
        System.out.println("");

        System.out.println(caracolStereo.getNombre());
        caracolStereo.reproducirMusica();
        caracolStereo.pausarMusica();
        caracolStereo.detenerMusica();



        }
    }
