package by.tms._Lessons_.Ch05.Операторы._1_Выбор.Switch;

public class Switch {
    public static void main(String[] args) {
        int месяц = 12;
        String c = "сезон";
        String сезон;

        switch (месяц) {
            case 12:
            case 1:
            case 2:
                сезон = "зимний " + c;
                break;
            case 3:
            case 4:
            case 5:
                сезон = "весенний " + c;
                break;
            case 6:
            case 7:
            case 8:
                сезон = "летний " + c;
                break;
            case 9:
            case 10:
            case 11:
                сезон = "осенний " + c;
                break;
            default:
                сезон = "Нету";
                System.out.println(сезон);
                return;
        }
        System.out.println("Декабрь - это " + сезон + ".");
    }
}
