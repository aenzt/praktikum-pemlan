package CarRent;

import java.util.ArrayList;

public class CarData {

    ArrayList<Car> carList = new ArrayList<>();

    public void addCar(String carType, String polNum, String merk){
        Car newCar = new Car(carType, polNum, merk, true);
        carList.add(newCar);
    }

    public void listOfCar(){

        System.out.println("-".repeat(45));
        System.out.println("DAFTAR MOBIL");
        System.out.println("-".repeat(45));

        for (Car car : carList){
            System.out.println("TIPE MOBIL\t: " + car.getCarType());
            System.out.println("NO. POLISI\t: " + car.getPolNum());
            System.out.println("MERK MOBIL\t: " + car.getMerk());
            System.out.println("-".repeat(45));
        }
    }
}
