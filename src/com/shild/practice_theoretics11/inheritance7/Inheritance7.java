package src.com.shild.practice_theoretics11.inheritance7;


//Использовать ключевое слово super
// с целью предотвратить сокрытие имен
public class Inheritance7 {

    int i;
}


//создать подкласс путем расширения класса Inheritance7
class B extends Inheritance7 {
    int i;

    B(int a, int b) {
        super.i = a; //член i из класса Inheritance7
        i = b; //член i из класса B
    }

    void show() {
        System.out.println("Члeн i в суперклассе :" + super.i);
        System.out.println("Члeн i в подклассе :" + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}
