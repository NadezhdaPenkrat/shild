package src.com.shild.practice_theoretics1;

public class Example08ArrayMatrixThreeD {
    public static void main(String[] args) {

        // трехмерный массив размсрстыо Зх4х5,
        int[][][] threeD = new int[3][4][5];
        //тем каждый лемент
// массива заол11ястся 11роизведе11исм его индексов,
        int i, j, k;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                for (k = 0; k < 5; k++)
                    threeD[i][j][k] = i * j * k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++)
                    System.out.print(threeD[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }

    }
}

