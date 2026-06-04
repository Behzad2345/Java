/*Assignment 3: Thread Priority
Objective: Learn thread priorities.
Task: Create HighPriority, MediumPriority and LowPriority threads. Assign MAX_PRIORITY,
NORM_PRIORITY and MIN_PRIORITY respectively. Print each thread's name and priority five
times. Compare execution order. */

class HighPriority extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Priority: " + getPriority());
        }
    }
}

class MediumPriority extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Priority: " + getPriority());
        }
    }
}

class LowPriority extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Priority: " + getPriority());
        }
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        HighPriority high = new HighPriority();
        MediumPriority medium = new MediumPriority();
        LowPriority low = new LowPriority();

        // Set thread names
        high.setName("HighPriority");
        medium.setName("MediumPriority");
        low.setName("LowPriority");

        // Set priorities
        high.setPriority(Thread.MAX_PRIORITY);     // 10
        medium.setPriority(Thread.NORM_PRIORITY);  // 5
        low.setPriority(Thread.MIN_PRIORITY);      // 1

        // Start threads
        high.start();
        medium.start();
        low.start();
    }
}