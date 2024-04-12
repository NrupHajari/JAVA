
class access{
    public int x =5;
    protected int y =23;
    int z= 44;   // default 
    private int a = 98;


    // same class use all modifiers
    public  void method1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }


}

class childaccess extends access{
    public void method2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
       // System.out.println(a);
    }
}


public class access_modifiers {
    public static void main(String[] args) {
        System.out.println("hyyyy");
        access c = new access();
        //same class all modifiers run
        c.method1();

        // same package ma 

        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
       // System.out.println(c.a);  --> same package ma private access na thay 


       childaccess c2 = new childaccess();
       c2.method2();


       // subclass but not same package to default and private access na thay
       // world (not same class , not same package , not subclass )  to protected , default , private access na thay only public 


    }
    
}
