package org.example;

public class GasolineCar extends AFuelCar {

    public int Gasoline;

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){

        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    public String getFuelType() {

        return "Gasoline";
    }

    public int getRegistrationFee() {

        int fee = 0;

        if (getKmPrLitre() <= 4) {
            fee = 10470;
        }

        if (getKmPrLitre() >= 5 && getKmPrLitre() <= 9) {
            fee = 5500;
        }

        if (getKmPrLitre() >= 10 && getKmPrLitre() <= 14) {
            fee = 2340;
        }

        if (getKmPrLitre() >= 15 && getKmPrLitre() <= 19) {
            fee = 1050;
        }

        if (getKmPrLitre() >= 20 && getKmPrLitre() <= 50) {
            fee = 330;
        }

        return fee;
    }
        @Override
        public String toString () {

            return "\n" + super.toString() + "\n" + "---------------------------------------------------------------------------------------" + "\n";
        }
}
