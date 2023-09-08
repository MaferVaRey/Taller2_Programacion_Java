import java.util.Scanner;
import java.util.Arrays;
public class Rango {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int tamano, rango;


        System.out.println("¿Cuantos datos serán ingresados?");
        tamano = sc.nextInt();
        double[] numeros = new double[tamano];
        int ArrayTamano = tamano - 1;

        for (int i = 0; i<tamano; i++){
            System.out.println("Ingrese el " + (i+1) + " número");
            numeros[i] = sc.nextDouble();
        }
        Arrays.sort(numeros);
        rango = (int) (numeros[ArrayTamano] - numeros[0]);

        System.out.println("El rango es: " + rango);
    }
}
