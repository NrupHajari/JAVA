
/* 
class base{
    int x;
   
    public void setX(int x){
        System.out.println("i am in base class and set x ");
        this.x=x;
    }
    public int getX(){
        return x;
    }

}

class derive extends base{
    int y;

    public void setY(int y){
        System.out.println("i am in derive class and set y ");
        this.y=y;
    }
    public int getY(){
        return y;
    }

}


public class inheritance {
    public static void main(String[] args) {
        
       // creating and object of base class
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());                 // base class ma only x set&get thay y nai(y e derive class ma che )


        // crating and object of derive class

        derive d =new derive();
        d.setX(7);                       // in derive class set x  (derive class extends base class che atle )
        System.out.println(d.getX());

        d.setY(33);
        System.out.println(d.getY());
    }
    
}
                                                                         
     */

// inhertance constructor
 
class base{
    
    base(){
        System.out.println("i am base constructor ");
    }

    base(int x){
        System.out.println("i am overloading base constructor with value x : " + x);
    }   

}

class derive extends base{
    derive(){
        //super(14);
        System.out.println("i am derive constructor ");
    }

    derive( int x, int y){
        super(x);
        System.out.println("i am overloading derive constructor with value y:  " + y);
    }
    
}

class childOfderive extends derive{
    childOfderive(){
        //super(12,44);
        System.out.println("i am childOfderuive constructor ");
    }

    childOfderive(int x ,int y,int z){
        super(x,y);
        System.out.println("i am overloading childOfderive constructor with value z: " + z);
    }
}

class inheritance{
    public static void main(String[] args) {
        
        //base b = new base();

       // derive d = new derive();

      // derive d = new derive(14, 9);

      //childOfderive c = new childOfderive();
      childOfderive c = new childOfderive(12,44,89);

    }
}
