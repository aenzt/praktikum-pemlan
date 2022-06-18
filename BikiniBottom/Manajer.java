package BikiniBottom;

public class Manajer extends Pekerja{
    private int lamaKerja;

    Manajer(int lamaKerja, int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah){
        super(jamKerja, hariKerja,NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public String toString() {
        return
                "========== DAFTAR PEKERJA ==========" +
                        "\nNama\t\t\t: "+ getNama()+
                        "\nNIK\t\t\t\t: "+ getNIK()+
                        "\nJenis Kelamin\t: "+ (isJenisKelamin()?"Laki-laki" : "Perempuan") +
                        "\nPendapatan\t\t: "+ (getGaji() + getBonus() + super.getPendapatan()) + "$" +
                        "\nBonus\t\t\t: "+ getBonus()+ "$" +
                        "\nGaji\t\t\t: "+ getGaji()+ "$" +
                        "\nStatus\t\t\t: "+ getStatus() +"\n"+
                        "=====================================\n";
    }
}
