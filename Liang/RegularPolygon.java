package Liang;

public class RegularPolygon {

    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    RegularPolygon(int numSides, double sideLength){
        this.n = numSides;
        this.side = sideLength;
    }

    RegularPolygon(int numSides, double sideLength, double x, double y){
        this.n = numSides;
        this.side = sideLength;
        this.x = x;
        this.y = y;
    }

    public void setNumSides(int newNum){
        this.n = newNum;
    }

    public int getNumSides(){
        return n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getPerimeter(){
        return n * side;
    }

    public double getArea(){
        return n * (Math.pow(side, 2) / 4 * Math.tan(Math.PI / n));
    }
}
