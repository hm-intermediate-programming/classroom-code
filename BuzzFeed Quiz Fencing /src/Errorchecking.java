import java.util.Scanner; 
//This is my error checking code
public class Errorchecking {
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
                return errorCheck(sc);
            } else {
                System.out.println("Yay! This is what I expected");
                return input;
            }
        } else {
            System.out.println("This is not a number. Discarding this input");
            sc.next(); // discarding the next input
            return errorCheck(sc);
        }
    }
}