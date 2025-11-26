package com.xworkz.list.external;

import com.xworkz.list.dto.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRunner {
    public static void main(String[] args) {

        Car car  = new Car(true,  "BMW", 'A', 5600000);
        Car car1 = new Car(false, "Audi", 'B', 4500000);
        Car car2 = new Car(true,  "Mercedes", 'C', 6700000);
        Car car3 = new Car(true,  "Jaguar", 'D', 7200000);
        Car car4 = new Car(false, "Volkswagen", 'E', 2300000);
        Car car5 = new Car(true,  "Skoda", 'F', 2600000);
        Car car6 = new Car(true,  "Honda", 'G', 1800000);
        Car car7 = new Car(false, "Hyundai", 'H', 1500000);
        Car car8 = new Car(true,  "Kia", 'I', 1900000);
        Car car9 = new Car(true,  "Mahindra", 'J', 1700000);

        Car car10 = new Car(false, "Tata", 'K', 1400000);
        Car car11 = new Car(true,  "Suzuki", 'L', 1200000);
        Car car12 = new Car(true,  "Ford", 'M', 3300000);
        Car car13 = new Car(false, "Renault", 'N', 1100000);
        Car car14 = new Car(true,  "Nissan", 'O', 1600000);
        Car car15 = new Car(true,  "Chevrolet", 'P', 2000000);
        Car car16 = new Car(false, "Volvo", 'Q', 8000000);
        Car car17 = new Car(true,  "Land Rover", 'R', 9000000);
        Car car18 = new Car(false, "Porsche", 'S', 12000000);
        Car car19 = new Car(true,  "Lamborghini", 'T', 30000000);

        Car car20 = new Car(true,  "Ferrari", 'U', 25000000);
        Car car21 = new Car(false, "Bugatti", 'V', 40000000);
        Car car22 = new Car(true,  "Rolls Royce", 'W', 70000000);
        Car car23 = new Car(false, "Bentley", 'X', 55000000);
        Car car24 = new Car(true,  "Maserati", 'Y', 35000000);
        Car car25 = new Car(false, "Dodge", 'Z', 3000000);
        Car car26 = new Car(true,  "Jeep", 'P', 2800000);
        Car car27 = new Car(false, "Mini Cooper", 'Q', 3200000);
        Car car28 = new Car(true,  "Citroen", 'R', 2100000);
        Car car29 = new Car(false, "Peugeot", 'S', 1900000);
        Car car30 = new Car(true,  "Tesla", 'T', 5000000);

        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
        cars.add(car11);
        cars.add(car12);
        cars.add(car13);
        cars.add(car14);
        cars.add(car15);
        cars.add(car16);
        cars.add(car17);
        cars.add(car18);
        cars.add(car19);
        cars.add(car20);
        cars.add(car21);
        cars.add(car22);
        cars.add(car23);
        cars.add(car24);
        cars.add(car25);
        cars.add(car26);
        cars.add(car27);
        cars.add(car28);
        cars.add(car29);
        cars.add(car30);

        cars.forEach(n -> System.out.println(n));
    }
}

