interface Game {
    void start();
    void end();
}

class Cricket implements Game {
    public void start() {
        System.out.println("Cricket match started!");
    }

    public void end() {
        System.out.println("Cricket match ended!");
    }
}

class Football implements Game {
    public void start() {
        System.out.println("Football match started!");
    }

    public void end() {
        System.out.println("Football match ended!");
    }
}

public class InterfaceExample3 {
    public static void main(String[] args) {
        Game g1 = new Cricket();
        g1.start();
        g1.end();

        Game g2 = new Football();
        g2.start();
        g2.end();
    }
}
