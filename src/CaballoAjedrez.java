import java.util.Scanner;
public class CaballoAjedrez {
    public static void main(String[] args){

        //Declaración de matriz, escaner y variables

        Scanner sc = new Scanner(System.in);
        int ejex, ejey, size = 8;
        boolean posicion;
        int[][] tablero = new int[size][size];

        do {
            //Toma de los datos del usuario
            posicion = true;
            System.out.println("Ingrese las coordenadas a en las que se encuentra el caballo");
            System.out.println("Fila (de 1 a 8): ");
            ejex = sc.nextInt();
            System.out.println("Columna (de 1 a 8): ");
            ejey = sc.nextInt();
            if (ejex > 8 || ejex < 1 || ejey > 8 || ejey < 1) {
                posicion = false;
                System.out.println("La posición es inválida (fuera del tablero 8 x 8)");
            }
        }while (!posicion);

        ejex -= 1;
        ejey -= 1;

        tablero[ejex][ejey]=2;

        if (ejex+2<=7 && ejex-2>=0 && ejey+2<=7 && ejey-2>=0){
            tablero[ejex+1][ejey+2]=1;
            tablero[ejex+2][ejey+1]=1;
            tablero[ejex+2][ejey-1]=1;
            tablero[ejex+1][ejey-2]=1;
            tablero[ejex-1][ejey-2]=1;
            tablero[ejex-2][ejey-1]=1;
            tablero[ejex-2][ejey+1]=1;
            tablero[ejex-1][ejey+2]=1;
        }
        else if(ejex+2>7){
            if (ejey+2>7){
                tablero[ejex-1][ejey-2]=1;
                tablero[ejex-2][ejey-1]=1;
            }
            else if(ejey-2<0){
                tablero[ejex-2][ejey+1]=1;
                tablero[ejex-1][ejey+2]=1;
            }
            else{
                tablero[ejex-1][ejey-2]=1;
                tablero[ejex-2][ejey-1]=1;
                tablero[ejex-2][ejey+1]=1;
                tablero[ejex-1][ejey+2]=1;
            }
        }
        else if(ejex-2<0){
            if(ejey-2<0){
                tablero[ejex+1][ejey+2]=1;
                tablero[ejex+2][ejey+1]=1;
            }
            else if(ejey+2>7){
                tablero[ejex+2][ejey-1]=1;
                tablero[ejex+1][ejey-2]=1;
            }
            else{
                tablero[ejex+1][ejey+2]=1;
                tablero[ejex+2][ejey+1]=1;
                tablero[ejex+2][ejey-1]=1;
                tablero[ejex+1][ejey-2]=1;
            }
        }

        if (ejey+2>7){
            if(ejex+2>7){
                tablero[ejex-1][ejey-2]=1;
                tablero[ejex-2][ejey-1]=1;
            }
            else if(ejex-2<0){
                tablero[ejex+2][ejey-1]=1;
                tablero[ejex+1][ejey-2]=1;

            }
            else {
                tablero[ejex+2][ejey-1]=1;
                tablero[ejex+1][ejey-2]=1;
                tablero[ejex-1][ejey-2]=1;
                tablero[ejex-2][ejey-1]=1;
            }
        }
        else if (ejey-2<0){
            if (ejex+2>7){
                tablero[ejex-2][ejey+1]=1;
                tablero[ejex-1][ejey+2]=1;
            }
            else if (ejex-2<0){
                tablero[ejex+1][ejey+2]=1;
                tablero[ejex+2][ejey+1]=1;
            }
            else {
                tablero[ejex+1][ejey+2]=1;
                tablero[ejex+2][ejey+1]=1;
                tablero[ejex-2][ejey+1]=1;
                tablero[ejex-1][ejey+2]=1;
            }
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        for (int i =0; i < size; i ++ ){
            for (int j =0; j < size; j ++ ){
                if (tablero[i][j]==1)
                    System.out.println("Fila: " + (i+1) + " columna: " + (j+1));
            }
        }
        System.out.println("El número 2 en el tablero representa la posición actual del caballo");
    }
}