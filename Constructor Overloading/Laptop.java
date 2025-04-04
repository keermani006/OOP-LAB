class Laptop {
    String brand;
    int ram;

    // Default Constructor
    Laptop() {
        brand = "Unknown";
        ram = 4;
    }

    // Parameterized Constructor 1
    Laptop(String b) {
        brand = b;
        ram = 8;
    }

    // Parameterized Constructor 2
    Laptop(String b, int r) {
        brand = b;
        ram = r;
    }

    void show() {
        System.out.println("Brand: " + brand + ", RAM: " + ram + "GB");
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("Dell");
        Laptop l3 = new Laptop("HP", 16);

        l1.show();
        l2.show();
        l3.show();
    }
}
