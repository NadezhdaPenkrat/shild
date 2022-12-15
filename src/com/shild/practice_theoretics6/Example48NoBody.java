package src.com.shild.practice_theoretics6;

public class Example48NoBody {
    public static void main (String [] args ){

  //Целевая часть цикла может быть пустой
        int i, j;
        i =100;
        j =200;
        while (++i < --j );
        System.out.println ( "average value  " +i);

    }
}
