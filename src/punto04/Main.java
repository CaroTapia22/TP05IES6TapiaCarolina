package punto04;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);
     System.out.println("Ingrese un numero entre 1 y 9: ");
     int numero = sc.nextInt(); 
     System.out.println("La tabla del " + numero + " es: ");
      for (int i = 1; i<= 10; i++){ 
       int resultado = numero * i;
       System.out.println(numero + " x " + i + " = " + resultado);
      }
     sc.close();
   }
}
