import java.util.Scanner;

public class Question {
    // Fields
    String label;
    Answer[] possibleAnswers = new Answer[4];
    

    Question(String label) {
        this.label = label;
    }

    // ask a question, and return the category of the answer
    Category ask(Scanner sc) {
        System.out.println(this.label);
        // prints out all the answer choices
        for (int i = 0; i < this.possibleAnswers.length; i++) {
            String choice = Integer.toString(i + 1);
            System.out.println("[" + choice + "]:" +
                    this.possibleAnswers[i].label);
        }
        int ans = ErrorChecking.errorCheck(sc);
        return possibleAnswers[ans - 1].cat;
    }

}

 class ErrorChecking {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in); 
            errorCheck(sc);
        }
    
        public static int errorCheck(Scanner sc) {
            System.out.println("I am expecting a number from 1 - 4!");
            
            if(sc.hasNextInt()) {
                int input = sc.nextInt();
                System.out.println("This is a number");
                if (input > 4 || input < 1) {
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