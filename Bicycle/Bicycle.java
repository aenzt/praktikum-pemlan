package Bicycle;

public class Bicycle {
    private String color, brand;
    private double speed;
    private int maxGear, gear;

    Bicycle(){
        this.speed = 0;
        this.gear = 1;
    }
    Bicycle(String color, String brand){
        this.color = color;
        this.brand = brand;
        this.speed = 0;
        this.gear = 1;
    }
    Bicycle(String color, String brand, double speed, int gear){
        this.color = color;
        this.brand = brand;
        this.speed = speed;
        this.gear = gear;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void gearUp(){
        if(this.gear++ < maxGear){
            this.gear++;
        }else{
            System.out.println("Max Gear");
        }
    }
}
