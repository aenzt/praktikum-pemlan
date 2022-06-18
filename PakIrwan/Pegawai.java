package PakIrwan;

public abstract class Pegawai {
    private String nama;
    private String noKTP;

    Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    @Override
    public abstract String toString();

    public abstract double gaji();
}
