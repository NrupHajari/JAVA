import java.util.Scanner;


public class conditional {
    public static void main(String[]args){

        int a = 36 ;
        if(a>18){
            System.out.println("ypu can drive a car");
        }
        else {
            System.out.println(" you cannot drive");
        }
// relational operator 
      
      int p = 23 ;
      if(p==23){            // p =23 e assign mate and p == 23 e equal mate 
         System.out.println("yes");
      }
      else{
         System.out.println("noo");
      }



        boolean b = true ;
        boolean c = false;
         if( b && c){    // all condition true then true 
            System.out.println("y");
         }
         else {
            System.out.println("N");
         }

         if( b || c){    // any one ya all condition true then true 
            System.out.println("y");
         }
         else {
            System.out.println("N");
         }

         System.out.println(!c);  // not logiacal operator  condition je hoy enu undhu thai jay 



   // if else if condition

    Scanner sc = new Scanner(System.in);
    System.out.print("enter age : ");
    int age = sc.nextInt();

    if(age>50){
      System.out.println("A++");
    }
    else if(age>35){
      System.out.println("A+");
    }
    else if(age>25){
      System.out.println("B++");
    }
    else{
      System.out.println("B+");
    }

    }
    
}
