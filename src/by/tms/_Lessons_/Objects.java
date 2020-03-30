package by.tms._Lessons_;

public class Objects {
    Integer integer = 56; //ссылка на объект
    Short aShort = 56;
    byte aByte = 'A';
    Long aLong = 56L;

    byte[] aa = new byte[]{'H','e','l','o'};
    char [] bb = new char[]{'H','E','L','L','O'};
    byte [] cc = new byte[]{'H','E','L','L','O'};

    Double aDouble = 56d; //старшенство

    Float aFloat = 45f;

    Boolean aBoolean = true;
    Character character = '\u1817';

    public static void main(String[] args) {
        String string = "Hello";
        String string2 = "Hello";
        String string3 = "Hel";
        String string4 = "lo";
        String string5 = "Hel" + "lo";
        Integer a = 22;
        Integer b = 22;

        Long aa = 22L;
        Long ab = 22L;
        System.out.println(aa == ab);
        System.out.println(a.floatValue());

        System.out.println(a == b);
//        System.out.println(string2 == string5);
//        System.out.println(string == string2);

        StringBuilder stringBuilder = new StringBuilder("Hello");
//        stringBuilder.append("Hello ");
//        stringBuilder.append("by.tms.Test");

        StringBuilder stringBuilder2 = new StringBuilder("Hello");
//        stringBuilder.append("Hello ");
//        stringBuilder.append("by.tms.Test");

        System.out.println(stringBuilder == stringBuilder2);


    }
}

