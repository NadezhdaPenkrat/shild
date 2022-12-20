package src.com.shild.practice_theoretics11.inheritance5;

public class Inheritance5SuperContainer {

    double width;
    double height;
    double depth;

    // сконструировать клон объекта
    Inheritance5SuperContainer(Inheritance5SuperContainer obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    //конструктор , применяемый при указании всех размеров
    Inheritance5SuperContainer(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор ,применяемый в отсутствие размеров
    Inheritance5SuperContainer() {
        width = -1; // значение -1 служит для обозначения
        height = -1; //неинициализированного
        depth = -1; // параллелепипеда
    }

    //конструктор , применяемый при создании куба
    Inheritance5SuperContainer(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

//Теперь в классе BoXWeiqht ключевое слово super используется
//для инициализации собственных свойств объекта типа Inheritance5SuperContainer
class BoxWeight extends Inheritance5SuperContainer {
    double weight;

    //инициализировать поля width, heiqht и depth
    //с помощью метода super ()
    BoxWeight(double w, double h, double d, double we) {
        super(w, h, d);//вызвать конструктор суперкласса
        weight = we;
    }
}

