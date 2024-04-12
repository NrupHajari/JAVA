public class arrays {
    public static void main(String [] args) {
        
        // main 3 way for create array
        
    // 1. Declaration and memory allocation
      /*   
        int []marks = new int[5];    // int []marks <-- declaration , new int[5]<-- memory allocation
         
        //intialization
        marks[0] = 95 ;   // marks[0] to marks[4] called initialization
        marks[1] = 96 ;
        marks[2] = 97 ;
        marks[3] = 98 ;
        marks[4] = 99 ;
        //marks[5] =66 --> error throw
        System.out.println(marks[2]);

                                        */

    // 2. Declaration and then memory allocation
      /*    
        int []marks ;   // int []marks <-- declaration , 
        marks = new int[5] ;                         //new int[5]<-- memory allocation
         
        //intialization
        marks[0] = 95 ;   // marks[0] to marks[4] called initialization
        marks[1] = 96 ;
        marks[2] = 97 ;
        marks[3] = 98 ;
        marks[4] = 99 ;

        System.out.println(marks[2]);
                                      */

   // 3.declaration , memory allocation and initialization tougther
     /* 
       int [] marks = {95, 96 ,97, 98, 99} ;   // memory allocation leptop jate kari le aa rit ma 
        
       System.out.println(marks[2]);
       // array length find 
       System.out.println(marks.length);
                                             */

  // float , string array 
   /* 
   float [] marks = { 98.01f , 95.32f , 55.31f };
   System.out.println(marks[1]);

   String [] name = {"nrup" , "kano","patel"};
   System.out.println(name[1]);
                                    */

  
// display array  
                            // first method naive way code book(hajari) ma lakhel che

  // using (for loop ) display array
/* 
     int [] marks = {95, 96 ,66, 81, 99} ;
      // System.out.println(marks.length);
     
     for(int i =0 ;i<marks.length ; i++ ){
        System.out.println(marks[i]);
     }
    
 // reverse array print
        System.out.println("in reverse order");
        for(int i = marks.length -1 ; i>=0 ; i--){
            System.out.println(marks[i]);
        }

// for each loop using display array
           System.out.println("for each loop");
           for(int element: marks){
            System.out.println(element);
           }
                                             */

  // multidimensional array 
     
     // 2-D array

      int [][] flats = new int [2][3] ;   // flats atle gar house emj name che e 
      flats[0][0] = 101 ;
      flats[0][1] = 102 ;
      flats[0][2] = 103 ;
      flats[1][0] = 201 ;
      flats[1][1] = 202 ;
      flats[1][2] = 203 ;

     // System.out.println(flats[1][2]);
    System.out.println("flats lenght is : " + flats.length);
     System.out.println("display 2D array");

     for(int i = 0 ; i<flats.length ; i++){
      for(int j= 0 ; j<flats[i].length ; j++){
        System.out.print(flats[i][j]);
        System.out.print(" ");
        
      }
      
       System.out.println();
       
     }
     

       
  }
    
}
