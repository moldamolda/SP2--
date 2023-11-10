package org.example;

public class DieselCar extends AFuelCar {

    public boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter){

        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }


    public String getFuelType(){

        return "Diesel";
    }

    public String getRegistrationNumber() {

        return "";
    }
    public int getRegistrationFee() {

        int fee = 0;
        int nParticleFee = 1000;

            if (getKmPrLitre() <= 4) {
                fee = 10470 + 15260;
            }

            else if (getKmPrLitre() >= 5 && getKmPrLitre() <= 9) {
                fee = 5500 + 2770;
            }

            else if (getKmPrLitre() >= 10 && getKmPrLitre() <= 14) {
                fee = 2340 + 1850;
            }

            else if (getKmPrLitre() >= 15 && getKmPrLitre() <= 19) {
                fee = 1050 + 1390;
            }

            else if (getKmPrLitre() >= 20 && getKmPrLitre() <= 50) {
                fee = 330 + 130;
            }

            if (particleFilter){
                return fee;
            } else {
                return fee +nParticleFee;
            }
    }

    public boolean hasParticleFilter(){
        return particleFilter;
    }

    @Override
    public String toString(){
        return super.toString() + " | " + "partikelfilter? " + particleFilter + "\n" + "---------------------------------------------------------------------------------------" + "\n";
    }
}
