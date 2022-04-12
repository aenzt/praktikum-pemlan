package Bicycle;

public class Test1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 2);
        Bicycle bicycle = new Bicycle("blue", "polygon");
        System.out.println(rectangle.getArea());
        System.out.println(bicycle.getGear());
        bicycle.gearUp();
        System.out.println(bicycle.getGear());
    }
}
