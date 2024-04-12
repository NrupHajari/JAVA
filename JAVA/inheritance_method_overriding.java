/* 

// method overriding 


class A{
    public void method(){
      System.out.println("i am method of class A");
    }
}

class B extends A{
    @override                   // aa keyword use karo k na karo farak na pade khali khabar pade aa jagya e override thayu che 
    public void method(){                               // method overriding 
        System.out.println("i am method of class B");
    }
}

public class inheritance_method_overriding {
    public static void main(String[] args) {

        A a= new A();
        a.method();           // aa class A nu print kare

        B b =new B();
        b.method();         // aa class B nu print kare (override) 
        
    }

    
}

*/

// Dynamic Method Dispatch

class phone{
    public void sowtime(){
        System.out.println("time is money !");
    }
    public void call(){
        System.out.println(" calling phone.....");
    }
}

class smartphone extends phone{
    public void music(){
        System.out.println("playing song... ");
    }
    @Override
    public void call(){                        // overriding method 
        System.out.println("calling smartphone......");
    }
}

public class inheritance_method_overriding{
    public static void main(String[] args) {
        
        // phone p = new phone();
        // p.sowtime();

        // smartphone sp = new smartphone();
        // sp.music();

 //Dyanamic method
        phone obj = new smartphone();  // phone obj--> refernce , new smartphone --> object(this is allowed)
        //smartphone obj2 = new phone --> not allowed

        obj.sowtime();
        obj.call(); // aa smartphone na call method ne call karse,  che to smartphone ne bhai bhale refer phone hoy che smartphone atle
       // obj.music();  --> not allowed (tame pela kidhu aa phone che bhale smartphone hoy pacchi e em j ke mu phone hov to music na karu ...)

    }
}