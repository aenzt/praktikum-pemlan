package BikiniBottom;

public class MainFile {
    static Manusia manusia[];
    static MahasiswaFilkom mahasiswa[];
    static Pekerja pekerja[];
    static Manajer manajer[];

    public static void main(String[] args) {
        // Class Manusia
        manusia = new Manusia[3];
        System.out.println(" Class Manusia ");
        manusia[0] = new Manusia("Irene Bae", "215150707111037", false, true);
        manusia[1] = new Manusia("Kang Seulgi", "215612620784", true, true);
        manusia[2] = new Manusia("Yerim Kim", "215124072994", true, false);
        System.out.println(manusia[0].toString());
        System.out.println(manusia[1].toString());
        System.out.println(manusia[2].toString());

        // Class MahasiswaFILKOM
        mahasiswa = new MahasiswaFilkom[3];
        System.out.println(" Class Mahasiswa ");
        mahasiswa[0] = new MahasiswaFilkom("205150600111002", 3.9, "Kim Jisoo", "199925029106", false, true);
        mahasiswa[1] = new MahasiswaFilkom("185150200111002", 3.8, "Oh Sehun", "2003829374606", false, false);
        mahasiswa[2] = new MahasiswaFilkom("215150707111037", 4.0, "Bae Suzy", "2002682923109", true, false);
        System.out.println(mahasiswa[0].toString());
        System.out.println(mahasiswa[1].toString());
        System.out.println(mahasiswa[2].toString());

        // Class Pekerja
        pekerja = new Pekerja[3];
        System.out.println(" Class Pekerja ");
        pekerja[0] = new Pekerja(8, 29, "103127529647", "Kim Sejeong", "2933242352517", true, true);
        pekerja[1] = new Pekerja(9, 28, "704325829957", "Han So Hee", "243245245242", false, true);
        pekerja[2] = new Pekerja(7, 30, "3  052257291648", "Kim Taeri", "203245244513", true, false);
        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());

        // Class Manager
        manajer = new Manajer[3];
        System.out.println(" Class Manajer ");
        manajer[0] = new Manajer(1000, 6, 30, "104225229106", "Kim Jong Kook", "2001647443", false, true);
        manajer[1] = new Manajer(1500, 7, 24, "603225729106", "Sana", "1987456362362", true, true);
        manajer[2] = new Manajer(1450, 8, 20, "405225129106", "Kim Min Jeong", "193475135113", true, false);
        System.out.println(manajer[0].toString());
        System.out.println(manajer[1].toString());
        System.out.println(manajer[2].toString());

        // Jumlah
        System.out.println("Total Keseluruhan Terdaftar ");
        System.out.println("=================================================");
        System.out.println("Jumlah Manusia   : " + manusia.length);
        System.out.println("Jumlah Mahasiswa : " + mahasiswa.length);
        System.out.println("Jumlah Pekerja   : " + pekerja.length);
        System.out.println("Jumlah Manajer   : " + manajer.length);
    }
}
