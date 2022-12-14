package src.com.shild.practice_theoretics5;

public class Example41ForVar {
    public static void main (String [] args ) {

       //Отдельные части оператора
        // цикла for могут отсутствовать
        int i;
        boolean done = false;
        i=0;
        for ( ; !done ;) {
            System.out.println ( "i equal "  +i);
            if (i == 10 ) done = true;
            i++;
        }
    }
}
