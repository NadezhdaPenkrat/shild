package src.com.shild.practice_theoretics4;

public class Example33Continue {
    public static void main (String [] args) {

     // Продемонстрировать применение оператора continue
        for (int i=0; i<10; i++) {
            System.out.print (i +"   ");
            if (i%2==0) continue;
            System.out.println ("");

        }
    }
}
