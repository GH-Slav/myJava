package by.tms._Lessons_.Ch07_Методы_и_классы._1_Перегрузка;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда ни один из размеров не указан
    Box() {
        width = -1; // использовать значение -1 для
        height = -1; // обозначения неинициализированного
        depth = -1; //параллелепипеда
    }

    // конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
