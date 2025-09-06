package punto03;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) throws Exception{
     Scanner sc = new Scanner(System.in);

     System.out.println("Ingrese un número entre 0 y 10: ");
     int numero = sc.nextInt();

       int factorial = 1;
       int i = numero;
     if (numero<0 || numero>10) {
        System.out.println("El numero esta fuera de rango");
     }else {
          if (numero==0){
           factorial = 1 ;
          }else{
            while (i>=1) {
             factorial *= i;
             i--;
            }
           }
          System.out.println("El factorial de " + numero + " es: " + factorial);
          }
          
      sc.close();
     }
}
