/*Assignment 2: Concurrent Number Printing
Objective: Understand concurrent execution of multiple threads.
Task: Create three threads. Thread 1 prints numbers 1–20, Thread 2 prints even numbers 2–20,
Thread 3 prints odd numbers 1–19. Observe and explain the output sequence. */

class Thread1 extends Thread {

    public void run() {
        System.out.println("Thread 1: Numbers 1 to 20");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

class Thread2 extends Thread {

    public void run() {
        System.out.println("Thread 2: Even Numbers");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

class Thread3 extends Thread {

    public void run() {
        System.out.println("Thread 3: Odd Numbers");
        for (int i = 1; i <= 19; i += 2) {
            System.out.println(i);
        }
    }
}

public class ConcurrentNumberPrinting {

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}