package CarRent;

public class Main {
    public static void main(String[] args) {
        CarRider irene = new CarRider("Irene Bae", 29, "091123123");
        CarRider seulgi = new CarRider("Kang Seulgi", 27, "091312312");
        CarRider wendy = new CarRider("Wendy", 27, "091456567");
        CarRider joy = new CarRider("Joy", 25, "091231231");

        CarData data = new CarData();
        data.addCar("SPORT", "B 1234 A", "Ferrari");
        data.addCar("SUV", "B 1234 B", "Toyota");
        data.addCar("HATCHBACK", "B 1234 C", "Honda");
        data.addCar("SPORT", "B 1234 D", "BMW");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(irene, data.carList.get(0), 2);
        arsip.Rent(joy, data.carList.get(3), 4);
        arsip.Rent(wendy, data.carList.get(2), 5);
        arsip.Rent(seulgi, data.carList.get(2), 3);

        System.out.println();
        arsip.info();
    }
}
