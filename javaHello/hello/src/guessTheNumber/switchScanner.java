import java.util.Scanner;

import jdk.javadoc.internal.tool.Start;

public class switchScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Command");
        String command = input.nextLine();

        switch(command) {
        case "start": 
            System.out.println("machine started");
            break;
        case "end": 
            System.out.println("Machine Shutting down");
            break;

            default:
                System.out.println("machine idly off");
        }

    }


}
