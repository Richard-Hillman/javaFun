import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("enter a line: ");

        // String LineOfUserText = input.nextLine();
        // int value = input.nextInt();
        double value = input.nextDouble();

        System.out.println("You entered: " + value);
    }
}
