package Erigo;

public class Baju {
    String jenis;
    int harga;
    int jumlah;
    public Baju (String a, int b){
        this.jenis = a;
        this.jumlah = b;
    }

    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    void hargaA(){
        if(jumlah>100)
            harga = 95000;
        else
            harga = bajua;
    }
    void hargaB(){
        if(jumlah>100)
            harga = 120000;
        else
            harga = bajub;
    }
    void hargaC(){
        if(jumlah>100)
            harga = 160000;
        else
            harga = bajuc;

    }

    void tampilan(){
        if (jenis.equalsIgnoreCase("a"))
            hargaA();
        else if (jenis.equalsIgnoreCase("b"))
            hargaB();
        else if (jenis.equalsIgnoreCase("c"))
            hargaC();

        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga*jumlah);

    }
}
