package by.tms._Lessons_.Ch05.Операторы._2_Цикл.DoWhile;

public class Menu {
    public static void main(String[] args) throws java.io.IOException {
        char choice;

        do {
            System.out.println("Справка по оператору: ");
            System.out.println("1. If ");
            System.out.println("2. Switch ");
            System.out.println("3. While ");
            System.out.println("4. Do-While ");
            System.out.println("5. For \n");
            System.out.println("Выберите из спика меню!!!");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("Ch05.1");
                break;
            case '2':
                System.out.println("Ch05.1");
                break;
            case '3':
                System.out.println("Ch05.2");
                break;
            case '4':
                System.out.println("Ch05.2");
                break;
            case '5':
                System.out.println("Ch05.2");
                break;
        }
    }
}
