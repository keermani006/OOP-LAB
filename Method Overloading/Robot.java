class Robot {
    // Perform a task without a tool
    void performTask(String task) {
        System.out.println("Robot is performing: " + task);
    }

    // Perform a task with a tool
    void performTask(String task, String tool) {
        System.out.println("Robot is performing: " + task + " using " + tool);
    }

    // Perform a task with a tool and duration
    void performTask(String task, String tool, int duration) {
        System.out.println("Robot is performing: " + task + " using " + tool + " for " + duration + " minutes.");
    }

    public static void main(String[] args) {
        Robot r = new Robot();
        r.performTask("cleaning");
        r.performTask("painting", "brush");
        r.performTask("drilling", "drill machine", 30);
    }
}
