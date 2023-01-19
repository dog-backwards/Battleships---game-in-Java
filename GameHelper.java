package Battleships;
import java.util.Scanner;

public class GameHelper {
    
    public int getUserInput (String prompt) {
        System.out.print(prompt + ": ");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
    }
}

// Old implementation
// public int getUserInput (String prompt) {
//     System.out.print(prompt + ": ");
//     Scanner scanner = new Scanner(System.in);
//     return scanner.nextInt();
// }
// }