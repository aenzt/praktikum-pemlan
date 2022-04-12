package Liang;

import java.util.Scanner;

public class soal9_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b,c,d,e,f;

        System.out.println("Masukkan value a, b, c, d, e, dan f");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);
        if (linearEquation.isSolvable()) {
            System.out.println("X adalah " + linearEquation.getX());
            System.out.println("Y adalah " + linearEquation.getY());
        }else{
            System.out.println("The equation has no solution");
        }
        input.close();
    }
}
