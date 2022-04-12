package UTP;

//Nama Praktikan : Muhammad Raihan Parama Latief
//Kelas Praktikan : TI E


class Helper {

    // Helper to initialize
    static void initialize(){
        // Initilaize admin
        Main.admins[0] = new Admin("Joko", "ini_password_joko");
        Main.admins[1] = new Admin("Dengklek", "ini_password_dengklek");

        // Initialize Layanan
        Main.layanans[0] = new Layanan("Ganti Oli", 500_000, "Layanan ganti oli adalah layanan standar untuk mengganti oli pada mesin.");
        Main.layanans[1] = new Layanan("Operasi Mobil", 2_000_000, "Tenang, kami memiliki tenaga ahli untuk mengoperasi mobil Anda. Cukup dengan Rp. 2.000.000, mobil Anda akan sehat seperti sedia kala");
        Main.layanans[2] = new Layanan("Ketok Magic", 3_000_000, "Ketok Magic adalah layanan sulap untuk menghilangkan penyok pada body mobil.");
        Main.layanans[3] = new Layanan("Modifikasi Mobil Racing", 5_000_000, "Modifikasi mobil kalian dengan tambahan NOS, serta body standar untuk balapan");
        Main.layanans[4] = new Layanan("Modifikasi Mobil Elektrik", 5_500_500, "Anda dapat mengubah mesin yang bertenagakan fosil menjadi bertenaga listrik");
        // Masukkan daftar-daftar layanan bersesuaian dengan dokumen
    }

    // Helper function to authentication
    // Fungsi yang digunakan untuk "melakukan loop" pada iterasi admins
    static boolean authentication(String username, String password) {
        for (Admin admin:
             Main.admins) {
            if(admin.isMatch(username, password)){
                return true;
            }
        }
        return false;
    }

    // Helper to format price to rupiah
    static String getFormattedPrice(int price){
        return String.format("Price\t\t\t: Rp. %,d", price);
    }
}
