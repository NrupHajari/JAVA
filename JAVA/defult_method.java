

// default method 

interface camara{
    void takesnap();
    void recordvideo();

    //private method 
    private  void greet(){                        // private method not use direct in other interface ya class
        System.out.println(" hyy nrup hajari..");
    }


    // default method 
    default void record4k(){
        greet();                                              // private ne potana interface ya class ma use karay 
        System.out.println("recording in 4k ...");
    }
}

interface wifi{
    String[] getnetworks();
    void conneting(String network);
}

class cellphone{
    void callnumber(int number){
        System.out.println("calling...." + number);
    }

    void recivecall(){
        System.out.println("conneting call.......");
    }
}


class MySmartPhone extends cellphone implements camara , wifi{

    public void takesnap(){
        System.out.println("taking snap..");
    }
    public void recordvideo(){
        System.out.println("video....record...");
    }

    public String[] getnetworks(){
        System.out.println("getting networks ");
        String[] networklist = {"nrup", "kano", "patel"};
        return networklist;
    }

    public void conneting(String network){
        System.out.println("conneting ....."+ network);
    }

    // default method ne overriding kari sakay che 
    // public void record4k(){
    //     System.out.println(" 4k recording  ha ha ..");            // override karya pacchi j override karyu e output male 
    // }
  
}


public class defult_method {
    public static void main(String[] args) {
      
        //default method part
        /* 
        MySmartPhone sp = new MySmartPhone();

       // sp.greet(); --> error private method 

        sp.record4k();  // default method direct call in interface 

        String [] arr = sp.getnetworks();
        for(String item : arr){
            System.out.println(item); 
        }
        */

        // polymorphism part

        camara c1 = new MySmartPhone();    // reference camara che & object mysmartphone no che to (means k apde mysmartphone ne camara tarike j only use karvano che )
                                          // camara ni j method khali mysmartphone avse biji nai 
        c1.record4k();
        c1.takesnap();    // interface camara methods 

       // c1.getnetworks(); --> error throw because e wifini method che and apdi jode camara no reference lidhelo che atle
       //c1.recivecall(); --> error (mysmartphone lidho che but khali camara mate j )

       MySmartPhone sp = new MySmartPhone(); // mysmartphone no reference lai ne object banavyo che to eni badhi method run thase 

       sp.takesnap();
       sp.getnetworks();
       sp.callnumber(2358);




    }
    
}






/* 
// inheritance in interface 

interface sampleinterface {
    void method1();

}

interface childsampleinterface extends sampleinterface{       // inheritance karyu extends keyword use kari ne 
    void method2();                                           
}

class mysample implements childsampleinterface{       // interface ne class sathe implements karvu pde not extends
    
    public void method1() {
        System.out.println("method 1 ...");
    }
    public void method2(){
        System.out.println("method 2...");
    }
}

class defult_method{
    public static void main(String[] args) {
        mysample n = new mysample();

        n.method1();
        n.method2();
    }
}

*/