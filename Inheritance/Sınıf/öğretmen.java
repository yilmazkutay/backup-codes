package Inheritance.Sınıf;

public class öğretmen extends öğrenci {

   private int maas;

   public öğretmen(String ad, String soyad, int yas, int no, int maas) {

      super(ad, soyad, yas, no);
      this.maas = maas;
   }

   public void müfredat(String konu) {

      System.out.println("Mehmet'in ricasıyla " + konu + " konusunu tekrar edecektir");

   }

   @Override
   public void öğrenci_bilgileri() {
   
      super.öğrenci_bilgileri();
      System.out.println("Aldığı maaş: " + maas);
   }

}