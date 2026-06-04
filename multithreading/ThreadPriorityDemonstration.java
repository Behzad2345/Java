/*Assignment 5: Thread Priority Demonstration
Objective: Analyze priorities.
Task: Create five threads with priorities from 1 to 10. Each prints its name 10 times. Record
execution over multiple runs and conclude whether higher priorities always execute first. */

class MyThread extends Thread {

    public MyThread(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " (Priority: " + getPriority() + ")");
        }
    }
}

public class ThreadPriorityDemonstration {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread-1", 1);
        MyThread t2 = new MyThread("Thread-2", 3);
        MyThread t3 = new MyThread("Thread-3", 5);
        MyThread t4 = new MyThread("Thread-4", 7);
        MyThread t5 = new MyThread("Thread-5", 10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}