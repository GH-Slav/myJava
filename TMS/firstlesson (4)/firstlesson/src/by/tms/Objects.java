package by.tms;

import java.util.Arrays;

public class Objects {
    Integer integer = 56;
    Short aShort = 56;
    byte aByte = 'A';
    Long aLong = 56L;

    byte[] aa = new byte[]{'H','e','l','o'};

    Double aDouble23 = 56d;
    Float aFloat = 45f;

    Boolean aBoolean = true;

    Character character = '\u1817';

    public static void main(String[] args) {
        int a = 2442;
        String num = Integer.toString(a);
        System.out.println(num);
        String test = "HellolleH";
        char[] chars = test.toCharArray();
        char[] chars1 = new char[chars.length];
        for (int i = chars.length - 1, ii = 0; i>=0; i--, ii++) {
            chars1[ii] = chars[i];
        }
        System.out.println(Arrays.equals(chars, chars1));


        String string = "Hello";
        String string2 = "Hello";
        String string3 = "Hel";
        String string4 = "lo";
        String string5 = "Hel" + "lo";
//        Integer a = 22;
        Integer b = 22;

        Long aa = 22L;
        Long ab = 22L;
        System.out.println(aa == ab);

//        System.out.println(a.floatValue());


        System.out.println(a == b);
//        System.out.println(string2 == string5);
//        System.out.println(string == string2);

        StringBuilder stringBuilder = new StringBuilder("Hello");
//        stringBuilder.append("Hello ");
//        stringBuilder.append("Test");

        StringBuilder stringBuilder2 = new StringBuilder("Hello");
//        stringBuilder.append("Hello ");
//        stringBuilder.append("Test");

        System.out.println(stringBuilder == stringBuilder2);


    }
}
