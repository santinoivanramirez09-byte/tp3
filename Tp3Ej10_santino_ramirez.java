package tp3.ej10_santino_ramirez;
import java.util.Scanner;
public class Tp3Ej10_santino_ramirez {
   
    public static void main(String[] args) {

           Scanner n = new Scanner(System.in);
        int p = 0;
        int m = 0;
        long t = 0;
        System.out.println("Ingrese el pago del primer mes.");
        do{
            p = n.nextInt();
            if (p <= 0){
                System.out.println("Ingresar un valor mayor a 0.");
            }
        }while (p <= 0);
        System.out.println("Ingrese por cuantos meses se pagara.");
        do{
            m = n.nextInt();
            if (m <= 0){
                System.out.println("Ingresar un valor mayor a 0.");
            }
        }while (m <= 0);
        t = t + p;
        for (int mt = 2; mt <= m; mt++){
            p = p * 2;
            t = t + p;
        }
        System.out.println("El total es de"+t+" pesos.");
    }
}

