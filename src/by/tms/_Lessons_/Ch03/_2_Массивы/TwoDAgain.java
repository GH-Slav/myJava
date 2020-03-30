package by.tms._Lessons_.Ch03._2_Массивы;

public class TwoDAgain {
    public static void main(String[] args) {
        int[][] twoD2 = new int[4][];
        twoD2[0] = new int[1];
        twoD2[1] = new int[2];
        twoD2[2] = new int[3];
        twoD2[3] = new int[4];
        int i, j, k = 0;

        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                twoD2[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                System.out.print(twoD2[i][j] + "  ");
                System.out.println();
            }
    }
}
