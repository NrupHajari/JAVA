

class Employee{
    int id;
    String name;
    int salary = 1500;
    public void  printDetails(){
      System.out.println("the id is " + id);
      System.out.println("my name is "+name);
    }
    public int getsalary(){
        return salary;
    }

}

public class oops {

    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee nrup = new Employee(); // instanting a new Employee Object
        Employee kano = new Employee();

        //setting attribute
        nrup.id = 07;
        nrup.name = "Hajari";
        nrup.salary = 1600;

        kano.id = 12;
        kano.name="Patel";

        //printing attributr
      /*   System.out.println(nrup.id);
        System.out.println(nrup.name);  */

        nrup.printDetails();
        kano.printDetails();

        System.out.println(nrup.getsalary());
        System.out.println(kano.getsalary());
        
    }
    
}                                                         
