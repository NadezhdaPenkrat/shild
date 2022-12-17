package src.com.shild.practice_theoretics8;

class Example60Box4Return{

    double widthBox4Return;
    double heightBox4Return;
    double depthBox4Return;

    double volume() {
        return widthBox4Return * heightBox4Return * depthBox4Return;
    }
}

class BoxDemoReturn {

    public static void main(String[] args) {

        Example60Box4Return mybox1 = new Example60Box4Return();
        Example60Box4Return mybox2 = new Example60Box4Return();


        double vol;

//присвоить значение переменным экземпляра mybox1
        mybox1.widthBox4Return = 10;
        mybox1.heightBox4Return = 20;
        mybox1.depthBox4Return = 15;
//присвоить другие значения переменным
//экземпляра mybox2
        mybox2.widthBox4Return = 3;
        mybox2.heightBox4Return = 3;
        mybox2.depthBox4Return = 9;
        //получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println (  "Oбъeм равен  " + vol);
       // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println (  "Oбъeм равен  " + vol);

    }
}
