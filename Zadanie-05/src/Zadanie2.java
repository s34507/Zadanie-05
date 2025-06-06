class Vehicle {
    void start() {
        System.out.println("Pojazd uruchomiony.");
    }

    void stop() {
        System.out.println("Pojazd zatrzymany.");
    }
}
class Car extends Vehicle {
    private int numberOfSeats;

    Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    void start() {
        System.out.println("Samochód rusza.");
    }

    @Override
    void stop() {
        System.out.println("Samochód się zatrzymuje.");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car(5);
        car.start();
        car.stop();
        System.out.println("Liczba miejsc: " + car.getNumberOfSeats());
    }
}
