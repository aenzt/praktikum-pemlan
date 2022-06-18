package PakIrwan;

public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Andi", "123123123123", 2_000_000);
        PegawaiHarian pegawaiHarian = new PegawaiHarian("Bagas", "3213123123", 50000, 30);
        Sales sales = new Sales("Nindy", "456456789", 100, 10000);

        System.out.println(pegawaiTetap.toString());
        System.out.println(pegawaiHarian.toString());
        System.out.println(sales.toString());
    }
}
