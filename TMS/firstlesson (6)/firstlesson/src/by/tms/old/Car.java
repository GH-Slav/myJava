package by.tms.old;

public class Car {
    private String color;
    private int since;

    public Car(String color, int since) {
        this.color = color;
        this.since = since;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSince(int since) {
        this.since = since;
    }

    public String getColor() {
        return color;
    }

    public int getSince() {
        return since;
    }

    public static void main(String[] args) {
        Car car = new Car("black", 1998);
        System.out.println(car.getColor());
        System.out.println(car.getSince());
        car.setSince(2003);
        System.out.println(car.getSince());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return this.color.equals(car.color) && this.since == car.since;
    }
}
