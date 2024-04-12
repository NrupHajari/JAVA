// rock paper scisor

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[]args){
        System.out.println("the game start, let's go");
        Random rd = new Random();
        int computer = rd.nextInt(1,4);
       // System.out.println(computer);
        Scanner sc = new Scanner(System.in);
        int user =sc.nextInt(4);
       // System.out.println(user);
       if(user==0){
        System.out.println("not valid");
       }
        else if(computer==user){
            System.out.println("Draww");
        }
        else if(computer==1){
            if(user==2){
                System.out.println("user winn");
            }
            else{
                System.out.println("computer winn");
            }
        }
        else if(computer==2){
            if(user==1){
                System.out.println("computer winn");
            }
            else{
                System.out.println("user winn");
            }
        }
        else{
            if(user==1){
                System.out.println("user winn");
            }
            else{
                System.out.println("computer winn");
            }
        }




      

    }
    
}
