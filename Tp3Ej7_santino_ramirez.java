
package tp3.ej7_santino_ramirez;
import java.util.Scanner;

public class Tp3Ej7_santino_ramirez {

    public static void main(String[] args) {
 
  Scanner Millas = new Scanner(System.in);

        double m = 0;

        do{

            System.out.println("Ingrese las millas para convertirlas en kilometros (ingrese 0 para terminar el bucle)");

            m = Millas.nextInt();

            if(m == 0){

                break;
            }
            
            double km = m * 1.6093;

            System.out.println("KM = " + km);

        } while (m != 0);

        System.out.println("Terminando programa.");

    }

}
