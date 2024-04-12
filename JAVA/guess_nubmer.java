import java.util.Random;
import java.util.Scanner;



class game{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    // public int getNoOfGuesses(){
    //     return noOfGuesses;
    // }

    // public void setNoOfGuesses(int noOfGuesses){
    //     this.noOfGuesses=noOfGuesses;
    // }

    game(){
        Random rd =new Random();
        this.number=rd.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("guess numer");
        Scanner sc = new Scanner(System.in);
        inputNumber =sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.println("yes u guess right ,number is "+number+" , total number of guesses is "+noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("too high ...");
        }
        return false;
    }

}
 

public class guess_nubmer {
    public static void main(String[] args) {
        
      game g=new game();
      //System.out.println(g.number);
      boolean b=false;
      while(!b){
      g.takeUserInput();
      b=g.isCorrectNumber();
        
    
     }
    
    
    }
    
}
