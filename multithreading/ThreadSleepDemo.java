/*Assignment 4: Using sleep()
Objective: Understand thread suspension.
Task: Create two threads. One prints numbers 1–5 with 500 ms delay. Another prints A–E with 700
ms delay. Observe interleaving. */

class NumberThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number Thread: " + i);
            try {
                Thread.sleep(500); // Delay of 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class LetterThread extends Thread {

    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Letter Thread: " + ch);
            try {
                Thread.sleep(700); // Delay of 700 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadSleepDemo {

    public static void main(String[] args) {

        NumberThread t1 = new NumberThread();
        LetterThread t2 = new LetterThread();

        t1.start();
        t2.start();
    }
}