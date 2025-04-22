package week7;

/*
4. Threading with Runnable
    - Another way to create threads is by implementing the "Runnable" interface
    - which is ofter preferred over extending "Thread" because it allows more flexibility.
    - We can extend another class.
 */
// Week 7, Day-2: Wednesday, April 16, 2025

public class ThreadRunnableExample implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            System.out.println("Thread1");
        }
    }

    public static void main(String[] args) {
        ThreadRunnableExample thread = new ThreadRunnableExample();
        thread.run();
        for(int i = 0; i < 10000; i++) {
            System.out.println("Thread2");
        }
    }
}
