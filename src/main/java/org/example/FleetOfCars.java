package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car){

        fleet.add(car);
    }
    public int getTotalRegistrationFeeForFleet(){

        int sum = 0;

        for(Car i : fleet){
            sum = i.getRegistrationFee();
        }

        return sum;
    }

    public void fileScanner() {

        try {
            FileWriter writer = new FileWriter("fleetOfCars.txt");
            for (Car c : fleet) {
                String textTosave = c.toString();
                writer.write(textTosave + "\n");
            }
            writer.close();
        } catch(IOException e)
        {
            System.out.println("noget gik galt ved skrivning til fil");
        }

/*
        File file = new File("C:\\Users\\danie\\Desktop\\CarFleetTax\\src\\main\\java\\org\\example\\FleetofCars.txt");

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            System.out.println(scan.nextLine());

 */
    }

    @Override
    public String toString(){

        String k = "";

        for(Car i : fleet){
            k += ""+ i + "";
        }

        return k;
    }
}

