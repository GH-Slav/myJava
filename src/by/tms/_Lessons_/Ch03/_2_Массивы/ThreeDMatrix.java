package by.tms._Lessons_.Ch03._2_Массивы;

public class ThreeDMatrix {
    public static void main(String[] args) {
        int threeD[][][] = new int[3][4][5];
        int i, j, l;

        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                for (l = 0; l < 5; l++)
                    threeD[i][j][l] = i * j * l;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (l = 0; l < 5; l++) {
                    System.out.print(threeD[i][j][l] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
