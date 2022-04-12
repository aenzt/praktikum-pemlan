package Praktikum2;

import java.util.Scanner;

public class HitungLuas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, sisi, alas, tinggi, jari2;

        menu = input.nextInt();

        if (menu == 1) {
            sisi = input.nextInt();
            Kotak kotak = new Kotak(sisi, sisi);
            System.out.println(kotak.getArea());
        }
        else if (menu == 2) {
            alas = input.nextInt();
            tinggi = input.nextInt();
            Segitiga segitiga = new Segitiga(alas, tinggi);
            System.out.println(segitiga.getArea());
        }
        else if (menu == 3) {
            jari2 = input.nextInt();
            Lingkaran lingkaran = new Lingkaran(jari2);
            System.out.println((double)lingkaran.getArea());
        }
        else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }

}

class Kotak {
    private double width, length;
    Kotak(){
        this.width = 0;
        this.length = 0;
    }

    Kotak(double width, double length){
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

    public int getArea(){
        return (int) (width * length);
    }
}

class Lingkaran {
    private double radius;

    Lingkaran() {
        this.radius = 0;
    }

    Lingkaran(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getArea() {
        double area;
        int mod = (int) (radius % 7);

        if (mod == 0 && radius >= 7) {
            area = 22/7 * radius * radius;
        }
        else {
            area = 3.14 * radius * radius;
        }
        return (int) area;
    }
}

class Segitiga {
    private double alas;
    private double tinggi;
    Segitiga(){
        this.alas = 0;
        this.tinggi = 0;
    }

    Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public int getArea(){
        return (int) ((this.alas * this.tinggi) / 2);
    }
}
