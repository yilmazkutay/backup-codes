package MyProjects.Calculator;

import java.util.Scanner;

public class simplecalculator {
   public static void main(String[] args) {
       
   Scanner scanner = new Scanner(System.in);
   scanner.close();

   String islemler = "1: Toplama\n"
                   + "2: Çıkarma\n"
                   + "3: Çarpma\n"
                   + "4: Bölme\n";

   System.out.println(islemler);

   while (true) {
      System.out.println("Lütfen işlemi seçiniz: ");
      String islem = scanner.nextLine();

    if (islem.equals("1")) {

       System.out.print("A: ");
       double A = scanner.nextDouble();
       System.out.print("B: ");
       double B = scanner.nextDouble();
       scanner.nextLine();

       System.out.println("Sonuç: " + (A+B));

    }
    else if (islem.equals("2")) {
        
       System.out.print("A: ");
       double A = scanner.nextDouble();
       System.out.print("B: ");
       double B = scanner.nextDouble();
       scanner.nextLine();

       System.out.println("Sonuç: " + (A-B));

    }
    else if (islem.equals("3")) {
        
        System.out.print("A: ");
        double A = scanner.nextDouble();
        System.out.print("B: ");
        double B = scanner.nextDouble();
        scanner.nextLine();
 
        System.out.println("Sonuç: " + (A*B));

     }
    else if (islem.equals("4")) {
        
        System.out.print("A: ");
        double A = scanner.nextDouble();
        System.out.print("B: ");
        double B = scanner.nextDouble();
        scanner.nextLine();
 
        System.out.println("Sonuç: " + (A/B));

    }
    else {
  
        System.out.println("Olmaz abi.");
         
    }

    }
   
   }

}