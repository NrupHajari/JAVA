class Cylinder{
    private int redius ;
    private int hight;

  // constructor 
    // public Cylinder(){
    //     this.redius=9;           // constructor method 1
    //     this.hight=12;
    // }

    public Cylinder(int r , int h){
        this.redius=r;                 // constructor method 2
        this.hight=h;
    }

    /* 

    // getter & setter 
    public void setredius(int r){
        this.redius=r;
    }
    

    public void sethight(int h){
        this.hight=h;
    }
    
*/

        public int getredius(){
            return redius;
        }

        public int gethight(){
            return hight;
        }
        
    public double surfacearea(){
        return 2*3.14*redius*redius + 2*3.14*hight*redius ;
    }

    public double volume(){
        return 3.14*hight*redius*redius ;
    }
}


public class constructors_2 {
    public static void main(String[] args) {
        
        Cylinder mCylinder = new Cylinder(9,12);        // contructor hoy tyare 


       // Cylinder mCylinder = new Cylinder()
        // mCylinder.setredius(9);                  // getter & setter  hoy tyare 
        // mCylinder.sethight(12);

        System.out.println(mCylinder.getredius());
        System.out.println(mCylinder.gethight());

        System.out.println(mCylinder.surfacearea());
        System.out.println(mCylinder.volume());
    }
    
}
