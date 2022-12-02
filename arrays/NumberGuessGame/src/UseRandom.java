/** 
 * This class allows us to understand how to implement Randomness in java. 
 */
import java.util.Random; 

public class UseRandom {
    public static void main(String[] args) throws Exception {
        int max = 100; 
        int min = 5;
        Random r = new Random();  
        // For integers, can convert easily using java.util.Random
        
        for (int i = 0; i < 100; i++) {
            int randInt = r.nextInt(min, max + 1); // [min, max) EXCLUSIVE of max 
            System.out.print(randInt + ", ");
        }
        System.out.println("");


        // Use of Math.random() - it returns a double, so you have to convert back to int
        // not really recommended if you want ints anyway. (you can also generate doubles with Random)
        for (int i = 0; i < 100; i++) {
            int randNumber = (int) (Math.random() * (max - min) + min);
            System.out.print(randNumber + ", ");
        }
        
        System.out.println("");

    }
}