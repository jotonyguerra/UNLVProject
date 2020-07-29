import java.util.Scanner; 


public class HelloYou {
  public static void main(String[] args) {
    
    //declare variables 
    int size;
    string temp;
    Scanner sc = new Scanner(System.in); 
    //System.out.println("Hello World");
    System.out.println("Let's make a decision");

    //Get user input
    //System.out.println("Enter how many choices (integer): ");
    //int input = in.nextInt(); 

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
  }
  string choices;
}

// this is a test edit by SEAAAAAAAABORNNNNNN