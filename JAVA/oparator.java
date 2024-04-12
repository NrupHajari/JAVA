public class oparator {
    public static void main(String[]args){

        // 1 arithmetic opeartor

       // int a =4;
       //  int b = 6+ a;  // + ,-,*,/ ,%   all oparators
       // System.out.println(b);

       // 2 assignment oparator 
     //  int  b = 9 ;
     // b *= 3;
      // System.out.println(b);

      // bitwise oparator 
      //System.out.println(2&3);

     // System.out.println(4.8 % 1.1);  // --> return decimal number ( modulo % oparator)

     // comparison oparator 

     // System.out.println(45> 5);    // return true ya flase (<,>, <=,>= ) 


//  Precedence & associativity 
    int a = 6*5-34/2;
    System.out.println(a);
    /*
     precedence (* and /) > (+ and -) . then same precedence basic of lift to right associativity 

     in short form bhagusaba but new multiple first to multiple & devide first to devide .
       6*5-34/2
       30 - 17
       13
     */
     int b = 60/5-34*2;
     System.out.println(b);
     /*
       60/5-34*2
       12-68
       -56
      */

    // quick qize 

    int x=3,y=4,z=2;
    //int k = x*y/2;
    int k = x*x -4*y*z/2*y;
    int p = x*x -(4*y*z)/(2*y);  // breket and associstivity na lidhe anser juda juda avse because breket ni precedence high hoy atke pela personl breket nu solve thay pachhi bar nu 
    int l = (x*x -4*y*z)/(2*y);   // answer in -2.875 but int che atle return -2 avse 
    System.out.println(k);
    System.out.println(p);
    System.out.println(l);

    int j = (x*x) - (y*y);
    int h= x*x - y*y ;     // same print j and h 
    System.out.println(j);
    System.out.println(h);

    }
    
}
