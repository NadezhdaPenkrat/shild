package src.com.shild.practice_theoretics12.Inheritance9;
//Продемонстрировать порядок вызова конструкторов
//создать суперкласс
 class A {

    A(){
        System.out.println (" B конструкторе А .");
    }
}
//создать подкласс путем расширения класса А
class B extends A {
     B(){
         System.out.println (" B конструкторе B .");

     }
}
//создать еще один подкласс путем расширения класса В
class C extends B{
     C() {
         System.out.println (" B конструкторе C .");
     }
}
class CallingCons {
     public static void main (String [] args ) {
         C c= new C() ;
     }
}
