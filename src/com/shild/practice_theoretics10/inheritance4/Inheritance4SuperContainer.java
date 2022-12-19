package src.com.shild.practice_theoretics10.inheritance4;


public class Inheritance4SuperContainer {

    double width;
    double height;
    double depth;

    // сконструировать клон объекта
    Inheritance4SuperContainer(Inheritance4SuperContainer ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    //конструктор , применяемый при указании всех размеров
    Inheritance4SuperContainer(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор ,применяемый в отсутствие размеров
    Inheritance4SuperContainer() {
        width = -1;  // значение -1 служит для обозначения
        height = -1; //неинициализированного
        depth = -1; // параллелепипеда

    }

    //конструктор , применяемый при создании куба
    Inheritance4SuperContainer(double len) {
        width = height = depth = len;

    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

//расширить класс Вох, включив в него поле веса   и цвета
class Inheritance4SubContainerWeightColor extends Inheritance4SuperContainer {

    double weight;
    int color;

    //  конструктор ContainerWeightColor()
    Inheritance4SubContainerWeightColor(double wi, double h, double d, double we, int c) {
        width = wi;
        height = h;
        depth = d;
        weight = we;
        color = c;

    }
}

class RefDemo {
    public static void main(String[] args) {

        Inheritance4SubContainerWeightColor weightColorContainer1 = new Inheritance4SubContainerWeightColor(10, 20, 15, 15, 15);
        Inheritance4SuperContainer plainContainer = new Inheritance4SuperContainer();

        double vol;

        vol = weightColorContainer1.volume();

        System.out.println("Vol weightColorContainer1 is: " + vol);
        System.out.println("weight weightColorContainer1 is: " + weightColorContainer1.weight);
        System.out.println();

// nрисвоить ссылке на объект Inheritance4SubContainerWeightColor
// ссылки на объект Inheritance4SuperContainer
        plainContainer = weightColorContainer1;
// Верно , т.к. метод volume() определен в классе Inheritance4SuperContainer
        vol = plainContainer.volume();
        System.out.println(" Volume plainContainer is" + vol);


    }
}

