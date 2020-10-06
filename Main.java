import java.util.Scanner;
/**
 * creates an intrest calculator
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets users starting balance
    System.out.println("Please enter a starting balance");
    double startBal = input.nextDouble();

    //gets users intrest rate
    System.out.println("Please enter your interest rate");
    double intrest = input.nextDouble();
    double intrestRate = intrest / 100;

    //gets amount of investment years
    System.out.println("Please enter the number of years you will invest for");
    int year = input.nextInt();

    //declare variable for accumulating 
    double acc = 0;
    double acc2 = startBal;

    //loop that adds intrest by the year
    for(int i = year; i > 0; i--){
      acc = intrestRate * acc2;
      acc2 = acc2 + acc;
    }
    //tells user how much money whey will have after investing
    System.out.println("Your final balance would be " + acc2);
  }
}
