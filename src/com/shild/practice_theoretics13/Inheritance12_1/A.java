package src.com.shild.practice_theoretics13.Inheritance12_1;

public class A {
    void callme () {
        System.out.println("B методе callme () из класса А");
    }
    }
class B extends A {
    void callme () { //пере определить метод callшe ()
        System.out.println("B методе callme () из класса B");

    }
}
class C extends A {
    void callme() {
        System.out.println("B методе callme () из класса C");

    }
}
class Dispatch {
    public static void main (String [] args ) {
        A a = new A ();// объект класса А
        B b = new B ();//объект класса B
        C c = new C(); //объект класса C

        A r;//получить ссылку на объект типа А

        r= a;//переменная r ссылается на объектт ипа А
        r.callme(); //вызвать вариант ме тода callllle ( ) ,определенный в классе А
    r =b;//переменная r ссылается на объектт ипа B
    r.callme();////вызвать вариант ме тода callllle ( ) ,определенный в классе B
        r=c; //переменная r ссылается на объект типа C
    r.callme(); ////вызвать вариант ме тода callllle ( ) ,определенный в классе C




    }
}