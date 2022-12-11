package src.com.shild.practice_theoretics2;

public class Example09Average {
    public static void main (String [] args) {

        double[] nums = {10.1,11.2,12.3,13.4,14.5};
        double result =0;
        int i;
        for (i=0; i<5; i++)
            result=result+ nums[i];
  //      В этой программе вычисляется среднее значение ряда чисел.
        System.out.println ("average  " + result/5);

    }
}
