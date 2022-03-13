package Methods.Constructors;

public class account {

    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telNo;

    public account() {

       /*
       this.hesapNo = "Bilgi yok.";
       this.bakiye = 0.0;
       this.isim = "Bilgi yok.";
       this.email = "Bilgi yok.";
       this.telNo = "Bilgi yok.";
       */

       this("Bilgi yok", 0.0, "Bilgi yok", "Bilgi yok", "Bilgi yok");

    }

    public account(String hesapNo, double bakiye, String isim, String email, String telNo) {

       this.hesapNo = hesapNo;
       this.bakiye = bakiye;
       this.isim = isim;
       this.email = email;
       this.telNo = telNo;

    }

    public void yatirma(double miktar) {
       
       bakiye += miktar;
       System.out.println("Güncel bakiye: " + bakiye);

    }
    public void cekme(double miktar) {

        if (miktar > 1500) {

          System.out.println("1500'den fazla para çekemezsiniz.");

        }
        else if (bakiye - miktar < 0) {

          System.out.println("Yeterli miktarda bakiye bulunmamaktadır. Bakiye: " + bakiye);

        }
        else {

           bakiye -= miktar;
           System.out.print("Güncel Bakiye: " + bakiye);

        }

    }

    public String gethesapNo() {
        return hesapNo;
    }
    public void sethesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

}