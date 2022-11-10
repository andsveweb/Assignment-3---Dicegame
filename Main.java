
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    // setting variables
    int dice1 = 0;
    int dice2 = 0;
    int dice3 = 0;
    int sum = 0;

    int totalWins = 0;
    int totalLosses = 0;

    // Scanner for user inputs
    Scanner keyboard = new Scanner(System.in);
    System.out.println(
        "Välkommen till spelet 12. Du ska slå 1-3 tärningar och försöka få summan 12. Lycka till!");

    System.out.print("\nAnge vilken tärning du vill slå. [1, 2, 3] (avsluta med q) ");

    // while loop for user input. If user inputs q, the program will stop. If user
    // inputs 1, 2 or 3, the program will roll the dice.
    String input = keyboard.nextLine();
    while (!input.equals("q")) {
      if (input.equals("1") && dice1 == 0) {
        dice1 = rollDice();
        sum = dice1 + dice2 + dice3;

        // if the sum is less then 12, the user can roll the dice again.
        if (sum <= 12) {
          System.out.println(dice1 + " " + dice2 + " " + dice3 + " sum: " + sum + " vinnst: " + totalWins + " förlust: "
              + totalLosses);

          // if the sum is 12, the user wins and points are added to totalWins. The
          // program will then reset the dice and sum.
        } else if (sum == 12) {
          totalWins++;
          System.out.println(dice1 + " " + dice2 + " " + dice3 + " sum: " + sum + " vinnst: " + totalWins + " förlust: "
              + totalLosses);
          System.out.println("\u001B[32mDu vann! Ny omgång.\u001B[0m");

          dice1 = 0;
          dice2 = 0;
          dice3 = 0;
          sum = 0;

          // if the sum is more then 12, the user loses and points are added to totalLosses.
        } else {
          totalLosses++;
          System.out.println(
              dice1 + " " + dice2 + " " + dice3 + " sum " + sum + " vinnst: " + totalWins + " förlust: " + totalLosses);
          System.out.println("\u001B[31mDu förlorade omgången. Försök igen\u001B[0m");
          dice1 = 0;
          dice2 = 0;
          dice3 = 0;
          sum = 0;
        }
        // input for dice 2 if user already rolled dice 2 then error message will be
        // displayed.
      } else if (input.equals("2") && dice2 == 0) {

        dice2 = rollDice();
        sum = dice1 + dice2 + dice3;

        // if the sum is less then 12, the user can roll the dice again.
        if (sum <= 11) {
          System.out.println(dice1 + " " + dice2 + " " + dice3 + " sum: " + sum + " vinst: " + totalWins + " förlust: "
              + totalLosses);

          // if the sum is 12, the user wins and points are added to totalWins. The
          // program will then reset the dice and sum.
        } else if (sum == 12) {
          totalWins++;
          System.out.println(dice1 + " " + dice2 + " " + dice3 + " sum: " + sum + " vinst: " + totalWins + " förlust: "
              + totalLosses);
          System.out.println("\u001B[32mDu vann! Ny omgång.\u001B[0m");
          dice1 = 0;
          dice2 = 0;
          dice3 = 0;
          sum = 0;

          // if the sum is more then 12, the user loses and points are added to totalLosses.
        } else {
          totalLosses++;
          System.out.println(dice1 + " " + dice2 + " " + dice3 + " sum: " + sum + " vinst: " + totalWins + " förlust: "
              + totalLosses);
          System.out.println("\u001B[31mDu förlorade omgången. Försök igen\u001B[0m");
          dice1 = 0;
          dice2 = 0;
          dice3 = 0;
          sum = 0;
        }

        // input for dice 3 if user already rolled dice 3 then error message will be
        // displayed.
      } else if (input.equals("3") && dice3 == 0) {

        dice3 = rollDice();
        sum = dice1 + dice2 + dice3;

        // if the sum is less then 12, the user can roll the dice again.
        if (sum <= 11) {
          System.out.println(dice1 + " " + dice2 + " " + dice3 + " sum: " + sum + " vinst: " + totalWins + " förlust: "
              + totalLosses);

          // if the sum is 12, the user wins and points are added to totalWins. The
          // program will then reset the dice and sum.
        } else if (sum == 12) {
          totalWins++;
          System.out.println(dice1 + " " + dice2 + " " + dice3 + " sum: " + sum + " vinst: " + totalWins + " förlust: "
              + totalLosses);
          System.out.println("\u001B[32mDu vann! Ny omgång.\u001B[0m");
          dice1 = 0;
          dice2 = 0;
          dice3 = 0;
          sum = 0;

          // if the sum is more then 12, the user loses and points are added to totalLosses.
        } else {
          totalLosses++;
          System.out.println(dice1 + " " + dice2 + " " + dice3 + " sum: " + sum + " vinst: " + totalWins + " förlust: "
              + totalLosses);
          System.out.println("\u001B[31mDu förlorade omgången. Försök igen\u001B[0m");
          dice1 = 0;
          dice2 = 0;
          dice3 = 0;
          sum = 0;
        }
        // if user inputs something else then 1, 2, 3 or q, error message will be displayed.
      } else {
        System.out.print("Fel på inmatning. Välj endast ett nummer samt en tärning du inte redan kastat 1,2 eller 3.");
      }

      // checks if the user has rolled all three dice. and if so, dice and sum will be reset.
      if (dice1 != 0 && dice2 != 0 && dice3 != 0) {

        dice1 = 0;
        dice2 = 0;
        dice3 = 0;
        sum = 0;
        System.out.println("\033[0;34mOavgjort. Ny omgång\u001B[0m");
      }
      System.out.print("\nAnge vilken tärning du vill slå. [1, 2, 3] (avsluta med q) ");
      input = keyboard.nextLine();
    }

    // prints out the total wins and losses after the user has quit the game.
    if (totalWins > totalLosses) {
      System.out.println(
          "Du vann totalt med ställningen " + totalWins + " vinster och " + totalLosses + " förluster. Grattis!");
    } else {
      System.out.println("Du förlorade totalt med ställningen " + totalWins + " vinster och " + totalLosses
          + " förluster. Bättre lycka nästa gång!");
    }
    keyboard.close();
  }

  // method for rolling the dice.
  public static int rollDice() {
    Random rand = new Random();
    int dice = rand.nextInt(6) + 1;
    return dice;

  }

}
