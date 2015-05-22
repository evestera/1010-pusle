interface Car {
    void start();
    void turnLeft();
    void turnRight();
    void stop();
}

class CarLogger implements Car {
    Car decorated;

    public CarLogger(Car decorated) {
        this.decorated = decorated;
    }

    void start() {
        log("starting");
        decorated.start();
    }

    void turnLeft() {
        log("turning left");
        decorated.turnLeft();
    }

    void turnRight() {
        log("turning right");
        decorated.turnRight();
    }

    void stop() {
        log("stopping");
        decorated.stop();
    }
}