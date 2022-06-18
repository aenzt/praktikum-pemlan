package CarRent;

import java.util.ArrayList;

public class RentArchive {

    ArrayList<CarRent> rentData = new ArrayList<>();

    public void Rent(CarRider rider, Car car, int rentDur){
        if(car.isStatus()){
            CarRent newCarRent = new CarRent(rider, car, rentDur);
            rentData.add(newCarRent);
            System.out.println("Mobil berhasil disewa");
            car.setStatus(false);
        }else{
            System.out.println("Maaf, mobil sudah disewa");
        }
    }

    public void info(){
        System.out.println("-".repeat(45));
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("-".repeat(45));

        for(CarRent data : rentData){

            System.out.println("NAMA PEMINJAM\t: " + data.getRider().getName());
            System.out.println("TIPE MOBIL\t\t: " + data.getCar().getCarType());
            System.out.println("NO POLISI\t\t: " + data.getCar().getPolNum());
            System.out.println("LAMA RENTAL\t\t: " + data.getRentDur());
            System.out.println("-".repeat(45));
        }
    }
}
