package src.com.shild.practice_theoretics13.Inheritance11;
//Методы с отличающимися сигнатурами считаются
///перегружаемыми, а не переопределяемыми
class A {

    int i, j;
    A (int a, int b){
        i=a;
        j=b;
            }
    void show () { //вывести содержимое переменных i и j
        System.out.println ("i and j: " +i + " " +j);
    }
}

//создать подкласс путем расширения класса А
class B extends A {
    int k;
    B (int a,int b, int c) {
        super (a,b);
        k=c;
    }
//перегрузить метод show ()
    void show (String msg){
        System.out.println (msg + k);

    }

}

class Override {
    public static void main(String[] args) {
        B subObj = new B(1, 2, 3);
        subObj.show("Это k: ");//вызвать метод show () из класса В
        subObj.show(); //вызвать метод show () из класса А
    }
}