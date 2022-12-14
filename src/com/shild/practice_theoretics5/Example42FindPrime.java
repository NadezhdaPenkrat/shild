package src.com.shild.practice_theoretics5;

public class Example42FindPrime {
    public static void main (String [] args ){

       //Проверить на простые числа
        int num;
        boolean isPrime;
        num = 14;
        if (num <2) isPrime = false;
               else isPrime = true;
               for (int i=2; i<=num/i; i++) {
                   if ( (num%i)==0){
                       isPrime= false;
                       break;

                   }
               }
        if(isPrime) System.out.println ("Simple Number");
        else System.out.println ("not simple number");


    }
}
