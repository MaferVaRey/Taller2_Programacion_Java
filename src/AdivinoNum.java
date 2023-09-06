import java.util.Scanner;
import java.util.Random;
import java.util.LinkedList;
public class AdivinoNum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int NumAleatorio = random.nextInt(100) + 1, contador = 0, intento = 0;
        LinkedList<Integer> Intentos = new LinkedList<>();

        System.out.println("El programa pensó un número. Intente adivinarlo en el menor número de intentos posibles");

        while (intento != NumAleatorio){

            contador ++;
            System.out.println("Intento "+ contador + ":");
            intento = sc.nextInt();
            Intentos.add(intento);

            if (intento > NumAleatorio){
                System.out.println("El número es menor que "+ intento);
            }
            else if (intento < NumAleatorio){
                System.out.println("El número es mayor que "+ intento);
            }
        }

        System.out.println("Felicitaciones, el número era: "+ NumAleatorio);
        System.out.println("Usted adivinó en "+ contador + " intentos");

        for (int i = 0; i < Intentos.size(); i++) {
            System.out.println("intento " + (i+1) + ": " + Intentos.get(i));
        }
    }
}