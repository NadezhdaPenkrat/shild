package src.com.shild.practice_theoretics3;

public class Example21IncDec {
    public static void main (String [] args) {
   //Продемонстрировать применение
        // операции инкремента ++
        int a =1;
        int b =2;
        int c;
        int d;
        c=++b;
        d=a++;
        c++;
        System.out.println ("a ="+a);//2
        System.out.println ("b ="+b);//3
        System.out.println ("c ="+c); //3.4
        System.out.println ("d ="+d);//1
    }
}
