package logic.threads.basics;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Active Thread Count
        /*System.out.println(Thread.activeCount());*/

        // Renames & prints name of main thread
        /*Thread.currentThread().setName("Main_Method_Baby!");
        System.out.println(Thread.currentThread().getName());*/

        // Sets & prints priority of main thread
        /*Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());*/

        /*System.out.println(Thread.currentThread().isAlive());*/

        // Iterates for loop with 1 second delays in main thread!
        /*for(int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are done!");*/

        // Initializes another thread
        /*MyThread thread2 = new MyThread();*/

        // Prints if new thread is Daemon(low-priority)
        /*System.out.println(thread2.isDaemon());
        thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());*/

        // Starts & prints whether new thread is alive
        /*thread2.start();
        System.out.println(thread2.isAlive());*/

        // Sets & prints new thread name
        /*thread2.setName("2nd Thread");
        System.out.println(thread2.getName());*/

        // Sets & prints new thread priority
        /*thread2.setPriority(1);
        System.out.println(thread2.getPriority());*/
    }
}
