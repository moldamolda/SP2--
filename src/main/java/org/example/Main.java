package org.example;

public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

        Car c1 = new GasolineCar("AX930","Jaguar","XJR",5,10);
        Car c2 = new DieselCar("BC123","Suzuki","Swift",3,16,true);
        Car c3 = new ElectricCar("AD7654","Jaguar","XJR",5,400, 12);

        fleet.addCar(c1);
        fleet.addCar(c2);
        fleet.addCar(c3);

        System.out.println(fleet);

        System.out.println("----------------------------------------------------------------------------------------"+"\n"+"totale registreringsafgift: " + fleet.getTotalRegistrationFeeForFleet()+"\n"+"---------------------------------------------------------------------------------------");

        fleet.fileScanner();

    }
}