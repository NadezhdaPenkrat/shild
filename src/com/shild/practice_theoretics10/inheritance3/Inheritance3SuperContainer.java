package src.com.shild.practice_theoretics10.inheritance3;

class Inheritance3SuperContainer {

    double width;
    double height;
    double depth;

    // сконструировать клон объекта
    Inheritance3SuperContainer(Inheritance3SuperContainer ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    //конструктор , применяемый при указании всех размеров
    Inheritance3SuperContainer(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор ,применяемый в отсутствие размеров
    Inheritance3SuperContainer() {
        width = -1;  // значение -1 служит для обозначения
        height = -1; //неинициализированного
        depth = -1; // параллелепипеда

    }

    //конструктор , применяемый при создании куба
    Inheritance3SuperContainer(double len) {
        width = height = depth = len;

    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

//расширить класс Вох, включив в него поле веса
class Inheritance3SubContainerWeight extends Inheritance3SuperContainer {
    double weight;

    //  конструктор ContainerWeight()
    Inheritance3SubContainerWeight(double wi, double h, double d, double we) {
        width = wi;
        height = h;
        depth = d;
        weight = we;
    }
}

class DemoInheritance3SubContainerWeight extends Inheritance3SuperContainer {

    String weight;
    public DemoInheritance3SubContainerWeight(double wi, double h, double d, double we) {
    }

    public static void main(String[] args) {
        DemoInheritance3SubContainerWeight mycontainer1 = new DemoInheritance3SubContainerWeight(10, 20, 15, 34.3);
        DemoInheritance3SubContainerWeight mycontainer2 = new DemoInheritance3SubContainerWeight(2, 3, 4, 0.076);
        double vol;

        vol = mycontainer1.volume();
        System.out.println("объём mycontainer1 равен :" + vol);
        System.out.println("вес mycontainer1 равен :" + mycontainer1.weight);

        vol = mycontainer2.volume();
        System.out.println("объём mycontainer2 равен :" + vol);
        System.out.println("вес mycontainer2 равен :" + mycontainer2.weight);

    }
}
