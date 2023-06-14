// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Tortuga tortugaBlanca = new Tortuga(nombre "Blanca");
        Tortuga tortugaAzul = new Tortuga(nombre "Azul");
        Tortuga tortugaCafe = new Tortuga(nombre "Cafe");

        Tortuga lista[] = new Tortuga[3]
        lista[0]=tortugaBlanca;
        lista[1]=tortugaAzul;
        lista[2]=tortugaCafe;

        Tortuguero tortuguero = new Tortuguero(descripcion: "Variedad de tortugas marinas");
        tortuguero.setLista(lista);

    }
}