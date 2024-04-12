public class loops {
  public static void main(String[] args) {
    /*
     * // while loop
     * 
     * int i = 1;
     * while(i<=10){
     * System.out.println(i);
     * i++;
     * }
     * 
     * // do while loop
     * 
     * int a=0;
     * //int a=12; // do while ma pela print thay pachhi condition check thay
     * do{
     * System.out.println(a);
     * a++;
     * }while(a<=5);
     * 
     * //for loop
     * 
     * for( int b =0; b<=3; b++){
     * System.out.println(b);
     * }
     * // first 5 odd num for loop using
     * int n = 5;
     * for(int c=0;c<n;c++){
     * System.out.println(2*c+1);
     * }
     * 
     * // for loop in decrement
     * System.out.println("decrement");
     * for(int d= 19 ; d > 14 ; d--){
     * 
     * System.out.println(d);
     * }
     */

    // Break statement

    /*
     * for(int i =0 ; i<=5 ; i++){
     * System.out.println(i);
     * System.out.println("java great");
     * 
     * if(i==2){
     * System.out.println("ending");
     * break; // break statement use condition true ya false break a code and
     * outside the loop (loop ni bar mokali de )
     * }
     * 
     * }
     * System.out.println("end loop");
     */

    /*
     * int i=0;
     * while(i<=5){
     * System.out.println(i);
     * System.out.println("java great");
     * 
     * if(i==2){
     * System.out.println("ending");
     * break; // break statement use condition true ya false break a code and
     * outside the loop (loop ni bar mokali de )
     * }
     * i++;
     * }
     * System.out.println("end loop");
     */

    // aa rite do while thi break statement banavi sakay ok

    // continue statement

    for (int i = 0; i <= 5; i++) {
      if (i == 2) {
        System.out.println("ending");
        continue;
        // break;
      }
      System.out.println(i);
      System.out.println("java great");

    }

  }

}
