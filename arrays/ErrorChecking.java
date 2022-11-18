/* 
 * This is a demo of Handling errors in user input. 
 * Sorry for not having this prepared for class on 11/18 :(
 */
import java.util.Scanner; 

public class ErrorChecking {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        errorCheck(sc);
    }

    public static int errorCheck(Scanner sc) {
        System.out.println("I am expecting a number from 1 - 5!");
        
        if(sc.hasNextInt()) {
            int input = sc.nextInt();
            System.out.println("This is a number");
            if (input > 5 || input < 1) {
                System.out.println("Hey! this number is not what I wanted. Try again.");
                errorCheck(sc);
            } else {
                System.out.println("Yay! This is what I expected");
                return input;
            }
        } else {
            System.out.println("This is not a number. Discarding this input");
            sc.next(); // discarding the next input
            errorCheck(sc);
        }
        return -1; // this will never actually return -1 because we are always calling the function again.
    }
}
