package MyProjects;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
      
    Scanner atm = new Scanner(System.in);   
    Scanner yatscanner = new Scanner(System.in);
    Scanner cekscanner = new Scanner(System.in);
    Scanner iban =  new Scanner(System.in);
    Scanner havale = new Scanner(System.in);
    
    atm.close();
    yatscanner.close();
    cekscanner.close();
    iban.close();
    havale.close();
    
    int i = 0; // i: bakiye
    
    i = (int)(Math.random()*10000)+1;

    System.out.println("Bakiye: " + i + " $");

    String islemler = "1: Para yatırma\n" 
                    + "2: Para çekme\n"
                    + "3: Havale işlemi\n";

    System.out.println(islemler);

    System.out.print("Hangi işlemi yapmak istersiniz?: ");                
 
    int islem = atm.nextInt();

    if (islem == 1) {

       System.out.println("Ne kadar yatırmak istiyorsunuz?: (100-500 arası)");
       int yatirma = yatscanner.nextInt();

       if (yatirma == 100) {

         System.out.println("Bakiye: " + (i + 100));

       }
       else if (yatirma == 250) {

         System.out.println("Bakiye: " + (i + 250));

       }
       else if (yatirma == 500) {

         System.out.println("Bakiye: " + (i + 500));
 
       }
       else {

         System.out.println("Maalesef, maksimum limiti geçtiniz.");

       }
    }

    else if (islem == 2) {

       System.out.println("Ne kadar çekmek istiyorsunuz?: ");
       int cekme = cekscanner.nextInt();

       if (cekme == 100) {

         System.out.println("Bakiye: " + (i - 100));

       }
       else if (cekme == 250) {
         System.out.println("Bakiye: " + (i - 250));

       }
       else if (cekme == 500) {

         System.out.println("Bakiye: " + (i - 500));

       }
       else {

        System.out.println("Maalesef, maksimum limiti geçtiniz.");

      }

    }
    else if (islem == 3) {

       System.out.print("IBAN: ");
       int ibanNo = iban.nextInt();

       if (ibanNo > 0) {

         System.out.println("Sıradaki işleme yönlendiriliyorsunuz...");

       }
       else {

         System.out.println("Böyle bir numara bulunmamaktadır.");

       }
    
       int h; // h: bakiye
       h = (int) (Math.random()*5000)+1;

       System.out.print("Seçtiğiniz hesabın bakiyesi: " + h);

       System.out.println( );

       System.out.print("Ne kadar para havale etmek istiyorsunuz?: ");
       int havale1 = havale.nextInt();

       System.out.println( );

       System.out.println("Seçtiğiniz hesabın güncel bakiyesi: " + (havale1 + h));
       System.out.println("Hesabınızın güncel bakiyesi: " + (i - havale1));

    }
    else {

      System.out.println("Böyle bir işlem bulunmamaktadır.");

    }

    System.out.println("İyi günler dileriz...");
    
    }

}