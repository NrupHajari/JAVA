/* 
class myThread extends Thread {

    public myThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println("My Thread is Running.");
        // System.out.println("i am happy !");

    }
}



public class thread_constructor {
    public static void main(String[] args) {

        myThread t1 = new myThread("nrup");
        myThread t2 = new myThread("kano");

        t1.start();
        t2.start();

        System.out.println("name  Thread  is " + t1.getName());
        System.out.println("ID  Thread  is " + t1.getId());

        System.out.println("name  Thread  is " + t2.getName());
        System.out.println("ID  Thread  is " + t2.getId());

    }

}


*/

class myTh implements Runnable {

    public void run() {
        System.out.println("hyyyyyyy......");
    }
}

public class thread_constructor {
    public static void main(String[] args) {

        myTh bullet = new myTh();
        Thread gun = new Thread(bullet, "kano");

        gun.start();
        System.out.println(gun.getId());
        System.out.println(gun.getName());

    }
}