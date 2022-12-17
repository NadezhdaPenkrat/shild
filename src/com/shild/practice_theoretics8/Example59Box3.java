package src.com.shild.practice_theoretics8;

class Example59Box3 {

    double width;
    double height;
    double depth;
    void volume (){
        System.out.println(" Объем равен");
        System.out.println(width * height * depth);
    }

}

class BoxDemo3 {
    public static void main(String[] args) {

        Example59Box3 mybox1 = new Example59Box3();
        Example59Box3 mybox2 = new Example59Box3();
//присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
//присвоить другие значения переменным
//экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 3;
        mybox2.depth = 9;
// вывести объем первого параллелепипеда
        mybox1.volume();
// вывести объем второго параллелепипеда
        mybox2.volume();

    }
}
