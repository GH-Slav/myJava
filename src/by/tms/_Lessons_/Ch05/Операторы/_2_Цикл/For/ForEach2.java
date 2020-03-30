package by.tms._Lessons_.Ch05.Операторы._2_Цикл.For;

public class ForEach2 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int x : nums){
            System.out.println(x);
            sum += x;
            if (x == 5) break;
        }
        System.out.println("Сумма равна:  " + sum);
    }
}
