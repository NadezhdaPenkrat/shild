package src.com.shild.practice_theoretics4;

public class Example28BreakGoto {
    public static void main (String [] args) {

      //Применение оператора break в качестве цивилизованной
        // формы оператора qoto

        boolean t= true;
        first:{
            second: {
                  third: {
                System.out.println( " Preceded by the operator  break");
                if (t) break second ;
                 System.out.println ("this operator wouldnot complete");

            }
            System.out.println ("this operator wouldnot complete");
            }
            System.out.println ("this operator followed by block code second");
        }
    }
}
