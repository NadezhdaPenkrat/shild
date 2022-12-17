package src.com.shild.practice_theoretics8;

class Example58Box2 {

    double width;
    double height;
    double depth;

}
class BoxDemo2 {
    public static void main(String[] args) {

        Example58Box2 mybox1 = new Example58Box2();
        Example58Box2 mybox2 = new Example58Box2();
        double vol;

        //присвоить значения переменным э кземпляра myЬoxl
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println(" Объем равен" + vol);

        mybox2.width = 10;
        mybox2.height = 20;
        mybox2.depth = 15;
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println(" Объем равен" + vol);

    }

}


