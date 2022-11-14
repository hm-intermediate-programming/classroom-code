
/*
 * Irene Feng Nov 2022
 * This is the class where we create the Quiz and run it. It has the main method.  
 */
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) throws Exception {
        // Create Categories
        Category monopoly = new Category("Monopoly", "You are traditional, ruthless, and go on long diatribes."
                + "You like to be in control.");
        Category catan = new Category("Catan", "You are very competitive "
                + "but it's hidden underneath a friendly verneer. You're kinda popular but you deny it.");
        Category ers = new Category("ERS (Egyption Ratscrew)",
                "You are a racket! You bring high energy and fun to any situation.");
        Category hanabi = new Category("Hanabi", "You are a zen master. If given the choice, peace, no war.");
        // Create Questions
        Question q1 = new Question("Where are you at the pool party?");
        // Attach Answers to Questions
        q1.possibleAnswers[0] = new Answer("Outside playing catch at the pool.", ers);
        q1.possibleAnswers[1] = new Answer("I'm the host of course, and entertaining my guests with stories.",
                monopoly);
        q1.possibleAnswers[2] = new Answer("Having everyone eat the pie I made", catan);
        q1.possibleAnswers[3] = new Answer("Eating pie and listening to a long story", hanabi);

        Question q2 = new Question("You're in a rock band. What instrument do you play?");
        q2.possibleAnswers[0] = new Answer("I'm the guitarist weeeo!", ers);
        q2.possibleAnswers[1] = new Answer("I'm the drummer, without me, the band's nothing", monopoly);
        q2.possibleAnswers[2] = new Answer("I'm the lead singer!", catan);
        q2.possibleAnswers[3] = new Answer("I'm the manager, taking care of my players behind the scenes.", hanabi);

        Question q3 = new Question("What's your favorite fit?");
        q3.possibleAnswers[0] = new Answer("Athleisure, you never know when you need to go fast.", ers);
        q3.possibleAnswers[1] = new Answer("All black.", hanabi);
        q3.possibleAnswers[2] = new Answer("Fancy as can be - suit and tie, floor length dress.", monopoly);
        q3.possibleAnswers[3] = new Answer("Anything cozy that I can lounge in.", catan);

        Question q4 = new Question("You have no homework today, how are you going to spend it?");
        q4.possibleAnswers[0] = new Answer("Calling my friends to see how they're doing.", hanabi);
        q4.possibleAnswers[1] = new Answer("Playing some ball with my friends.", ers);
        q4.possibleAnswers[2] = new Answer("Doing research on where I should vacation this summer.", monopoly);
        q4.possibleAnswers[3] = new Answer("Buying some supplies for school!", catan);

        Question q5 = new Question(
                "You are on your way home on a packed subway car and this next stop has way too many people waiting! What do you do?");
        q5.possibleAnswers[0] = new Answer(
                "Get off at the stop and let other people get in, I need to check my email anyway!", catan);
        q5.possibleAnswers[1] = new Answer("Help another person get on and give them your seat to stand", hanabi);
        q5.possibleAnswers[2] = new Answer(
                "Stay where you are, the faster people stop moving the faster we'll get moving.", ers);
        q5.possibleAnswers[3] = new Answer(
                "Get off at the stop and call a taxi/uber/whatever thing will get me there faster", monopoly);

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
        Category[] cList = { monopoly, catan, ers, hanabi };
        int[] counts = { monopoly.points, catan.points, ers.points, hanabi.points };
        // these need to be in the same order or the points will be incorrect!
        int index = getMostPopularCatIndex(counts);
        System.out.println("If you were a board game, you would be " + cList[index].label + ". ");
        System.out.println(cList[index].description);

    }

    public static void gameIntro(Scanner sc) {
        // requires 1 to keep going
        System.out.println("Which Board Game Are You?");
        System.out.println("You get to choose numbers 1-4 for every question. Enter '1' to play!");
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
