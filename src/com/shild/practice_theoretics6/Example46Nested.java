package src.com.shild.practice_theoretics6;

public class Example46Nested {
    public static void main (String [] args ){

//Циклы могут быть вложенными

        int i,j;
        for (i=0; i<10; i++){
            for (j=i; j<10; j++)
                System.out.print (".");
            System.out.println();
            }
    }
}
