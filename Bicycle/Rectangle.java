package Bicycle;

public class Rectangle {
    private double width, length;
    Rectangle(){
        this.width = 0;
        this.length = 0;
    }

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }
}
