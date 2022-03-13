package MiniProjects;

import java.util.Scanner;

public class ebobhesaplama { // iki sayının ebob'unu bulma

    public static int ebob(int a, int b) {
        
        int ebob = 1;

        for (int i = 1; i <= a && i <= b; i++) {

           if ((a % i == 0) && (b % i == 0)) {

             ebob = i;
             
           }
          
        }
        return ebob;
    }

    public static void main(String[] args) {
       
       Scanner ebob = new Scanner(System.in);
       ebob.close();
        
        System.out.print("Birinci sayı: ");
        int birinci = ebob.nextInt();

        System.out.print("İkinci sayı: ");
        int ikinci = ebob.nextInt();

        System.out.print("EBOB = " + ebob(birinci, ikinci));

    }

}