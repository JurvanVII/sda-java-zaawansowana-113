import vehicles.Car;

public class VehiclesMain {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("AUDI", "R8");
        cars[1] = new Car("Subaru", "Forrester");
        cars[2] = new Car("Polonez", "Caro");
        cars[3] = new Car("Volkswagen", "Arteon");
        cars[4] = new Car("AUDI", "S7");

        System.out.println(cars[0]);

//        cars[4].setModel("S8");

        Car fifthCar = cars[4];
        fifthCar.setModel("S8"); //uzyto tego samego miejsce w pamieci, zmieniono

        for (Car car : cars) {
            car.show();
        }

    }
}
