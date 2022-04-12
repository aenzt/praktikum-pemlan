package Erigo;

public class Erigo {
    private final int jaketA = 100_000;
    private final int jaketB = 125_000;
    private final int jaketC = 175_000;
    private int qtyA;
    private int qtyB;
    private int qtyC;

    public Erigo(){
        this.qtyA = 0;
        this.qtyB = 0;
        this.qtyC = 0;
    }

    public Erigo(int qtyA, int qtyB, int qtyC){
        this.qtyA = qtyA;
        this.qtyB = qtyB;
        this.qtyC = qtyC;
    }

    public int getJaketA() {
        if(qtyA > 100){
            return jaketA - 5000;
        }
        return jaketA;
    }

    public int getJaketB() {
        if(qtyB > 100){
            return jaketB - 5000;
        }
        return jaketB;
    }

    public int getJaketC() {
        if(qtyC > 100){
            return jaketC - 15000;
        }
        return jaketC;
    }

    public int getQtyA() {
        return qtyA;
    }

    public void setQtyA(int qtyA) {
        this.qtyA = qtyA;
    }

    public int getQtyB() {
        return qtyB;
    }

    public void setQtyB(int qtyB) {
        this.qtyB = qtyB;
    }

    public int getQtyC() {
        return qtyC;
    }

    public void setQtyC(int qtyC) {
        this.qtyC = qtyC;
    }

    public int getHargaA (){
        if (qtyA > 100) {
            return (jaketA - 5000) * qtyA;
        }
        return jaketA * qtyA;
    }

    public int getHargaB (){
        if (qtyB > 100) {
            return (jaketB - 5000) * qtyB;
        }
        return jaketB * qtyB;
    }

    public int getHargaC (){
        if (qtyC > 100) {
            return (jaketC - 15000) * qtyC;
        }
        return jaketC * qtyC;
    }
}
