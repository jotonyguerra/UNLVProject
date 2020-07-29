import java.util.Scanner; 
import java.lang.String;
import java.util.Random; 

public class foodChooser 
{
  public static void main(String[] args) {
    
    //declare variables 
    //String choices;
    // create instance of Random class 
    Random rand = new Random(); 
  
    Scanner sc = new Scanner(System.in); 
    System.out.println("Let's make a decision");

    //Get user input
    int number;
    do {
        System.out.println("Please enter your number of choices!");
        while (!sc.hasNextInt()) {
            System.out.println("That's not a number!");
            sc.next(); // this is important!
        }
        number = sc.nextInt();
    } while (number <= 0);
    System.out.println("Thank you! Got " + number);

    //declare array of string for restaurant/food options
    String[] options; 
    options = new String[number]; //initialize string array to number of choices

   int x = 0;

   //comsuming <enter> from input above
   sc.nextLine();
   do {

        System.out.println("Enter in choice " + (x + 1) + ": ");
        options[x] = sc.nextLine();  //stores input into option[i]
        //sc.next();

        x++; 
   } while (x < number);
    
   //generating random number from number of options
   int rand_int1 = rand.nextInt(number);
   System.out.println("Random number = " + rand_int1);
   //printing out the random choice using above
   System.out.println("The program has chosen: " +options[rand_int1]); 
  }//end of main
}

// this is a test edit by SEAAAAAAAABORNNNNNN