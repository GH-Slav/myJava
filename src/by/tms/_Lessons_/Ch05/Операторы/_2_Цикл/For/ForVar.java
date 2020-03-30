package by.tms._Lessons_.Ch05.Операторы._2_Цикл.For;

public class ForVar {
    public static void main(String[] args) {
        int j = 0;
        boolean done = false;

        for (; !done; ) {
            System.out.println("j равно " + j);
            if (j == -10) done = true;
            j--;
        }
    }
}
