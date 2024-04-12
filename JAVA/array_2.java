public class array_2 {
    public static void main(String[] args) {
        
        // problem 1
/* 
         float [] a = {3.2f, 5.4f, 8.1f};
        float sum =0.0f ;
        for(float element : a){
            sum = sum + element ;
        }
        System.out.println("the array sum is : " + sum);
        System.out.println("the avg array element is : " + sum/a.length);
                                                        

      // problem 2
 
      float [] a = {3.2f, 5.4f, 8.1f};
      float num = 5.4f ;
      boolean IsArray = false ;
      for(float element : a){
          if(num == element){
             IsArray = true ;
             break;
          }

      }
      if(IsArray){
      System.out.println("num is present in array");
      }
      else {
        System.out.println("num is not present in array");
      }
                                                                */


    // add  2 matrix injava 
/*     
    int [][] m1 = { {1,3,4},              // [2][3] matrix che 
                    {2,6,5}};

    int [][] m2 = {{2,3,4},
                    {5,2,1}};
    
    int [][] result = {{0,0,0},
                      {0,0,0}};
    
    for(int i =0 ; i< m1.length ; i++){
        for(int j =0 ;j<m1[i].length ; j++){
            System.out.printf("i=%d and j =%d\n", i,j);
            result[i][j] = m1[i][j] + m2 [i][j];
        }
    }

    for(int i =0 ; i< m1.length ; i++){
        for(int j =0 ;j<m1[i].length ; j++){
            System.out.print(result[i][j] +" ");
            // result[i][j] = m1[i][j] + m2 [i][j];
        }
        System.out.println();
    } 
                                     */

  // reverse array
/* 
       int [] arr = { 1,2,3,4,5};
       int l = arr.length ;
       int n = Math.floorDiv(l, 2) ;    // floorDiv e l/2 kare but answe 2.5 ave to 2 j rakhe (point pela no j answe rakhe aa function)
       int temp ;
       // one method
       for(int i = l-1; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
       
         System.out.println();

         // method 2 reverse array
        for(int i =0 ; i < n ; i++ ){
            // swap arr[i] and arr[l-i-1]
            // temp a b 
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element:arr){
            System.out.print(element + " ");
        }
                                             */

 // maximum and minimum element find  in array find 
/* 
       int [] a = { 33,22,100,5,454,87,12};
      // int max = 0;
     int max = Integer.MIN_VALUE;    // max value hal array ni defult minimun value che (most imp function array in java)
     
     
     int min = Integer.MAX_VALUE;    // min value hal array ni defult maximum value che 
                                     // array ni defult maximun and minimun value allreday java ma hoy j che 
                                     // maximum value = 2147483648
                                     // minimum value = -2147483648

       for ( int e : a){
        if(e>max ){
            max = e ;
        }
        else if(e<min){
            min = e ;
        }
       }
       System.out.println("the maximum element in array is: " + max);
       System.out.println("the minmum element in array is: " + min);
                                                                        */


// array is sorted 

        int [] a = {2,3,5,8,9,15,21,33};
        boolean Issorted = true;

        for(int i =0 ; i<a.length -1  ; i++){
            if(a[i] > a[i+1]){
                Issorted = false ;
                break;
            }
        } 
        if(Issorted){
        System.out.println("the array is  sorted");
        }
        else{
            System.out.println("the array is not sorted");
        }

    }
    
}
