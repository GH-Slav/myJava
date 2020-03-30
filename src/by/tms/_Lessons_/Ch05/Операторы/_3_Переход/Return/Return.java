package by.tms._Lessons_.Ch05.Операторы._3_Переход.Return;

public class Return {
    public static void main(String args[]) {
        boolean r = true;

        System.out.println("Дo возврата.");

        if (r) return; // возврат в вызывающий код

        System.out.println("Этот оператор выполняться не будет.");

    }
}
