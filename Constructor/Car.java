class Car {
    String brand;
    int speed;

    // Constructor
    Car(String b, int s) {
        brand = b;
        speed = s;
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Car c = new Car("Toyota", 180);
        c.showDetails();
    }
}
