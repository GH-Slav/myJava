package by.tms.test;

public abstract class Human {
    protected String sex;
    private int age;

    public Human(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public void voice(String message){
        System.out.println(message);
    }
}
