package src.com.shild.practice_theoretics5;

public class Example43IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "autumn";
        else
            season = "unreal month";
        System.out.println("April belongs to " + season + ".");
    }

}
