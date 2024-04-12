
abstract class parents {
    public parents() {
        System.out.println("hyy.....");
    }

    abstract public void greet();
}

class child1 extends parents {
    @Override
    public void greet() {
        System.out.println("good morning");
    }
}

abstract class child2 extends parents {
    public void ch() {
        System.out.println("haahahahhahah ...");
    }
}

public class abstract_classes_method {
    public static void main(String[] args) {
        // parents p=new parents();-->error
        child1 c1 = new child1();
        c1.greet();
        // child2 c2 = new child2();-->error
    }

}
