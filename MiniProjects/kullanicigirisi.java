package MiniProjects;

import java.util.Scanner;

public class kullanicigirisi { // kullanıcı girişi
   public static void main(String[] args) {
       
   Scanner scanner = new Scanner (System.in);
   scanner.close();

   int giris_hakki = 3;

   String sys_kullanici_adi = "Amed Gaya";
   String sys_parola = "12345";

   System.out.println("Hoş Geldiniz.");

   while (giris_hakki >= 0) {
   
     System.out.print("Kullanıcı Adı: ");
     String kullanici = scanner.nextLine();
     System.out.print("Parola: ");
     String parola = scanner.nextLine();

    if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
       System.out.println("Hoş Geldiniz, " + kullanici);
       break;

    }
    else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
       System.out.println("Parolanız yanlış!");
       giris_hakki -= 1;
       System.out.println("Kalan giriş hakkı: " + giris_hakki);

    }
    else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
       System.out.println("Kullanıcı adınız yanlış!");
       giris_hakki -= 1;
       System.out.println("Kalan giriş hakkı: " + giris_hakki);

    }
    else {
       System.out.println("Kullanıcı adınız ve parolanız yanlış");
       giris_hakki -= 1;
       System.out.println("Kalan giriş hakkı: " + giris_hakki);

    }

    if (giris_hakki == 0) {
      System.out.println("Giriş hakkınız bitti, lütfen bekleyiniz.");
      
   }
   
  }

 }

}