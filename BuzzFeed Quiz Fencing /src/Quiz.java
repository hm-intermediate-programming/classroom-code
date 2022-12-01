/*
 * This is the class where we create the Quiz and run it. It has the main method.  
 */
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) throws Exception {
        // Create Categories
        Category epee = new Category("epee", "you like a swords that poke your oponent, its gurad covers the entire hand and is typically done by taller people."
                + "You like to move slow.");
        Category sabre = new Category("sabre", "You are very competitive, objectively the best sword because of its immense skill "
                + "You live a fast paced lifestyle");
        Category foil = new Category("foil",
                "You are interesting, you like the easiness of life, you tend to go with the flow");
        
        
        Question q1 = new Question("What is your favorite color?");
        // Attach Answers to Questions
        q1.possibleAnswers[0] = new Answer("Red",
                epee);
        q1.possibleAnswers[1] = new Answer("Green", sabre);
        q1.possibleAnswers[2] = new Answer("Yellow", foil);

        Question q2 = new Question("Who is your favorite NBA player?");
        q2.possibleAnswers[0] = new Answer("Kobe Bryant", epee);
        q2.possibleAnswers[1] = new Answer("Michael Jordan", sabre);
        q2.possibleAnswers[2] = new Answer("Lebron James", foil);

        Question q3 = new Question("What is your preferred video game experience?");
        q3.possibleAnswers[0] = new Answer("Handheld", epee);
        q3.possibleAnswers[1] = new Answer("Personal computer", sabre);
        q3.possibleAnswers[2] = new Answer("Game station", foil);

        Question q4 = new Question("How fast are you?");
        q4.possibleAnswers[0] = new Answer("Slow", epee);
        q4.possibleAnswers[1] = new Answer("Very fast", sabre);
        q4.possibleAnswers[2] = new Answer("Fast", foil);

        Question q5 = new Question(
                "Do you like the idea of getting points on just the torso, torso and above, or the entire body");
        q5.possibleAnswers[0] = new Answer("Entire body", epee);
        q5.possibleAnswers[1] = new Answer(
                "Torso and above", sabre);
        q5.possibleAnswers[2] = new Answer(
                "Just the torso", foil);

        // For each question, ask, read input, store answer.
        Scanner sc = new Scanner(System.in);
        gameIntro(sc);
        Question[] qList = { q1, q2, q3, q4, q5 };
        for (Question q : qList)
         {
            Category c = q.ask(sc);
            c.points++;
        }
        // Get most common category from the questions asked
        // Return Category
        Category[] cList = { epee, sabre, foil, };
        int[] counts = { epee.points, sabre.points, foil.points };
        // these need to be in the same order or the points will be incorrect!
        int index = getMostPopularCatIndex(counts);
        System.out.println("If you were a sword game, you would be " + cList[index].label + ". ");
        System.out.println(cList[index].description);

    }

    public static void gameIntro(Scanner sc) {
        // requires 1 to keep going
        System.out.println("What sword in fencing should you choose?");
        System.out.println("You get to choose numbers 1-3 for every question. Enter '1' to play!");
        int play = sc.nextInt();
        if (play != 1) {
            System.out.println("Unidentifiable input. Please enter '1' to play");
            gameIntro(sc);
        }
    }

    public static int getMostPopularCatIndex(int[] counts) {
        // returns the index that is the max
        int maxCount = 0;
        int maxIndex = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}