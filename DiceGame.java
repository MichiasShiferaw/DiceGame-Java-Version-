//Scan all primitive data types
import java.util.Random;
import java.util.Scanner;

public class DiceGame {
 
  public static void main(String[] args) {

    //Create a new random function
    Random roll = new Random();

    // This will give a range from 0 - 5
    int randNum = roll.nextInt(6);
    
    //Declare two integer variables
    int counter;
    
    // Declare all nescessary variables 
    //I need to have one so that within the range it will no longer be from 0-5 but 1-6
    randNum += 1;
    counter = 0;
    
    int guess;
    Scanner userInput = new Scanner(System.in);
    // Asks the user what the random number is
    System.out.println("I got a number that you got to try and guess it is between 1 & 6. ");
    guess = userInput.nextInt();

    // Repeats this process as long as the answer is wrong
    while (randNum != guess) {

      // One more trial that you took is added to the total
      counter += 1;

      //Inform the user that the guessed number was not equivalent to the hidden number       
      System.out.print("That number is incorrect! ");

      //Using the random function I will use it to output different responses
      Random reponses = new Random();
      int options;
      options = reponses.nextInt(6);
      if (options == 0) {
        System.out.println("Almost!!");
      }
      if (options == 1) {
        System.out.println("I feel like it is the next one.");
      }
      if (options == 2) {
        System.out.println("You got this");
      }
      if (options == 3) {
        System.out.println("C'mon");
      }
      if (options == 4) {
        System.out.println("We are very warm!!");
      }
      if (options == 5) {
        System.out.println("Next one for sure!");
      }
      //Ask for an user input again
      guess = userInput.nextInt();
    }

    // One more trial that you took is added to the total
    counter += 1;
    System.out.println("You guessed the random number! It only took " + counter
                       + " tries to get it.");
  }
}  
