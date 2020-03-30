package by.tms.ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {

    public static void main(String[] args) {
//        Test test = new Test();
//        try {
//            test.readFile();
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
    }

    void div(int a, int b) {
        int v = 0;
        try {
            v = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(v);
    }


    void readFile(String m) throws FileNotFoundException {
        FileReader fileReader = new FileReader(new File("C://text.txt"));
        if (m.equals("exit")) {
            throw new MyException("Bad Number");
        }
    }
}
