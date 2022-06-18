package PakIrwan;

public class Sales extends Pegawai{

    private int penjualan;
    private double komisi;

    Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji() {
        return penjualan * komisi;
    }

    @Override
    public String toString() {
        return String.format("""
                Sales\t\t\t: %s
                No. KTP\t\t\t: %s
                Total Penjualan\t: %s Penjualan
                Besaran Komisi\t: %s
                Pendapatan\t\t: Rp %,.0f
                """, getNama(), getNoKTP(), getPenjualan(), getKomisi(), gaji());
    }
}
