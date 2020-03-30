package by.tms.test;

public class Банан implements Фрукт {
    private String form;

    @Override
    public void созревать() {
        System.out.println("банан");
    }
}
