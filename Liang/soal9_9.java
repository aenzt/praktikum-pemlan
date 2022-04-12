package Liang;

public class soal9_9 {
    public static void main(String[] args) {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6, 4);
        RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Perimeter of polygon one is " + poly1.getPerimeter() + " & area of polygon one is " + poly1.getArea());
        System.out.println("Perimeter of polygon two is " + poly2.getPerimeter() + " & area of polygon two is " + poly2.getArea());
        System.out.println("Perimeter of polygon three is " + poly3.getPerimeter() + " & area of polygon three is " + poly3.getArea());
    }
}
