package Methods.Constructors;

public class accounttest {
    public static void main(String[] args) {
        
    // account hesap = new account();

    /*
    hesap.sethesapNo("123456");
    hesap.setBakiye(1000.0);
    hesap.setIsim("Ahmet");
    hesap.setEmail("ahmetyildirim@gmail.com");
    hesap.setTelNo("789789");
    */

    account hesap1 = new account("123456", 1000.0, "Ahmet", "ahmetyildirim@gmail.com", "789789");

    // hesap1.yatirma(500);

    // hesap1.cekme(800);

    System.out.println(hesap1.getBakiye());

    }

}