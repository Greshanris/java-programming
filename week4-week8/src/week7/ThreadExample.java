package week7;

/*
3. Basic Threading
    - Threads allow multiple tasks to run concurrently.
    - The example extends the "Thread" class to create a thread that runs alongside the main program,
 */
// Week 7, Day-2: Wednesday, April 16, 2025


// Inheriting Thread and overriding run(): defines what the thread does
public class ThreadExample extends Thread {
    // here, overriding the run() method: printing "Thread 1" 10,000 times
    @Override
    public void run() {
        for(int i=0; i<10000; i++) {
            System.out.println("Thread 1");
        }
    }

    // main function
    public static void main(String[] args) {
        // Created new object "thread" using ThreadExample()
        ThreadExample thread = new ThreadExample();
        // runs the thread concurrently with the main program
        thread.start();

        // The main program prints "Main Thread" 10,000 times
        for(int i = 0; i < 10000; i++) {
            System.out.println("Main thread");
        }

        /*
        Concurrency:
            - Both loops run at the same time, so the output is interleaved
            - e.g.: Thread 1
                    Main thread
                    Thread 1
                    Main thread
                    ...

         start(): creates a new thread; calling run() directly would run it sequentially, not concurrently.
         */
    }
}
