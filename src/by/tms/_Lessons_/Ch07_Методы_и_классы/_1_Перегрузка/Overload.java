package by.tms._Lessons_.Ch07_Методы_и_классы._1_Перегрузка;

public class Overload {
    public static void main(String args[]) {
        OverloadDemo over = new OverloadDemo();
        double result;

// вызвать все варианты метода test()
        over.test();
        over.test(10);
        over.test(10, 20);
        result = over.test(123.25);
        System.out.println(
                "Результат вызова ob.test(123.25): " + result);
    }
}