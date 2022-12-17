package src.com.shild.practice_theoretics8;

class Example63Box7ConstructorParameterized {

    double width;
    double height;
    double depth;

    //Это конструктор класса Box7ConstructorParameterized
    Example63Box7ConstructorParameterized(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() { // рассчитать и возвратить объем
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
//объявить , выделить память и инициализировать объекты типа Box7ConstructorParameterized
        Example63Box7ConstructorParameterized myBox1 = new Example63Box7ConstructorParameterized(10,15,15);
        Example63Box7ConstructorParameterized myBox2 = new Example63Box7ConstructorParameterized(15,15,15);

        double vol;

        vol = myBox1.volume(); //nолучить объем первого параллелепипеда
        System.out.println ("Volume is myBox1 :"  + vol);
        vol= myBox2.volume(); //получить объем второго параллелепипеда
        System.out.println ("Volume is myBox2:"  + vol);
    }
}
