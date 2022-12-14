package src.com.shild.practice_theoretics5;

public class Example38ForEach {
    public static void main (String [] args ) {

  //Применение цикла for в с  for each
        int sum = 0;
        int[] nums = { 1,2,3,4,5,6,7,8,9,10} ;

 // использовать цикл в стиле for each для вывода и
 // суммирования значений

        for (int x : nums ) {
            System.out.println ("value is: " +x) ;
            sum +=x;
            if (x==5 ) break;

        }
        System.out.println ("value of first five numbers is : " +sum);

    }
}
