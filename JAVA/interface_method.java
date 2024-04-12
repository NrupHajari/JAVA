
interface bicycle {
    int a = 45;

    void speedup(int increament);

    void breake(int decreament);
}

interface horn {
    void hornblow();

    void hornslow();
}

class Herocycle implements bicycle, horn {

    public void speedup(int increament) {
        System.out.println("cycle runiing in speed...");
    }

    public void breake(int decreament) {
        System.out.println("cycle breake stop..." + decreament);
    }

    public void hornblow() {
        System.out.println("peeeeee peeee peeee ppp");
    }

    public void hornslow() {
        System.out.println("po pop pop pop");
    }
}

public class interface_method {
    public static void main(String[] args) {
        Herocycle cycle1 = new Herocycle();
        cycle1.speedup(12);
        cycle1.breake(7);
        cycle1.hornblow();
        cycle1.hornslow();

        // u can create properties in interface
        System.out.println(cycle1.a);

        // u cannot modify the properties in interface as they are final
        // cycle1.a=77; --> error

        bicycle by = new Herocycle(); // interface no refernce banavui sakay pn object na banavi sakay
        by.breake(12);

    }

}
