package by.tms._Lessons_.Ch05.Операторы._1_Выбор.If_Else;

public class tms_1 {
    public static void main(String[] args) {

        int a = 50;
        int b = 10;

        if (a == b) {
            System.out.println(a + " == " + b); // Оператор if (если условие true, то выполняется if);
        } else if (a > b) {
            System.out.println(a + " > " + b); // Оператор else if (если условий несколько);
        } else {
            System.out.println(a + " < " + b); // Оператор else (если условие false, то выполняется else);
        }
    }
}