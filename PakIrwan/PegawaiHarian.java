package PakIrwan;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        if (totalJam <= 40){
            return upahPerJam * totalJam;
        }else{
            double timeTemp;
            double gajiTemp;

            gajiTemp = upahPerJam * 40;
            timeTemp = totalJam - 40;

            gajiTemp = gajiTemp + (timeTemp * upahPerJam * 1.5);
            return gajiTemp;
        }
    }

    @Override
    public String toString() {
        return String.format("""
                Pegawai Harian\t: %s
                No. KTP\t\t\t: %s
                Upah/jam\t\t: %s
                Total jam kerja\t: %d Jam
                Pendapatan\t\t: Rp %,.0f
                """, getNama(), getNoKTP(), getUpahPerJam(), getTotalJam(), gaji());
    }
}
