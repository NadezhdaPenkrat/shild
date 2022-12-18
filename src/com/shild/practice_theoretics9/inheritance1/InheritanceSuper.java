package src.com.shild.practice_theoretics9.inheritance1;

class InheritanceSuper {

    int i, j;

    void showij() {
        System.out.println("i and j:  " + i + "  " + j);

    }
}


class InheritanceSub extends InheritanceSuper {

    int k;

    void showk() {
        System.out.println("k:  " + k);

    }

    void sum() {
        System.out.println("i + j +k :  " + (i + j + k));

    }
}

class SimpleInheritance {
    public static void main(String[] args) {

        InheritanceSuper superOb = new InheritanceSuper();
        InheritanceSub subOb = new InheritanceSub();

//суперкласс может использоваться самостоятельно
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("includes object superOb : ");
        superOb.showij();
        System.out.println();

// Подкласс имеет доступ ко всем открытым членам
//своего суперкласса
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("includes object subOb : ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Equal i,j,k in object subOb :");
        subOb.sum();

    }
}

