import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Example {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 4);

        System.out.println("===You Have 3 Choices===");
        System.out.println("1) Rock");
        System.out.println("2) Paper");
        System.out.println("3) Scissors");
        
        System.out.print("Enter your choice (1-3): ");
        int choice = SC.nextInt(); // Added missing scanner input read

        switch (choice) {
            case 1 -> {
                System.out.println("Human Choice = 'Rock'");
                if (randomNumber == 1) {
                    System.out.println("Tie!!");
                } else if (randomNumber == 2) { // Fixed the impossible && logic
                    System.out.println("Computer Wins (Paper covers Rock)");
                } else {
                    System.out.println("Human Wins (Rock smashes Scissors)");
                }
            }
            case 2 -> {
                System.out.println("Human Choice = 'Paper'");
                if (randomNumber == 1) {
                    System.out.println("Human Wins (Paper covers Rock)");
                } else if (randomNumber == 2) {
                    System.out.println("Tie!!");
                } else {
                    System.out.println("Computer Wins (Scissors cut Paper)");
                }
            }
            case 3 -> {
                System.out.println("Human Choice = 'Scissors'");
                if (randomNumber == 1) {
                    System.out.println("Computer Wins (Rock smashes Scissors)");
                } else if (randomNumber == 2) {
                    System.out.println("Human Wins (Scissors cut Paper)");
                } else {
                    System.out.println("Tie!!");
                }
            }
            default -> System.out.println("Enter Correct Sequence Number");
        }
        
        SC.close(); // Clean code practice to close resources
    }
}
