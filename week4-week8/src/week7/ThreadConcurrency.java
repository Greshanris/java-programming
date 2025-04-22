package week7;

/*
5. Thread Synchronization
    - When multiple threads share resources (like a variable), we need synchronization to avoid unpredictable results.
    - The example demonstrates a basic concurrency issue.
 */
// Week 7, Day-2: Wednesday, April 16, 2025

public class ThreadConcurrency extends Thread {

    public static int amount = 0;

    @Override
    public void run() {
       amount++;
    }

    public static void main(String[] args) {
        // creates a new object "Th"
        ThreadConcurrency th = new ThreadConcurrency();
        // starts a new thread, and the thread increments "amount" in run().
        th.start();

        // Waits for the thread to finish (while (th.isalive()) where increment is happening
        while (th.isAlive()) {
            System.out.println("Thread is waiting");
        }

        // then, prints the first amount
        System.out.println("First amount: " + amount);
        amount++;
        System.out.println("Second amount: " + amount);
    }
}
