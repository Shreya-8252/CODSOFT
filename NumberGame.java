import java.util.Random;
import java.util.Scanner;

class NumberGame {
  public static void main(String[] args) {
    Random rand = new Random();
    int random_number = rand.nextInt(100) + 1;
    // System.out.println("the random number is:"+random_number);
    int attempt = 0;
    while (true) {
      System.out.println("enter your guess number between 1-100");
      Scanner sc = new Scanner(System.in);
      int userguess = sc.nextInt();
      attempt++;
      if (userguess == random_number) {
        System.out.println("correct! you win");
        System.out.println("it took you " + attempt + "tries");
        break;
      } else if (random_number > userguess) {
        System.out.println("the number is low please guess again");
      } else {
        System.out.println("random number is high please guess again");
      }
    }
  }
}