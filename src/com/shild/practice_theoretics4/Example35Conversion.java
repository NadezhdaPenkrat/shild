package src.com.shild.practice_theoretics4;

public class Example35Conversion {
public static void main (String [] arg ) {

     byte b;
    int i =257;
    double d = 323.142;

    System.out.println ("\n Преобразование типа int  в тип byte");
    b= (byte) i;

    System.out.println (" i и b   "   + i + "    "+ b );

    System.out.println  ( "\n Преобразование типа double  в тип int");
    i = (int ) d;

    System.out.println ( "d и b  " + d+  "  " + i );

    System.out.println ( "\n Преобразование типа double  в тип byte");
    b = (byte) d;

    System.out.println (" d и b   "  + d +  "   " +b);
}

}
