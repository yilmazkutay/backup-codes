package MiniProjects;

public class asalsayılar {

   public static boolean asal(int sayi) { // 1000'e kadar olan asal sayıları bulma
       
      for (int i = 2; i < sayi; i++) {

         if (sayi % i == 0) {
            return false;

         }
        
      }
      return true;

   }

    public static void main(String[] args) {
        
       for (int i = 2; i < 1000; i++) {
           
          if (asal(i)) {

            System.out.println(i);
          }

       }

    }

}