import java.util.Scanner;

public class conditonal2 {
    public static void main(String[]args){
        // marks in 3 sub avg marks 40+ & all sub in 33+ code 
        int m1,m2,m3;
        Scanner sc = new Scanner(System.in);

        System.out.println("m1 marsk is : ");
        m1 = sc.nextInt();

        System.out.println("m2 marsk is : ");
        m2 = sc.nextInt();

        System.out.println("m3 marsk is : ");
        m3 = sc.nextInt();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("your avg marks is : " + avg);

        if( avg>=40 && m1 >=33 && m2>=33 && m3>=33){
            System.out.println("passsssssss");
        }
        else{
            System.out.println("failllll");
        }
    }
}
