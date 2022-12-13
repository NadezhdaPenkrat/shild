package src.com.shild.practice_theoretics4;

public class Example34ContinueLabel {
    public static void main (String [] args) {

      // Применение оператора continue с меткой
        outer: for ( int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (j>i) {
                    System.out.println ();
                    continue  outer;

                }
                System.out.print ( " " + (i*j));

            }
        }
        System.out.println ();

    }
}
