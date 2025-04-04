class Appliance {
    void consumeElectricity() {
        System.out.println("Appliance consumes electricity.");
    }
}

class WashingMachine extends Appliance {
    void washClothes() {
        System.out.println("Washing Machine is washing clothes.");
    }
}

class Refrigerator extends Appliance {
    void keepFoodFresh() {
        System.out.println("Refrigerator keeps food fresh.");
    }
}

public class HierarchicalInheritance1 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.consumeElectricity(); // Inherited
        wm.washClothes();        // Own method

        Refrigerator fridge = new Refrigerator();
        fridge.consumeElectricity(); // Inherited
        fridge.keepFoodFresh();      // Own method
    }
}
