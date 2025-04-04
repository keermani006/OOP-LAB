class Game {
    void startGame() {
        System.out.println("Game has started.");
    }
}

class Chess extends Game {
    void movePiece() {
        System.out.println("Moving a chess piece.");
    }
}

class Football extends Game {
    void kickBall() {
        System.out.println("Kicking the football.");
    }
}

public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        Chess c = new Chess();
        c.startGame(); // Inherited
        c.movePiece(); // Own method

        Football f = new Football();
        f.startGame(); // Inherited
        f.kickBall();  // Own method
    }
}
