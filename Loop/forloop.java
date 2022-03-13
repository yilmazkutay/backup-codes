package Loop;

import java.util.Scanner;

public class forloop {
   public static void main(String[] args) {
       
   /*

   for (baslatma) ; koşul ; artırma veya azaltma islemleri {
       Döngü koşulumuz doğru olduğu sürece burası çalışacak.

   }

   */

   /*
    int i;

   for (i = 0; i < 5; i++) { // for (int i = 0; i < 5; i++)
        System.out.println("i = " + i); 

    }

   for (int k = 10; k >= 0; k--) {
         System.out.println("k = " + k);

    }

   */

    Scanner scanner = new Scanner(System.in);
    scanner.close();
   
    System.out.print("Bir sayı giriniz: ");

    int fakt = 1;

    int sayi = scanner.nextInt();

    for (int i = 1; i <= sayi; i++) {
      
        fakt *= i;

    }

    System.out.println("Faktoriyel = " + fakt);

   }
    
}