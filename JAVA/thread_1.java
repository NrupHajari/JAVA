/* 
//class extends method create THREAD


class myThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("My Thread is Running.");
            System.out.println("i am happy !");
            i++;
        }
    } 
}

class myThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thread 2 ia available.");
            System.out.println("i am sad !");
            i++;
        }
    }
}

public class thread_1 {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();

        t1.start();
        t2.start();
    }
}


*/

//  interface implements Runnable create THREADS

class myThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("My Thread is Running.");
            System.out.println("i am happy !");
            i++;
        }
    }
}

class myThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thread 2 is available.");
            System.out.println("i am sad !");
            i++;
        }
    }
}

public class thread_1 {
    public static void main(String[] args) {
        myThreadRunnable1 bullet1 = new myThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        myThreadRunnable2 bullet2 = new myThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}