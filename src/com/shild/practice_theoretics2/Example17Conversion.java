package src.com.shild.practice_theoretics2;

public class Example17Conversion {
    public static void main (String [] args) {

        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nconvert type int in type byte");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\nconvert type double in type int");
        i = (int) d;
        System.out.println("d and i" + d + " " + i);

        System.out.println("\nconvert type doouble in type byte");
        b = (byte) d;
        System.out.println(" d and b" + d + "" + b);

    }
}
