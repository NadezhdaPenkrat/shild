package src.com.shild.practice_theoretics4;

public class Example32BreakLoop4 {
    public static void main (String [] args ) {

    //Применение оператора break для
        // выхода из вложенных циклов
        outer : for (int i=0; i<5; i++ ) {
            System.out.println (" Way " +i+ ":");
            for (int j=0; j<100; j++){
                if (j==10) break outer;
                System.out.print (j+ " ");

            }
            System.out.println ("this String wouldnt console");

        }
        System.out.println ("loop complete");
    }
}
