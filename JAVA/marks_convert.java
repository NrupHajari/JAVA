import java.util.Scanner;

public class marks_convert {
    
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in); 
        System.out.print("enter sub1 marks : ");
        int m1 =sc.nextInt();
        System.out.print("enter sub2 marks : ");
        int m2 =sc.nextInt();
        System.out.print("enter sub3 marks : ");
        int m3 =sc.nextInt();
        System.out.print("enter sub4 marks : ");
        int m4 =sc.nextInt();
        System.out.print("enter sub5 marks : ");
        int m5 =sc.nextInt();


        float percentage = ((m1+m2+m3+m4+m5) * 100)/500F;
        System.out.print("the marks of percentage is ");
        System.out.println (percentage + "%");

        float CGPA = percentage/10F;
        System.out.println("cgpa is  : " + CGPA);
      }

    }
    

