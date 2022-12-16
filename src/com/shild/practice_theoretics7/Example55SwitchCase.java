package src.com.shild.practice_theoretics7;

public class Example55SwitchCase {
    public static void main (String [] args ) {

     //Усовершенствованная версия программы, в которой
   //     определяется принадлежность месяца времени года
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                season = "visionary month";
        }
        System.out.println ("April belongs to " + season + "."   );

    }
}
