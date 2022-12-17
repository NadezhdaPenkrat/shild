package src.com.shild.practice_theoretics8;

class Example62Box6Constructor {

    int widthConstructor;
    int heightConstructor;
    int depthConstructor;

    Example62Box6Constructor() {     //Это конструктор класса Вох
        System.out.println(" Koнcтpyиpoвaниe объекта Example62Box6Constructor ");
        widthConstructor = 10;
        heightConstructor = 10;
        depthConstructor = 10;
    }

    double volume() { // рассчитать и возвратить объем
        return widthConstructor * heightConstructor * depthConstructor;
    }
}

class Box6DEMOConstructor {
    public static void main(String[] args) {

        Example62Box6Constructor myBox1 = new Example62Box6Constructor();
        Example62Box6Constructor myBox2 = new Example62Box6Constructor();
        double volume;

        volume = myBox1.volume();//получить объем первого параллелепипеда
        System.out.println("Oбъeм равен  " + volume);

        volume = myBox2.volume(); // получить объем второго параллелепипеда
        System.out.println("Oбъeм равен  " + volume);

        ////не выводит консоль

    }

}
