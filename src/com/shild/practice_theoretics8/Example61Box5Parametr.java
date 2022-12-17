package src.com.shild.practice_theoretics8;

class Example61Box5Parametr {

    double widthBox5Parametr;
    double heightBox5Parametr;
    double depthBox5Parametr;

    // рассчитать и возвратить объем
    double volume() {
        return widthBox5Parametr * heightBox5Parametr * depthBox5Parametr;
    }

    //установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        widthBox5Parametr = w;
        heightBox5Parametr = h;
        depthBox5Parametr = d;
    }
}

class Box5ParametrDemo {
    public static void main(String[] args) {

        Example61Box5Parametr mybox1 = new Example61Box5Parametr();
        Example61Box5Parametr mybox2 = new Example61Box5Parametr();

        double vol;

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

//получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Oбъeм равен  " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм равен  " + vol);

    }
}
