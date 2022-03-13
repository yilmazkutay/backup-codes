package Comparasion;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
    
     // scanner, input almak için kullanılır.

       Scanner scanner = new Scanner(System.in);
       scanner.close();

       System.out.println("Lütfen Yaşınızı Girin:");

       int age = scanner.nextInt();

       System.out.println("Yaşınız: " + age);

       /*
       System.out.println("Lütfen sayı giriniz:");
 
       double number = scanner.nextDouble();

       System.out.println("Yaşınız " + number);
       */

       /*
       System.out.println("Lütfen yazı giriniz:");

       String yazi = scanner.nextLine();
        
       System.out.println("Yazı: " + yazi);
       */

       /*
       if (scanner.hasNextInt()) {
        int sayi = scanner.nextInt(); 
        System.out.println("Sayı: " + sayi);

       }

       else {
        System.out.println("Lütfen bir sayı giriniz!");

       }
       */

    }

}