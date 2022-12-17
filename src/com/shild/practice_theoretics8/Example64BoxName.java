package src.com.shild.practice_theoretics8;

/*
Программа , исnользующая класс Вох
Присвоить исходному файлу имя BoxDeшo . java
 */
 class Example64BoxName {

     double widthBoxName;
    double heightBoxName;
    double depthBoxName;
}

// В этом классе объявляется
// объект тиnа Вох
class BoxNameDemo {
 public static void main (String [] args) {

     Example64BoxName mybox = new Example64BoxName();

        double vol;

        //// присвоить значение переменным экземпляра mybox
        mybox.widthBoxName = 10;
        mybox.heightBoxName = 20;
        mybox.depthBoxName = 15;

        vol = mybox.widthBoxName * mybox.heightBoxName * mybox.depthBoxName;
        System.out.println(" Объем равен" + vol);

    }

}

