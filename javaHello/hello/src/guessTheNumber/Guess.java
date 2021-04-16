import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = 0;1
        

        do {
            System.out.println("Guess the number");
            value = scanner.nextInt(); 
        }
        while(value != 5); 

        // System.out.println("enter a number until you guess the right number");
        // int value = scanner.nextInt();
        // while(value != 5) {
        //     System.out.println("guess again");
        //     value = scanner.nextInt();
        // }


        System.out.println("you win!");
    }

}