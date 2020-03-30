package by.tms.DomashneeZadanie._1_Array;

//Выводить число если пред число это его половина
public class Zada4a_3 {
    public static void main(String[] args) {

        int[] c = {-2, 30, 49, 60, 89, -4, -8, 1, 25, 50};
        for (int i = 0, ii = 1; i < c.length; i++, ii++) {
            if (c[ii]/2 == c[i])
                System.out.println(c[ii]);
        }
    }
}
