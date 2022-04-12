package UTP;

//Nama Praktikan : Muhammad Raihan Parama Latief
//Kelas Praktikan : TI E


import java.util.Arrays;

class Antrian {
    private String name;
    private String phoneNumber;
    private String licenseNumber;
    private Layanan[] layanans;
    private int totalPrice;

    // Helper index in layanans
    private int indexLayanan;

    // Constructor
    public Antrian(String name, String phoneNumber, String licenseNumber){
        setName(name);
        setPhoneNumber(phoneNumber);
        setLicenseNumber(licenseNumber);
        this.indexLayanan = 0;
        setLayanans(new Layanan[3]);
        setTotalPrice(0);
    }

    // Basic Setter

    public void setName(String name){
        this.name =  name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber =  phoneNumber;
    }

    public void setLicenseNumber(String licenseNumber){
        this.licenseNumber =  licenseNumber;
    }

    public void setLayanans(Layanan[] layanans){
        this.layanans = layanans;
    }

    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }

    // Basic Getters

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getLicenseNumber(){
        return licenseNumber;
    }

    public Layanan[] getLayanan(){
        return layanans;
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    // Public helper getFormatted Price
    // Ini nanti juga ditanyakan
    public String getFormattedPrice(){
        return Helper.getFormattedPrice(getTotalPrice());
    }

    // To String return a formattet string of layanan
    // Mengembalikan formatted string terhadap Antrian sesuai dengan gambar yang terlampir
    public String toString(){
        // Rubah Kode di sini
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Name\t\t\t: %s\n", getName()));
        stringBuilder.append(String.format("Phone\t\t\t: %s\n", getPhoneNumber()));
        stringBuilder.append(String.format("License\t\t\t: %s\n", getLicenseNumber()));
        stringBuilder.append("Daftar Layanan\t:\n");
        for (int i = 0; i < layanans.length; i++) {
            if(layanans[i] == null){
                continue;
            }
            stringBuilder.append("-".repeat(90));
            stringBuilder.append("\n");
            stringBuilder.append(String.format("Layanan Nomor\t: %d\n", i + 1));
            stringBuilder.append(layanans[i].toString());
            stringBuilder.append("\n");
            stringBuilder.append(layanans[i].getFormattedPrice());
            stringBuilder.append("\n");
        }
        stringBuilder.append("-".repeat(90));
        stringBuilder.append("\n");
        stringBuilder.append(String.format("Total\t\t\t: Rp. %,d\n", getTotalPrice()));
        return stringBuilder.toString();
    }

    // Helper untuk menambahkan layanan
    // Fungsi helper ketika akan menambahkan daftar layanan
    public void addLayanan(Layanan layanan){
        this.layanans[indexLayanan] = layanan;
        addTotalPrice(layanan.getPrice());
        indexLayanan++;
        // Rubah kode di sini
    }

    // Helper untuk menambahkan totalPrice
    // Fungsi helper ketika akan menambahkan totalPrice
    public void addTotalPrice(int layananPrice){
        totalPrice = totalPrice +layananPrice;
        // Rubah kode di sini
    }
}
