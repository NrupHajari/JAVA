/* 

// THREAD priority


class myThread extends Thread {

    public myThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {

            System.out.println("My Thread is Running .  " + this.getName());
            // System.out.println("i am happy !");
            i++;

        }

    }
}

public class Thread_priority {
    public static void main(String[] args) {
        myThread t1 = new myThread("nrup 1");
        myThread t2 = new myThread("nrup 2");
        myThread t3 = new myThread("nrup 3 (min)");
        myThread t4 = new myThread("nrup 4");
        myThread t5 = new myThread("nrup 5 (most priority)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority((Thread.MIN_PRIORITY));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}


*/

class myThread1 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {

            System.out.println("My Thread is Running .  ");

            try {
                Thread.sleep(455);
            } catch (InterruptedException e) { // some time mate j processor ani pase hoy
                System.out.println(e);
            }

            i++;

        }

    }
}

class myThread2 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {

            System.out.println("i am happy !");
            i++;

        }

    }
}

public class Thread_priority {
    public static void main(String[] args) {

        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();

        System.out.println(t2.getState());

        t1.start();

        // try {
        // t1.join(); // first t1 run then t2 run use join method (pela t1 run thase jya
        // //sudhi e puri nai thay tya sudhi. pachi j t2 run thase )
        // }

        // catch (Exception e) {
        // System.out.println(e);
        // }

        t2.start();

        System.out.println(t2.getState());
        System.out.println(t2.currentThread().getState());
    }
}