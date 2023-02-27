import java.util.*;

class Numberguessing {
    public static void main(String[] args) {
        int attempt = 1;
        int userguess = 0;
        int Random = (int) (Math.random() * 99 + 1);
        Scanner userInput = new Scanner(System.in);

        System.out.println();
        System.out.println("++++++ WELCOME TO NUMBER GUESS GAME ++++++");
        System.out.println();
        System.out.println("GUESS THE NUMBER to WIN THE GAME.");
        System.out.println("You have maximum 5 attempt limit.");
        System.out.println();
        do {
            System.out.print("Enter a guess number between 1 to 100\n");
            if (userInput.hasNextInt()) {
                userguess = userInput.nextInt();
                if (userguess == Random) {
                    System.out.println("***** Congratulation....You Won The Game. *****");
                    
                    break;
                } else if (userguess < Random)
                    System.out.println("Your Guess is Smaller.");
                else if (userguess > Random)
                    System.out.println("Your Guess is Greater.");
                if (attempt == 5) {
                    System.out.println("You have exceeded the maximum attempt.try Again 50");
                    break;
                }
                attempt++;
            } else {
                System.out.println("Enter a Valid Integer Number.");
                break;
            }
        } while (userguess != Random);

    }
}