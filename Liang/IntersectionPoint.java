package Liang;

import java.util.Scanner;

public class IntersectionPoint {

    private double a, b, c, d, e ,f ;

    IntersectionPoint(double a, double b, double c, double d, double e, double f){
        this.a = a ;
        this.b = b ;
        this.c = c ;
        this.d = d ;
        this.e = e ;
        this.f = f ;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable(){

        return a*d - b*c != 0;
    }

    public double getX (){
        double result = (e*d - b*f)/(a*d - b*c) ;
        return result;
    }

    public double getY (){
        double result = (a*f - e*c)/(a*d - b*c) ;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Silahkan masukan nilai x1 : ");
        double x1 = input.nextDouble();

        System.out.print("Silahkan masukan nilai y1 : ");
        double y1 = input.nextDouble();

        System.out.print("Silahkan masukan nilai x2 : ");
        double x2 = input.nextDouble();

        System.out.print("Silahkan masukan nilai y2 : ");
        double y2 = input.nextDouble();

        System.out.print("Silahkan masukan nilai x3 : ");
        double x3 = input.nextDouble();

        System.out.print("Silahkan masukan nilai y3 : ");
        double y3 = input.nextDouble();

        System.out.print("Silahkan masukan nilai x4 : ");
        double x4 = input.nextDouble();

        System.out.print("Silahkan masukan nilai y4 : ");
        double y4 = input.nextDouble();

        double a = y1-y2 ;
        double b = x1-x2 ;
        double c = y3-y4 ;
        double d = x3-x4 ;
        double e = (y1-y2)*x1 - (x1-x2)*y1 ;
        double f = (y3-y4)*x3 - (x3-x4)*y3 ;

        IntersectionPoint linear = new IntersectionPoint(a,b,c,d,e,f);

        if(!linear.isSolvable()){
            System.out.println("The two lines are parallel");
            System.exit(0);
        }

        System.out.println("Hasil dari x anda adalah : " + linear.getX());

        System.out.println("Hasil dari y anda adalah : " + linear.getY());

    }
}
