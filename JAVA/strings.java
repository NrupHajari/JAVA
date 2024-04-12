import java.util.Scanner;

public class strings {
    public static void main(String[] args){

     /*    //String name = new String("Nrup");
        String name = "Nrup";   
        System.out.print("the name is: ");
        System.out.println(name);
      */

     /*  int a = 8;
      float b = 7.43f;
      System.out.printf("the value a is %d and b is %f\n",a,b);   // new mwthode for print like c language 
      System.out.format("the value a is %d and b is %f",a,b);  // format & printf same j che 

      */

    /*   Scanner  sc  = new Scanner(System.in);
     // String st = sc.next();  // write sentence but print first word
       String st = sc.nextLine();  // write any thing same print 
       System.out.println(st);

       */

    // string method
      
    String name = "Nrup";
    System.out.println(name);

    int value = name.length(); // return length 
    System.out.println(value); 

    String loweString = name.toLowerCase();  // return all char in lowe case 
    System.out.println(loweString);
    
    String uppString = name.toUpperCase();   // return  all char in upper case
    System.out.println(uppString);

    String nonTrimString ="       Kano        ";
    System.out.println(nonTrimString);
    String trimString = nonTrimString.trim();
    System.out.println(trimString);

    String Name ="NrupHajari";
    System.out.println(Name.substring(3));  // string index 3 thi start thai ne end sudhi jase 
    System.out.println( Name.substring(2,8));  // string index 2 thi start thine 7 e end thase (--> 8 e end nai thay  )
    System.out.println(Name.replace('j', 'z')); // lettar replacement jya j hase tya z avi jase (jetla time vakhat j hoy e badhi jagyae change thai ne z thai sake )
   // System.out.println( Name.replace('a', 'b')); // string ma jya a tya b replace thai jay
   System.out.println(Name.replace("Nrup", "Kan"));  // aa Nrup word find kari ne tya Kano replce kari dese 

   System.out.println(Name.startsWith("Nr"));  // string start with Nr print true nai to false 
   System.out.println(Name.endsWith("ari"));   // string end eith ari print true nai to false 

   System.out.println(Name.charAt(3)); // string index 3 ma je char hoy e print thay 
   System.out.println(Name.indexOf("r")); // string first r kaya index ma che e index print thay 
   System.out.println(Name.indexOf('a',6)); // string find a after 6 index ( 6 index pacchi find kari ne a ni index batavse ) return 7
    // string ma 'a' na hoy to -1 return karse upar na be method ma 
    System.out.println(Name.lastIndexOf('r')); // string ma last 'r' kai index ma che e print karave 
    System.out.println(Name.lastIndexOf('a', 6)); // find 'a'  index 6 sudhi ma a last kai index pr che print karave 
    System.out.println(Name.equals("kano")); // string equal hoy to true baki false (aa method ma lowercase and uppercase match na thay to bi false return kare )
    System.out.println(Name.equalsIgnoreCase("nrUPhaJaRi")); // aa method khali string match thay to true return kare (lowercase k uppercase na jove only same string hovi joie )
    

    // Escape sequence 

    System.out.println("i \\ am\' nrup \" hajari.\n patel power \t kano ");   // some methode (code with harry note)


    // quize

    String letter = "Dear <|name|> , thank you !";
    letter = letter.replace("<|name|>", "Kano");
    System.out.println(letter);

    }
    
}
