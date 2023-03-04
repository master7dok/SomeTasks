public class MyThread {
    private int counter;

    public synchronized void increment(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.doWork();
    }

    private void doWork() throws InterruptedException {
        Thread myThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        Thread myThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        myThread1.start();
        myThread2.start();

        myThread1.join();
        myThread2.join();

        System.out.println(counter);
    }
}
