package by.tms._Lessons_.Ch05.Операторы._2_Цикл.DoWhile;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

/*       do {
            System.out.println("такт " + n);
            n--;
        } while (n > 0);
*/
        do {
            System.out.println("такт " + n);
        } while (--n > 0);
    }
}
