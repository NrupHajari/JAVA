
class myEmployee {
    private int id;
    private String name;

    public void setname(String n) {
        name = n;

    }

    public String getname() {
        return name;
    }

    public void setid(int n) {
        id = n;
    }

    public int getid() {
        return id;
    }

    // constructor

    public myEmployee() { // overloading 1
        id = 45;
        name = "your- name ";
    }
    // overloading

    public myEmployee(String myname) { // myname --> arrgument , overloading 2
        name = myname;
        id = 12;
    }

    public myEmployee(String myname, int myid) { // arrguments , overloading 3
        id = myid;
        name = myname;
    }

}

public class constructors {
    public static void main(String[] args) {

        myEmployee kano = new myEmployee(); // overloading 1 ma pass thase

        myEmployee sonu = new myEmployee("tanvi"); // overloading 2 ma pass thase

        myEmployee nrup = new myEmployee("hajari", 23); // overloading 3 ma pass thase

        // nrup.setid(17); // nrup id apeli che atle 17 print thase
        System.out.println(nrup.getid());
        System.out.println(nrup.getname()); // nrup.name nathi to e myEmployee class na constructor mathi lese

        System.out.println(kano.getid());
        System.out.println(kano.getname());

        System.out.println(sonu.getid());
        System.out.println(sonu.getname());

    }

}
