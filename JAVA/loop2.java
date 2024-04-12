

public class loop2 {
    public static void main(String[] args) {
       
        // multiplication table
      /*   int n = 5 ;
        for (int i =1; i<=10 ;i++){
           System.out.printf("%d x %d = %d\n",n,i,n*i);    // printf use 
           // System.out.println( "5 X" + i+ "=" + 5*i);
        }

 // first 4 even num sum (0 +2+4+6 =12)
        int sum =0;                   // for loop
        int a = 3;
        for(int b = 0; b<=a;b++){       // b is 0 to 3 means 0,1,2,3 
            sum = sum + (2*b);
        }
        System.out.println("sum is " +sum);
                                                     */

    /*   int sum =0;             // while loop
         int b= 0;
        while(b<4){
               sum = sum + (2*b);
              b++;
        }
             System.out.println(sum);
                                           */

  // multiplication table but reverce
        
     /*    int n = 5 ;
        for (int i =10; i>=1 ;i--){
          System.out.printf("%d x %d = %d\n",n,i,n*i);            
        }
                                                          */
                 
   // factorial num
      
        int n = 5 ;
        int factorial =1 ;
        for(int i = 1 ; i<=n ;i++){
            factorial = factorial*i;
           // factorial*=i;
        }
         System.out.println(factorial);

    
    
    


  }

}
