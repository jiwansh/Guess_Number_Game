import java.lang.*;
import java.util.*;
public class GuessMe{
   int n;
   int k = 10;
   int score;
   public  void guess(){
    System.out.println("                  ----Guess The Number ------");
    System.out.println("Guess A Number Which Is Between 1 And 100 \n ");
     System.out.println("Note: You Will Get only 10 Turns to Guess Correctly");
    Scanner sc = new Scanner(System.in);
   int ran =(int)(Math.random()*100)+1;
   //System.out.println("hint"+ran);
    while(k>0){
        System.out.println("Chances left: "+k);
        System.out.println("Enter The Number");
        n = sc.nextInt();
      if(n==ran){
        System.out.println("Woah! You Won The Game Congratulations");
        break;
      }
      else if(n>ran&& k!=1){
        System.out.println("Number is less then "+n+" Retry!");
        
      }
      else if(n<ran && k!=1){
        System.out.println("Number is Greater then "+n+" Retry!");
        
      }
      k=k-1;
    }
    if(k==0){
        System.out.println("Oops You Lost The Game The Number is "+ran);
    }
    score = k*10;
    System.out.println("YOUR SCORE IS :"+score);
    sc.close();
   }
    public static void main(String []args){
        GuessMe g = new GuessMe();
        g.guess();
    }
}