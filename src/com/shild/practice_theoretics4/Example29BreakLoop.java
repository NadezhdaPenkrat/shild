package src.com.shild.practice_theoretics4;

public class Example29BreakLoop {
    public static void main (String[] args ) {

      //Применение оператора break для выхода из цикла

        for (int i=0; i<100; i++) {
            if (i==10) break;
            System.out.println ("i:" +i);
                    }
        System.out.println ("Loop finished");
    }
}
