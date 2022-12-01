
import java.util.Scanner;



public class Quiz {
    public static void main(String[] args) throws Exception {
        
        // Create Categories
        Category heat = new Category("Heat", "You are probably a new fan of the NBA. You have just started to like the NBA and your favorite players are the best of the 2010s and early 2020s for the Heat. Examples include Lebron, Dwyane Wade, Chris Bosh, and Jimmy Butler");
        Category bulls = new Category("Bulls", "You are likely in your mid 20s and a pretty casual NBA fan. You were swept away by Michael Jordan and have been loyal since. You even supported them when MJ left.");
        Category celtics = new Category("Celtics",
                "You are an old head. You have been watching the NBA for a long time and love players like Larry Bird or even Bill Russell. You could also be extremely young and are looking forward to the bright future of your team.");
        Category knicks = new Category("Knicks", "You are LOYAL. You stick with someone at their bests and their worsts. You are an NBA fan that recieves hate but still stays tough. You are the best.");
        // Create Questions
        Question q1 = new Question("What is your favorite color");
        // Attach Answers to Questions
        q1.possibleAnswers[0] = new Answer("Blue", heat);
        q1.possibleAnswers[1] = new Answer("Red",
                bulls);
        q1.possibleAnswers[2] = new Answer("Green", celtics);
        q1.possibleAnswers[3] = new Answer("Orange", knicks);

        Question q2 = new Question("Who is your favorite NBA player");
        q2.possibleAnswers[0] = new Answer("Lebron James", heat);
        q2.possibleAnswers[1] = new Answer("Michael Jordan", bulls);
        q2.possibleAnswers[2] = new Answer("Larry Bird", celtics);
        q2.possibleAnswers[3] = new Answer("Kobe Bryant", knicks);

        Question q3 = new Question("Which movie do you like best");
        q3.possibleAnswers[0] = new Answer("Fast and Furious", heat);
        q3.possibleAnswers[1] = new Answer("Star Wars", bulls);
        q3.possibleAnswers[2] = new Answer("Back to the Future", celtics);
        q3.possibleAnswers[3] = new Answer("Karate Kid", knicks);

        Question q4 = new Question("What's your favorite bird");
        q4.possibleAnswers[0] = new Answer("Pigeon", heat);
        q4.possibleAnswers[1] = new Answer("Eagle", bulls);
        q4.possibleAnswers[2] = new Answer("Hawk", celtics);
        q4.possibleAnswers[3] = new Answer("Duck", knicks);

        Question q5 = new Question(
                "What's your favorite fast food restaraunt");
        q5.possibleAnswers[0] = new Answer(
                "Chipotle", heat);
        q5.possibleAnswers[1] = new Answer("McDonalds", bulls);
        q5.possibleAnswers[2] = new Answer(
                "KFC", celtics);
        q5.possibleAnswers[3] = new Answer(
                "Taco Bell", knicks);
    

        
        
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
        Category[] cList = {heat, bulls, celtics, knicks};
        int[] counts = {heat.points, bulls.points, celtics.points, knicks.points };
        // these need to be in the same order or the points will be incorrect!
        int index = getMostPopularCatIndex(counts);
        System.out.println("If you were an NBA team, you would be " + cList[index].label + ". ");
        System.out.println(cList[index].description);

    }

    public static void gameIntro(Scanner sc) {
        // requires 1 to keep going
        System.out.println("Which NBA team are you?");
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