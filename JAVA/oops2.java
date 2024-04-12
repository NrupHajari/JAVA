


class Employee{
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }

    public String getname(){
        return name;
    }

    public void setname(String n){
        name=n;
    }
}

class cellphone{

    public void ring(){
        System.out.println("ringing...");
    }

    public void vibrate (){
        System.out.println("vibrating...");
    }

    public void calling(){
        System.out.println("calling friend ...");
    }
}

class square{
    int side;

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

class circle{
    int r ;
    public float area(){
        return 3.14f*r*r;
    }

    public float perimeter(){
        return 2*3.14f*r;
    }
}

public class oops2 {
    public static void main(String[] args) {
        
    
        Employee nrup = new Employee();
        nrup.setname("kano");
        System.out.println(nrup.getname());

        nrup.salary= 2300;
        System.out.println(nrup.getsalary());

        // use cellphone

        cellphone iqooz5 = new cellphone();
        iqooz5.calling();
        iqooz5.vibrate();
        iqooz5.ring();

        // use square

        square sq=new square();
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        
        // circle class use

        circle c = new circle();
        c.r=3;
        System.out.println(c.area());
        System.out.println(c.perimeter());
   
    

    }
     
}
