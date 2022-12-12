package src.com.shild.practice_theoretics3;

public class Example23LifeTime {
    public static void main (String [] args){

        int x;
        for(x=0; x<3; x++){
            int y=-1;
            System.out.println ("y equel: " + y);
            y=100;
            System.out.println ("y now equel: " +y);

        }

    }
}
