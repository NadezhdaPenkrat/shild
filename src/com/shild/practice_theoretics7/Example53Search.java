package src.com.shild.practice_theoretics7;

public class Example53Search {
    public  static void main (String []rgs ) {

 //Поиск в массиве с применением
        // цикла for в стиле for each
        int [] nums ={ 6,8,3,7,5,6,1,4};
        int val = 5;
        boolean found = false;

        //использовать цикл for в стиле
        // for each для
        // поиска значения переменной val
        // в массиве nums
        for (int x:nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println ("Value found");

    }
}
