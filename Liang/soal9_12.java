package Liang;

import java.util.Scanner;

public class soal9_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan koordinat dua garis: x1, y1, x2, y2, x3, y3, x4, y4: ");

        double[] koor = new double[8];
        for (int i = 0; i < 8; i++) {
            koor[i] = input.nextDouble();
        }
        double a = koor[1] - koor[3];
        double b = -(koor[0] - koor[2]);
        double c = koor[5] - koor[7];
        double d = -(koor[4] - koor[6]);
        double e = (koor[1] - koor[3]) * koor[0] - (koor[0] - koor[2]) * koor[1];
        double f = (koor[5] - koor[7]) * koor[4] - (koor[4] - koor[6]) * koor[5];

        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);

        if(linearEquation.isSolvable()){
            System.out.printf("Titik potong dari dua garis berada pada (%.2f, %.2f)", linearEquation.getX(), linearEquation.getY());
        }else{
            System.out.println("The equation does not have a solution with the points provided.");
        }
    }
}
