package Erigo;

import java.util.Locale;
import java.util.Scanner;

public class TestErigo {
    public static void main(String[] args) {
        String jenis;
        int qty, subtotal = 0, harga = 0;
        Scanner input = new Scanner(System.in);
        Erigo erigo = new Erigo();
        System.out.println("Jaket yang tersedia : ");
        System.out.printf(Locale.ITALY,"Jaket A dengan harga %,d %n", erigo.getJaketA());
        System.out.printf(Locale.ITALY,"Jaket B dengan harga %,d %n", erigo.getJaketB());
        System.out.printf(Locale.ITALY,"Jaket C dengan harga %,d %n", erigo.getJaketC());

        System.out.print("Erigo.Baju yang akan dibeli : ");
        jenis = input.nextLine();
        System.out.print("Jumlah baju yang akan dibeli : ");
        qty = input.nextInt();
        input.nextLine();

        if(jenis.equalsIgnoreCase("a")){
            erigo.setQtyA(qty);
            harga = erigo.getJaketA();
            subtotal = erigo.getHargaA();
        }else if (jenis.equalsIgnoreCase("b")){
            erigo.setQtyB(qty);
            harga = erigo.getJaketB();
            subtotal = erigo.getHargaB();
        }else if (jenis.equalsIgnoreCase("c")){
            erigo.setQtyC(qty);
            harga = erigo.getJaketC();
            subtotal = erigo.getHargaC();
        }else{
            System.out.println("Input tidak valid!");
            System.exit(1);
        }
        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.printf(Locale.ITALY, "Harga perbuah : %,d %n", harga);
        System.out.printf(Locale.ITALY,"Total harga : %,d %n", subtotal);
    }
}
