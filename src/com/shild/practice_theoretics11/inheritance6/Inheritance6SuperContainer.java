package src.com.shild.practice_theoretics11.inheritance6;


public class Inheritance6SuperContainer {
    double width;
    double height;
    double depth;

    // сконструировать клон объекта
    Inheritance6SuperContainer(Inheritance6SuperContainer obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    //конструктор , применяемый при указании всех размеров
    Inheritance6SuperContainer(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Inheritance6SuperContainer() { //конструктор ,применяемый в отсутствие размеров
        // значение -1 служит для обозначения неинициализированного параллелепипеда
        width = -1;
        height = -1;
        depth = -1;
    }

    Inheritance6SuperContainer(double len) {  //конструктор , применяемый при создании куба
        width = height = depth = len;
    }

    double volume() { // рассчитать и возвратить объем
        return width * height * depth;
    }
}
//Теперь в классе ВOxWeight полностью реализованы все конструкторы
class BoxWeight extends Inheritance6SuperContainer {
    double weight;//вес параллелепипеда

    //сконструировать клон объекта
    BoxWeight (BoxWeight obj) {//передать объект конструктору
        super (obj);
        weight=obj.weight;
    }

    //конструктор , применяемый при указании всех параметров
    BoxWeight(double w, double h, double d, double we){
        super (w, h, d);
        weight=we;

    }

    //конструктор, применяемый по умолчанию
    BoxWeight(){
        super();
        weight=-1;

    }
    //конструктор , применяемый при создании куба
    BoxWeight(double len, double we){
        super(len);
        weight=we;
    }
}
class DemoSuper{
    public static void main (String [] args ){
        BoxWeight mybox1= new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2= new BoxWeight(2,3,4,0.076);
        BoxWeight mybox3= new BoxWeight(); //по умолчанию
        BoxWeight mycube= new BoxWeight(3,2);
        BoxWeight myclone= new BoxWeight(mybox1);


        double vol;

        vol= mybox1.volume();
        System.out.println( " Volume mybox1 is: " +vol);
        System.out.println ( "weight mybox1 is : "+ mybox1.weight);
        System.out.println ();

        vol= mybox2.volume();
        System.out.println( " Volume mybox2 is: " +vol);
        System.out.println ( "weight mybox2 is : "+ mybox2.weight);
        System.out.println ();

        vol= mybox3.volume();
        System.out.println( " Volume mybox3 is: " +vol);
        System.out.println ( "weight mybox3 is : "+ mybox3.weight);
        System.out.println ();

        vol= mycube.volume();
        System.out.println( " Volume mycube is: " +vol);
        System.out.println ( "weight mycube is : "+ mycube.weight);
        System.out.println ();

        vol= myclone.volume();
        System.out.println( " Volume myclone is: " +vol);
        System.out.println ( "weight myclone is : "+ myclone.weight);
        System.out.println ();

    }
}