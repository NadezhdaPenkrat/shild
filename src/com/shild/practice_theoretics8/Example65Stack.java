package src.com.shild.practice_theoretics8;

public class Example65Stack {

    int [] stck = new int [10];
    int tos;
    Example65Stack() {
        tos=-1;
    }
    void push (int item ) {
        if ( tos == 9)
    System.out.println ("Cтeк заполнен");
        else
            stck [++tos] =item;
    }

int pop () {
    if (tos < 0) {
        System.out.println("Cтeк не загружен");
        return 0;
    } else
        return stck[tos--];
}
}
class testStack {
    public static void main (String [] args){

        Example65Stack  mystack1 =new Example65Stack ();
        Example65Stack mystack2 =new Example65Stack();

        for (int i=0; i<10; i++) mystack1.push(i);
        for (int i=10; i<20;i++) mystack2.push(i);

        System.out.println ("Coдepжимoe стека mystack1");
        for (int i=0; i<10; i++)

            System.out.println (mystack1.pop());

        System.out.println ("Coдepжимoe стека mystack2");
        for (int i=0; i<10; i++)

            System.out.println (mystack2.pop() );
    }
}
