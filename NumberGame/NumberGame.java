import java.util.*;
import java.math.*;
import java.io.*;

public class NumberGame
{
//Only play again if the guess is wrong; have a maximum of 3 trials
 public static void main(String[] args)
 {
  Random random = new Random();
  System.out.println("Guess a number between 1 and 100");
  int trial= 1;
  int randomNum = random.nextInt(100);
  boolean correct= false;
  Scanner input = new Scanner(System.in);
  int guess = input.nextInt();
  double totalScore = 0;
  double score =0;
 for (int i=0; i<2; i++)
  {
    totalScore= totalScore+10;
      if (guess==randomNum)
     {
      score = score+10;  
      System.out.println("Your guess is correct!!!"); 
      correct=true;
      break;
     }
     else 
     {
      if (guess>randomNum)
       System.out.println("Sorry, Your guess is too high");
      if (guess<randomNum)
       System.out.println("Sorry, Your guess is too low");

      System.out.println("TRY AGAIN, Guess a number between 1 and 100");
     }
   
   guess = input.nextInt(); 
   trial++;    
  } 
  //end of for loop
  
   if (guess==randomNum && correct== false)
      {
       score = score+10;
       System.out.println("Your guess is correct!!!"); 
       correct=true;
       totalScore = totalScore+10;
             }
      else if (trial==3 & correct==false) 
      {
        System.out.println("You have ran out of trials.");
        totalScore = totalScore+10;
      } 
  

  System.out.println("Your total score is: "+ (score/totalScore)*100 +"%");
 
 }

}

