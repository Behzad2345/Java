/* Assignment 1: Creating Threads
Objective: Learn how to create and execute threads in Java.
Task: Write a Java program to create one thread by extending the Thread class and another by
implementing the Runnable interface. Display numbers from 1 to 10 from each thread and print the
name of the currently executing thread.*/

class NumberThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}

class NumberRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class ThreadCreationDemo {

    public static void main(String[] args) {

        // Creating thread by extending Thread class
        NumberThread thread1 = new NumberThread();
        thread1.setName("Thread-Class");

        // Creating thread by implementing Runnable interface
        NumberRunnable runnable = new NumberRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.setName("Runnable-Thread");

        // Start both threads
        thread1.start();
        thread2.start();
    }
}