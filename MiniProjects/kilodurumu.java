package MiniProjects;

import java.util.Scanner;

public class kilodurumu { // kilo durumunu hesaplama
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        System.out.print("Lütfen kilonuzu giriniz: ");
        int kilo = scanner.nextInt();
  
        System.out.print("Lütfen boyunuzu giriniz: ");
        double boy = scanner.nextDouble();
  
        double bki = kilo / (boy * boy);
  
        if (bki < 18.5) {
           System.out.println("Zayıf");

        }
        else if (bki >= 18.5 && bki < 25) {
           System.out.println("Normal");

        }
        else if (bki >= 25 && bki < 30) {
           System.out.println("Fazla kilolu");

        }
        else {
           System.out.println("Obez");       
        
        }

   }

}