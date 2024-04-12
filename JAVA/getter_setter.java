
class myEmployee{
    private int id;
    private String name;

    public void setname(String n){
        name=n;
    
    }
    public String getname(){
        return name; 
    }

    public void setid(int n){
        id=n;
    }
    public int getid(){
        return id;
    }
}
public class getter_setter {
    public static void main(String[] args) {

        myEmployee nrup = new myEmployee();
        nrup.setname("kano");
        nrup.setid(17);
        System.out.println(nrup.getname());
        System.out.println( nrup.getid());
       
        
    }
    
}
