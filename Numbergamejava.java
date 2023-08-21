
package numbergamejava;
import java.util.Scanner;
import java.util.Random;
public class Numbergamejava {
public static final int chance =10;
   
    public static void main(String[] args) {
       
        int randomNumber;
        int guess;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;

        int chance = Numbergamejava.chance; // number of time player can guess
        String exitValue;
        boolean correct = false;
     

        System.out.println("You have total " + chance + " chance to guess the correct number");
        

        do {
            while (chance > 0) {
                System.out.println("guess a number between 1 to 100: ");
                guess = sc.nextInt();

                if (guess > randomNumber) {
                    System.out.println("\nToo high");
                } else if (guess < randomNumber) {
                    System.out.println("\nToo low");
                } else {
                    System.out.println("\nYour guess is correct");
                    correct=true;
                    break;
                }
                chance--;
                System.out.println("you have " + chance + " chance left");
            }
            if (correct) System.out.println("you took " + (Numbergamejava.chance - chance) + " try to guess the correct answer");
            else System.out.println("you were unable to guess to correct answer");

                String temp = sc.nextLine();

                System.out.println(
                        "\nPress enter to play again\n" +
                                "Press 'e' to exit"
                );
                exitValue = sc.nextLine().toLowerCase();

            if (!exitValue.equals("e")) {
                chance = Numbergamejava.chance;
                 randomNumber = random.nextInt(100) + 1;
            }
                

        } while (!exitValue.equals("e"));
    }
}
        

        
       
   