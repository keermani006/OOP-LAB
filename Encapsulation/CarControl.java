class Car {
    private int speed;

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative.");
        }
    }

    public int getSpeed() {
        return speed;
    }
}

public class EncapsulationExample3 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setSpeed(80);
        System.out.println("Car Speed: " + myCar.getSpeed() + " km/h");
    }
}
