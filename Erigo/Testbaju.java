package Erigo;

import java.util.Scanner;

public class Testbaju {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Erigo.Baju yang tersedia : ");
        System.out.println("Erigo.Baju A dengan harga 100000");
        System.out.println("Erigo.Baju B dengan harga 125000");
        System.out.println("Erigo.Baju C dengan harga 175000");
        System.out.print("Erigo.Baju yang anda beli bertipe : ");
        String jenisbaju = sc.nextLine();
        System.out.print("Jumlah baju yang akan anda beli : ");
        int jumlahbaju = sc.nextInt();
        Baju erigo = new Baju(jenisbaju, jumlahbaju);
        erigo.tampilan();
    }
}
