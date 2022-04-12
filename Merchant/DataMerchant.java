package Merchant;

import java.util.Scanner;

public class DataMerchant {
    static Scanner input = new Scanner(System.in);
    static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahMerchant (Merchant merchant){

        int arrlength = DataMerchant.merc.length;
        Merchant[] temparr = new Merchant[arrlength + 1];

        System.arraycopy(DataMerchant.merc, 0, temparr, 0, arrlength);

        temparr[arrlength] = merchant;
        return temparr;
    }

    public static void tampilData(){
        for (Merchant merchant1: merc) {
            System.out.println("====Tampilan Data Merchant.Merchant UBFood====");
            System.out.println("Nama Merchant.Merchant\t: " + merchant1.getNamaMerchant());
            System.out.println("Nama Produk\t\t: " + merchant1.getNamaProduk());
            System.out.println("Harga\t\t\t: " + (int)merchant1.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant (String nama){
        return null;
    }

    public static void tampilMerchant(Merchant merchant){
        System.out.println("Method not implemented yet.");
    }

    public static void updateMerchant(Merchant merchant){
        System.out.println("Method not implemented yet.");
    }
}
