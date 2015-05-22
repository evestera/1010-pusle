public class Car {
    public static Car withSpeed(int speed) {
        if (speed > 200) return new SportsCar();
        if (speed < 50) return new Lada();
        return new Car();
    }
}

class SportsCar extends Car {}

class Lada extends Car {}