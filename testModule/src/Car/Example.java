package Car;

import Car.Car;

public class Example {
    public static void  main (String[] args){
        Car car = new Car("BMW", true, 0, 100.40);
        car.printCar();
        System.out.println("===> zmieniam wartosc");

        car.setMilleage(100);

        System.out.println("nowy przebieg:" + car.getMilleage());

    }
}
