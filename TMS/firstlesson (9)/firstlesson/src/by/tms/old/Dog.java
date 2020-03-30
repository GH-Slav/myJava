package by.tms.old;

import java.util.Objects;

public class Dog {

    public static void main(String[] args) {
        Dog dog = new Dog("Test", 22);
        Dog dog2 = new Dog("Test2", 22);

        System.out.println(dog.equals(dog2));
    }

    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
//
//    public Dog(int age){
//        this.age = age;
//    }
//
    public Dog() {
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
