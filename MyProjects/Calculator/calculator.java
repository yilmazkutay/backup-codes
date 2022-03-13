package MyProjects.Calculator;

import java.util.Scanner;

public class calculator {

    public static int cikarma(int a, int b) {
       return a - b;
    }

    public static double bolme(int a, int b) {
       return (double) a / b;
    }

    public static int toplama(int a, int b) {
       return a + b;
    }

    public static int toplama(int a, int b, int c) {
       return a + b + c;
    }

    public static int carpma(int a, int b) {
       return a * b;
    }

    public static int carpma(int a, int b, int c) {
       return a * b * c;
    }

    public static void main(String[] args) {
        
       Scanner makine = new Scanner(System.in);
       makine.close();

        String islemler =  "1: Toplama\n"
                         + "2: Çıkarma\n"
                         + "3: Çarpma\n"
                         + "4: Bölme\n"
                         + "Çıkış için q'ya basın.";
   
        System.out.println(islemler);
 
     while (true) {

       System.out.println("Lütfen işlemi seçiniz: ");
       String islem = makine.nextLine();
 
       if (islem.equals("q")) {

          System.out.println("Sistemden çıkılıyor.");
          break;
       }
       else if (islem.equals("1")) {
 
          System.out.print("Kaç değer toplayacaksınız? (2 mi, 3 mü?): ");

          int kacsayi = makine.nextInt();

          if (kacsayi == 2) {
       
             System.out.print("a: ");
             int a = makine.nextInt();
             System.out.print("b: ");
             int b = makine.nextInt();     
             makine.nextLine();

             System.out.println("Sonuç: " + toplama(a, b));

          }
          else if (kacsayi == 3) {

             System.out.print("a: ");
             int a = makine.nextInt();
             System.out.print("b: ");
             int b = makine.nextInt();  
             System.out.print("c: ");     
             int c = makine.nextInt();
             makine.nextLine();

             System.out.println("Sonuç: " + toplama(a, b, c));

          }
          else {

             System.out.println("Böyle bir method bulunmamaktadır.");
          }
  
       }
       else if (islem.equals("2")) {
         
        System.out.print("a: ");
        int a = makine.nextInt();
        System.out.print("b: ");
        int b = makine.nextInt();     
        makine.nextLine();

        System.out.println("Sonuç: " + cikarma(a, b));

       }
       else if (islem.equals("3")) {
 
        System.out.print("Kaç değer çarpacaksınız? (2 mi, 3 mü?): ");

        int sayi = makine.nextInt();

        if (sayi == 2) {
     
           System.out.print("a: ");
           int a = makine.nextInt();
           System.out.print("b: ");
           int b = makine.nextInt();     
           makine.nextLine();

           System.out.println("Sonuç: " + carpma(a, b));

        }
        else if (sayi == 3) {

           System.out.print("a: ");
           int a = makine.nextInt();
           System.out.print("b: ");
           int b = makine.nextInt();  
           System.out.print("c: ");     
           int c = makine.nextInt();
           makine.nextLine();

           System.out.println("Sonuç: " + carpma(a, b, c));

        }
        else {

           System.out.println("Böyle bir method bulunmamaktadır.");
        }
     
    }                    
    else if (islem.equals("4")) {

      System.out.print("a: ");
      int a = makine.nextInt();
      System.out.print("b: ");
      int b = makine.nextInt();     
      makine.nextLine();

      System.out.println("Sonuç: " + bolme(a, b));

    }   
    
  }

 }

}