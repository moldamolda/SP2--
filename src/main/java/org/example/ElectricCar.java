package org.example;

public class ElectricCar extends ACar {
    public int batteryCapacity;
    public int maxRangeKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors,int batteryCapacity, int maxRangeKm){

        super(registrationNumber,make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRangeKm = maxRangeKm;
    }

    public int getBatteryCapacityKWH(){

        return batteryCapacity;
    }

    public int getMaxRangeKm(){

        return maxRangeKm;
    }

    public int getWhPrKm(){

        return batteryCapacity*1000/maxRangeKm;
    }

    public int getRegistrationFee() {

        int fee = 0;
        int kmPrLitre = (int)Math.floor(100/(getWhPrKm()/91.25));

        if (kmPrLitre <= 4) {
            fee = 10470;
        }

        if (kmPrLitre >= 5 && kmPrLitre <= 9) {
            fee = 5500;
        }

        if (kmPrLitre >= 10 && kmPrLitre <= 14) {
            fee = 2340;
        }

        if (kmPrLitre >= 15 && kmPrLitre <= 19) {
            fee = 1050;
        }

        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            fee = 330;
        }

        return fee;
    }

    @Override
    public String toString(){

        return super.toString() + " | " + "Batterikapacitet: " + batteryCapacity + " " + "Max km range: " + maxRangeKm + "\n" + "---------------------------------------------------------------------------------------" + "\n";
    }
}
