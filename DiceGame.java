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
    
