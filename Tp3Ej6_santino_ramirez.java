package tp3.ej6_santino_ramirez;
import java.util.Scanner; 
public class Tp3Ej6_santino_ramirez {
   
    public static void main(String[] args) {

          
        Scanner aa = new Scanner(System.in);

        Scanner bb = new Scanner(System.in);
        
        int a = 0;

        int b = 0;

        int p = 0;


        System.out.println("Ingrese dos numeros y yo te diré los numeros pares que hay de por medio (el primero debe ser menor al segundo.)");

        do{

            System.out.println("primer numero:");

            a = aa.nextInt();

            System.out.println("segundo numero:");

            b = bb.nextInt();

            if ((a == b)||(a > b)){

                System.out.println("porfavor, vuelva a ingresar los numeros.");

            }

        }while ((a == b)||(a > b));

            System.out.println("Numeros pares del " + a + " al " + b + ".");

            while(a < b){

                a++;

                p = a % 2;

                if (p == 0){

                    System.out.println(a);

                }

            }

    }

}


