package BikiniBottom;

public class Pekerja extends Manusia{

    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah){
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        if(getJamKerja() > 7){
            gaji = (getHariKerja() * 7 * 15);
        }else{
            gaji = (getHariKerja() * getJamKerja() * 15);
        }
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        int libur = 0;
        for (int i = 1; i < getHariKerja(); i++) {
            if(i%7 == 0){
                libur+=2;
            }
        }
        double bonusLembur = (getHariKerja() - libur) * (getJamKerja() - 7) * 7;
        double bonusLibur = libur*getJamKerja()*20;
        bonus = bonusLembur + bonusLibur;
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus(){
        String kantorCabang = getNIP().substring(0,1);
        switch (kantorCabang) {
            case "1" -> kantorCabang = "Mondstadt";
            case "2" -> kantorCabang = "Liyue";
            case "3" -> kantorCabang = "Inazuma";
            case "4" -> kantorCabang = "Sumeru";
            case "5" -> kantorCabang = "Fontaine";
            case "6" -> kantorCabang = "Natlan";
            case "7" -> kantorCabang = "Snezhnaya";
            default -> System.out.println("Kantor Cabang Tidak Valid");
        }

        String cabangKe = " cabang ke-" + getNIP().charAt(2);
        String departemen = getNIP().substring(6,7);

        switch (departemen) {
            case "1" -> departemen = "Pemasaran";
            case "2" -> departemen = "Humas";
            case "3" -> departemen = "Riset";
            case "4" -> departemen = "Teknologi";
            case "5" -> departemen = "Personalia";
            case "6" -> departemen = "Akademik";
            case "7" -> departemen = "Administrasi";
            case "8" -> departemen = "Operasional";
            case "9" -> departemen = "Pembangunan";
            default -> System.out.println("Kantor Cabang Tidak Valid");
        }
        return departemen + ", "+ kantorCabang +cabangKe;
    }

    @Override
    public String toString(){
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
