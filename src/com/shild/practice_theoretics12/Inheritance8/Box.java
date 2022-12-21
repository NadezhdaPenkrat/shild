package src.com.shild.practice_theoretics12.Inheritance8;


//Расширение класса BoxWeiqht включением в него
//поля стоимости доставки

//создать сначала класс Вох
public class Box {

    private double width;
    private double height;
    private double depth;

    //сконструировать клон объекта
    Box(Box obj) {  // передать объе кт конструктору
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    //конструктор , применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор ,применяемый в отсутствие размеров
    Box() {
        // значение -1 служит для обозначения неинициализированного параллелепипеда
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {  //конструктор , применяемый при создании куба
        width = height = depth = len;
    }

    double volume() { // рассчитать и возвратить объем
        return width * height * depth;
    }
}

//добавить поле веса
class BoxWeight extends Box {
    double weight; // вес параллелепипеда

    //сконструировать клон объекта
    BoxWeight(BoxWeight obj) {// передать объе кт конструктору
        super(obj);
        weight = obj.weight;
    }

    //конструктор, применяемый при указании всех параметров
    BoxWeight(double w, double h, double d, double we) {
        super(w, h, d);//вызвать конструктор суnеркласса
        weight = we;
    }

    //конструктор , применяемый по умолчанию
    BoxWeight() {
        super();
        weight = -1;

    }

    //конструктор , применяемый при создании куба
    BoxWeight(double len, double we) {
        super(len);
        weight = we;
    }

}

//добавить поле стоимости доставки
class Shipment extends BoxWeight {
    double cost;

    //сконструировать клон объекта
    Shipment(Shipment obj) {//передать объект конструктору
        super(obj);
        cost = obj.cost;
    }

    //конструктор , используемый при указании всех параме тров
    Shipment(double w, double h, double d, double we, double c) {
        super(w, h, d, we);//вызвать конструктор суперкласса
        cost = c;

    }

    //конструктор, применяемый по умолчанию
    Shipment() {
        super();
        cost = -1;
    }

    //конструктор , применяемый при создании куба
    Shipment(double len, double we, double c) {
        super(len, we);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println(" Volume shipment1 is: " + vol);
        System.out.println(" weight shipment1 is " + shipment1.weight);
        System.out.println("cost delivery :$ " + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println(" Volume shipment2 is: " + vol);
        System.out.println(" weight shipment2 is " + shipment2.weight);
        System.out.println("cost delivery :$ " + shipment2.cost);
        System.out.println();
    }
}