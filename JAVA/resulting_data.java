public class resulting_data {
    public static void main(String[]args){
       int a =9;
       short b = 6;
       byte c = 3;
      int  x = a + b ;
      float y = 5.87f + c;
      System.out.println(x);
      System.out.println(y);

      // increment 

      int k = 7 ;
      // int b = k++ ; --> first i assigned in b then i is increment 
      System.out.println(k++);
      System.out.println(k);

     // System.out.println(k--);   // decrement 
      //System.out.println(k);

      int j = 4 ;
      //int b = ++j; -->  first i increment then i is assigned in b
      System.out.println(++j);
      System.out.println(j);

     // System.out.println(--j);   / decrement
      //System.out.println(j);


  // quick qize 
    
       int p = 5;
       int l = ++p * 8 ;    // first p is increment and then maltiple --> 6*8 = 48
       System.out.println(l);

       char d = 'A';
       System.out.println(++d);  // ++d first increment --> result is B 


       char grade = 'B';
       grade =(char)(grade + 8);
       System.out.println(grade);


    
    }
    
}
