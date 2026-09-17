class NeedForSpeed {

    int speed;
    int battery = 100;
    int distanceDriven;
    int batteryDrain;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (this.battery >= this.batteryDrain) {
            this.distanceDriven += speed;
            this.battery -= batteryDrain;
        }



    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {

        while (!car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven >=this.distance;
    }
}
