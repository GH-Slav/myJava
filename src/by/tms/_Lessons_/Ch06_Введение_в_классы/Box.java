package by.tms._Lessons_.Ch06_Введение_в_классы;

public class Box {
    double width;
    double height;
    double depth;

 /*   Box() {
        System.out.println("Koнcтpyиpoвaниe объекта Вох ");
        width = 10;
        height = 10;
        depth = 10;
    }*/

    public Box(double w, double h, double d) {
        this.width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
