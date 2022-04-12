package BCC;

import java.util.Scanner;

public class BCC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        long X = scanner.nextLong();
        long Y = scanner.nextLong();

        if(X == Y || (X < Y && X+P > Y) || (Y < X && Y+P > X)){
            // intersect, distance is 0
            System.out.println(0);
        } else {
            long right = Math.max(X, Y);
            long left = Math.min(X, Y);
            System.out.println(right - (left+P));
        }
    }
}
