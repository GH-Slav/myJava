package by.tms.calc.test.service;

import by.tms.calc.test.entity.User;

import java.io.IOException;
import java.io.Serializable;


//OOP
//Exceptions
//Collections
//IO
//Java Multithreading
//GIT
public class RegService {

  static void abc() {
    System.out.println("Run" + Thread.currentThread());
  }

  public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
//    FileInputStream fileInputStream = new FileInputStream("test.txt");
//    FileReader fileReader = new FileReader("test.txt");
//    char[] cbuff = new char[1024];
//    fileReader.read(cbuff);
//    System.out.println(cbuff);
//    fileReader.close();

//    int a;
//    while ((a = fileInputStream.read()) != -1) {
//      System.out.println(a);
//    }

//    byte[] buff = new byte[1024];
//    fileInputStream.read(buff);
//    System.out.println(Arrays.toString(buff));
//    fileInputStream.close();


//    FileOutputStream fileOutputStream = new FileOutputStream("test.txt", true);
//    fileOutputStream.write(new byte[]{77, 79, 78});
//    fileOutputStream.close();

//    FileWriter fileWriter = new FileWriter("test.txt", true);
//    fileWriter.write(new char[]{'\n', 'H', 'i'});
//    fileWriter.close();

//    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//    System.out.println(inputStreamReader.read());

//    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test.txt"));
//    Data test = new Data("test", 22);
//    objectOutputStream.writeObject(test);
//    objectOutputStream.close();

//    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test.txt"));
//    Data dataa = (Data) objectInputStream.readObject();
//    System.out.println(dataa);

//    BufferedReader
//    BufferedWriter
//    File file = new File("test.txt");

    Thread thread = new Thread(new Th());
    thread.start();
    for (int i = 0; i < 100; i++) {
      System.out.println("Main " + i);
      Thread.sleep(50);
    }
    System.out.println("Main finish");
//    System.out.println(a);
  }

  public void createUser(User user) {
    User.users.add(user);
  }

  public User getUserById(int id) {
    return User.users.get(id);
  }

  static class Data implements Serializable {
    private static final long serialVersionUID = -8649695824196526147L;

    transient String name;
    int age;

    public Data(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public Data() {
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    @Override
    public String toString() {
      return "Data{" +
          "name='" + name + '\'' +
          ", age=" + age +
          '}';
    }
  }

  static class Th implements Runnable {

    @Override
    public void run() {
//      System.out.println(Thread.currentThread().getName());
      for (int i = 0; i < 100; i++) {
        System.out.println("Th" + i);
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println("Th finish");
    }
  }
}
