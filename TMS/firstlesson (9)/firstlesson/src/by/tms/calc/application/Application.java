package by.tms.calc.application;

public interface Application {
    public static final int i = 90;

    int ver = 2;
    abstract void run();

    static int showVer(){
        return ver;
    }
}
