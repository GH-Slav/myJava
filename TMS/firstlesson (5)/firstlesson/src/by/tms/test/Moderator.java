package by.tms.test;

import by.tms.old.ForIf;

public class Moderator extends Human implements ModerAction, Фрукт, ForIf {

    private String role;

    public Moderator(String sex, int age, String role) {
        super(sex, age);
        this.role = role;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void voice() {
        System.out.println("moder");
    }

    @Override
    public void stop(String message) {

    }

    @Override
    public void созревать() {

    }
}
