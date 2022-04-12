package BCC;

import java.util.Scanner;

public class BCC5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1 = input.nextInt();
        int angka2 = input.nextInt();

        if(angka1 == 1){
            angka1 = 14;
        }
        if(angka2 == 1){
            angka2 = 14;
        }
        if(angka1 > angka2){
            System.out.println("Captain America");
        } else if (angka1 < angka2) {
            System.out.println("Iron Man");
        }else{
            System.out.println("Draw");
        }
    }
}
