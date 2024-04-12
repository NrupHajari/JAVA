import java.util.Scanner;

public class swichcase {
    public static void main(String[]args){
        String s ="Nrup";

      /*   switch(s){
            case "Kano":
                System.out.println("hyy kano");
                break;
            case "Nrup":
                 System.out.println("hyy nrup");
                 break;
            default :
                System.out.println("no matching");

        }
        System.out.println("good morning");
        */


        switch(s){
            case "Kano" -> System.out.println("hyy kano");
                
            case "Nrup" ->{ System.out.println("hyy nrup");            // more line print karavi hoy to 
                            System.out.println("sajfhkgafjasdjfjsggfjsz");
                        }                
                 
            default -> System.out.println("no matching");
                

        }
        System.out.println("good morning");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter num : ");
        int day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("tuesday");
            case 4 -> System.out.println("wednesday");
            case 5 -> System.out.println("thursday");
            case 6 -> System.out.println("friday");
            case 7 -> System.out.println("saturday");
            default -> System.out.println("enter num 1 to 7");
        }
    }
    
}
