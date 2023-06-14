public class Carro {

    private int numllantas;
    private int numMotores,

    public Carro(int numLlantas, int numMotores){
        this.numLlantas = numLlantas;
        this.numMotores = nuMotores;
    }

    public boolean esConstruible(){
        return numLlantas == 4 && numMotores == 1;

    }

    public static void main()
}
