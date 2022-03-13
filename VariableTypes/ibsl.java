package VariableTypes;

public class ibsl {

  public static void main(String[] args) {  
      int a = 4;
      // -2^31 ve 2^31- 1 arası değer tutabilir.

    System.out.println(a);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

     byte b = 100;

    System.out.println(b);
    System.out.println(Byte.MAX_VALUE);
    System.out.println(Byte.MIN_VALUE);

     short c = 100;

    System.out.println(c);
    System.out.println(Short.MAX_VALUE);
    System.out.println(Short.MIN_VALUE);

     long d = 100;

    System.out.println(d);
    System.out.println(Long.MAX_VALUE);
    System.out.println(Long.MIN_VALUE);

    // byte - short - int - long
    // dönüştürme yaparken;
    // byte j = 100;
    // byte i = (byte) (j/2);

  } 
      
}