package src.com.shild.practice_theoretics9.inheritance2;

class Inheritance2Super {

    int i;// этот член открыт по умолчанию,
    private int j; // а этот член закрыт в классе Inheritance2Super

    void setij(int x, int y) {
        i = x;
        j = y;
    }

}

class Inheritance2Sub extends Inheritance2Super {

    int total;

    void sum() {

        //total = i+j; //Скомпилировать эту программу не удастся,
        // поскольку переменная j объявлена в классе А как private
    }
}

class Access {
    public static void main(String[] args) {

        Inheritance2Sub subObj = new Inheritance2Sub();
        subObj.setij(10, 12);
        subObj.sum();
        System.out.println("sum is : " + subObj.total);

    }
}