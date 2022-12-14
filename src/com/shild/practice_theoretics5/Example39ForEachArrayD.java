package src.com.shild.practice_theoretics5;

public class Example39ForEachArrayD {
    public static void main (String [] args) {

  // Применение цикла for в стиле for each для
  // обращения к двухмерному массиву
        int sum =0;
        int [][] nums = new int [3] [5];

        //присвоить значение элементам массива nums
        int l = 1;
        for (int i = 0; i<3; i++)
            for (int j=0; j<5; j++)
                nums [i][j] = (i+l)*(j+l);

       //использовать цикл for в стиле for each для
        // вывода и суммирования значений
            for (int [] x :nums) {
                for (int y:x ) {
                    System.out.println("value is " +y);
                    sum+=y;
                }
            }
         System.out.println("sum" + sum);


    }
}
