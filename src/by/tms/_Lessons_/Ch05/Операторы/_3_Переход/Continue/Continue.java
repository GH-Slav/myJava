package by.tms._Lessons_.Ch05.Операторы._3_Переход.Continue;

public class Continue {
    public static void main(String[] args) {
        for(int x = 0; x<10; x++){
            System.out.println(x + " ");
            if (x%2 == 0) continue;
            System.out.println("");
        }
    }
}
