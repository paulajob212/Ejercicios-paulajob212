import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Se declara el Scanner
        int numero1;
        int numero2;


        System.out.println("Comparación de dos números");
        System.out.println("");

        System.out.println("Ingrese el primer número");
        numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        numero2 = scanner.nextInt();


        if (numero1 > numero2){
            System.out.println("El número 1 es mayor al número 2");

        }else if (numero2 > numero1) {
            System.out.println("El número 2 es mayor que el número 1");

        } else {
            System.out.println("Los numeros son iguales");

        }

    }
}