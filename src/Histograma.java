import java.util.Scanner;
import java.util.LinkedList;
public class Histograma {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero = 1;
        LinkedList<Integer> numerosPos = new LinkedList<>();
        LinkedList<Integer> numerosNeg = new LinkedList<>();

        System.out.println("A continuación ingrese tantos números enteros como quiera. Al finalizar ingrese 0");

        while (numero != 0){
            System.out.println("Ingrese el número: ");
            numero = sc.nextInt();
            if (numero > 0){
                numerosPos.add(numero);
            }
            else if (numero < 0){
                numerosNeg.add(numero);
            }
        }

        System.out.print("Números positivos: ");
        for (int i = 0; i< numerosPos.size(); i ++ ){
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print("Números negativos: ");
        for (int i = 0; i< numerosNeg.size(); i ++ ){
            System.out.print("*");
        }
    }
}
