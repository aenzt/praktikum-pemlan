package PakIrwan;

public class PegawaiTetap extends Pegawai{
    private double upah;

    PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public double gaji() {
        return upah;
    }

    @Override
    public String toString() {
        return String.format("""
                Pegawai Tetap\t: %s
                No. KTP\t\t\t: %s
                Upah\t\t\t: %s
                Pendapatan\t\t: Rp %,.0f
                """, getNama(), getNoKTP(), getUpah(), gaji());
    }
}
