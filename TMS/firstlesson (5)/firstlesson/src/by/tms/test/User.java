package by.tms.test;

public class User extends Human {
    public User(String sex, int age) {
        super(sex, age);
    }

    @Override
    public void voice() {
        System.out.println("user");
    }
}
