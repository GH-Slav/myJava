package by.tms.calc.reader;

public class Concrete extends AbsConcrete implements InterConcrete {

    void run(){
     abc();
    }

    public void abc() {

    }

    public static void main(String[] args) {
        AbsConcrete a = new Concrete();
        InterConcrete b = new Concrete();
    }
}
