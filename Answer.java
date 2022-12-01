/*
 * This is an answer, that if selected, will show you what Category you are.
 */

public class Answer {
    String label;
    Category cat;

    Answer(String label, Category c) {
        this.label = label; 
        this.cat = c;
    }
}