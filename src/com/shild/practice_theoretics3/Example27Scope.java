package src.com.shild.practice_theoretics3;

public class Example27Scope {
    public static void main (String [] args){

        int  x;
        x=10;
        if (x==10) {
            int y=20;
            System.out.println ("x and Y : " + x + "   "  +y);
            x =y*2 ;
        }
        // y=100;
        System.out.println ("x equel : " +x );

    }
}
