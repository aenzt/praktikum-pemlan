package BikiniBottom;

public class MahasiswaFilkom extends Manusia{
    private String NIM;
    private double IPK;

    MahasiswaFilkom(String NIM, double IPK, String nama, String NIK, boolean jenisKelamin, boolean menikah){
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus(){
        String tahun = getNIM().substring(0,2);
        String prodi = String.valueOf(getNIM().charAt(6));
        String prodiString;
        switch (prodi) {
            case "2" -> prodiString = "Teknik Meniup Gelembung";
            case "3" -> prodiString = "Teknik Berburu Ubur Ubur";
            case "4" -> prodiString = "Sistem Perhamburgeran";
            case "6" -> prodiString = "Pendidikan Chum Bucket";
            case "7" -> prodiString = "Teknologi Telepon Kerang";
            default -> throw new IllegalArgumentException();
        }
        return String.format("%s, 20%s", prodiString, tahun);
    }

    public double getBeasiswa(){
        if(getIPK() >= 3.0   && getIPK()<= 3.5){
            return 50;
        }else if(getIPK() >= 3.5 && getIPK() <= 4.0){
            return 75;
        }
        return 0;
    }

    public String toString(){
        return
                "========== DAFTAR MAHASISWA ==========" +
                        "\nNama\t\t\t: "+ getNama()+
                        "\nNIK\t\t\t\t: "+ getNIK()+
                        "\nJenis Kelamin\t: "+ (isJenisKelamin()?"Laki-laki" : "Perempuan") +
                        "\nPendapatan\t\t: "+ (getBeasiswa() + super.getPendapatan()) + "$" +
                        "\nNIM\t\t\t\t: " + getNIM()+
                        "\nIPK\t\t\t\t: " + getIPK()+
                        "\nStatus\t\t\t: " + getStatus()+ "\n" +
                        "======================================" + "\n";
    }
}
