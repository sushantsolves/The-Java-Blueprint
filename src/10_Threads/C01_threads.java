/*
Softwares --> OS --> Hardware(CPU ram, etc.)
*/



/*
 * WHAT IS A THREAD?
 * A thread is a lightweight unit of execution within a process.
 * It allows multiple tasks to make progress concurrently.
 *
 * WHY DO WE NEED THREADS?
 * 1. To perform multiple tasks concurrently.
 * 2. To keep applications responsive.
 * 3. To handle multiple client requests on servers.
 * 4. To perform background tasks like downloading files.
 *
 * NOTE:
 * Concurrency means tasks make progress over overlapping periods.
 * Parallelism means tasks execute simultaneously on multiple cores.
 */

class MyTask extends Thread {

    // run() contains the code executed by this thread.
    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            // Get the name of the currently executing thread.
            System.out.println(
                Thread.currentThread().getName() + " : " + i
            );

            try {
                // Pause the current thread for 500 milliseconds.
                Thread.sleep(500);

            } catch (InterruptedException e) {

                // Restore the interrupted status.
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

public class C01_threads {

    public static void main(String[] args) {

        // Create two thread objects.
        MyTask t1 = new MyTask();
        MyTask t2 = new MyTask();

        // Assign names to the threads.
        t1.setName("Thread-A");
        t2.setName("Thread-B");

        // start() starts a new thread that executes run().
        t1.start();
        t2.start();

        // The main thread can continue while they execute.
        System.out.println("Main thread continues...");
    }
}

/*
 * IMPORTANT NOTES:
 *
 * 1. start() starts a new thread of execution.
 * 2. run() called directly is an ordinary method call.
 * 3. Thread execution order is not guaranteed.
 * 4. Thread.sleep(500) pauses the current thread
 *    for approximately 500 milliseconds.
 * 5. join() makes the calling thread wait for another
 *    thread to finish.
 * 6. synchronized helps protect shared data from unsafe
 *    concurrent access.
 * 7. A race condition occurs when results depend on the
 *    timing of concurrent operations.
 * 8. Deadlock occurs when threads wait indefinitely for
 *    resources held by one another.
 *
 * THREAD CREATION METHODS:
 * A. Extend the Thread class.
 * B. Implement the Runnable interface.
 *
 * INDUSTRY NOTE:
 * Runnable and ExecutorService are commonly preferred
 * for separating tasks from thread management.
 */

