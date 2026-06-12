package tp3.ej3_santino_ramirez;
import java.util.Scanner;

public class Tp3Ej3_santino_ramirez {

    public static void main(String[] args) {

               Scanner teclado = new Scanner(System.in);
       System.out.println("Ingresa un numero : ");
       int contador = teclado.nextInt();
       while (contador >= 1){
               
           System.out.println("Contador = " + contador);
           contador = contador - 1;
               
       }
    }   
}

