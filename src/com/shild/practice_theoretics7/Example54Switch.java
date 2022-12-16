package src.com.shild.practice_theoretics7;

public class Example54Switch {
    public static void main(String[] args) {

       //Простой пример применения оператора switch
        for (int i=0; i<6; i++)
            switch (i) {
                case 0:
                    System.out.println (" i рфвно нулюю");
                    break;
                case 1:
                    System.out.println (" i рфвно единице");
                    break;
                case 2:
                    System.out.println (" i рфвно двум");
                    break;
                case 3:
                    System.out.println (" i рфвно трем");
                    break;
                default:
                    System.out.println (" i больше трех");

            }


    }
}
