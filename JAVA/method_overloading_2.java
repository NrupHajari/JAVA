
public class method_overloading_2 {

    /*
     * static int sum(int a,int b){
     * return a+b ;
     * }
     * 
     * static int sum(int a,int b,int c){
     * return a+b+c ;
     * }
     * 
     * static int sum(int a,int b,int c, int d){
     * return a+b+c+d ;
     * }
     * 
     * 
     * 
     * public static void main(String[] args) {
     * System.out.println("welcome to verargs tutorial");
     * System.out.println("the sum of 4 and 5 is: " + sum(4,5));
     * System.out.println("the sum of 4 ,3 and 5 is: " + sum(4,3,5));
     * System.out.println("the sum of 4 ,3,2 and 5 is: " + sum(4,3,2,5));
     * 
     * 
     * }
     */
    // vararge argument

    /*
     * static int sum(int ...arr){
     * //avaible int[]arr
     * int result =0;
     * for(int a:arr){
     * result+=a;
     * 
     * }
     * return result ;
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println("welcome to verargs tutorial");
     * System.out.println("the sum of nothing is : " + sum()); // this print 0
     * System.out.println("the sum of 4 and 5 is: " + sum(4,5));
     * System.out.println("the sum of 4 ,3 and 5 is: " + sum(4,3,5));
     * System.out.println("the sum of 4 ,3,2 and 5 is: " + sum(4,3,2,5));
     * 
     * 
     * }
     */

    // recursion in java

    // factorial
    /*
     * static int factorial(int n){
     * if(n==0 || n==1){
     * return 1 ;
     * }
     * else {
     * return n*factorial(n-1);
     * }
     * }
     * 
     * static int factorial_interactive(int n){
     * if(n==0 || n==1){
     * return 1;
     * }
     * else{
     * int product = 1;
     * for(int i = 1 ;i<=n ; i++){ // i is 1 to n
     * product*=i;
     * }
     * return product;
     * }
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println("the num 5 factorial is : " + factorial(5));
     * System.out.println("the num 5 factorial_interactive is : " +
     * factorial_interactive(5));
     * 
     * 
     * }
     */

    // sum of first natural num
    /*
     * static int sum(int n){
     * 
     * if(n==1){
     * return 1;
     * }
     * 
     * return n+sum(n-1);
     * 
     * 
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println("sum of : "+ sum(10));
     * }
     */

    // febonacci serise (0,1,1,2,3,5,8,13,21...)

    static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } // sort form if(n==1 || n==2){ return n-1 ;} else { return
          // fibonacci(n-1)+fibonacci(n-2);}
        else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int a = fibonacci(7);
        System.out.println(a);
    }
}
