import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo {
    // ArrayLists (and other Collections) differ from arrays in that 
    // they have variable size! 
    // this allows us for us to add and delete arbitrary elements 
    // throughout the lifespan of the arraylist. 
    public static void main(String[] args) throws Exception {
        ArrayList<String> names = new ArrayList();
        System.out.println("Length of names: " + names.size());
        // adding
        names.add("Wednesday Addams");
        names.add("Daemon Targaryen");
        names.add("Celtics");
        names.add("Emma");
        System.out.println("Length of names: " + names.size());
        for (String name: names) {
            System.out.println(name);
        }
        // removal 
        boolean isKnicksRemoved = names.remove("Knicks");
        boolean isEmmaRemoved = names.remove("Emma");
        System.out.println("After removal: isKnicksRemoved: " + isKnicksRemoved);
        System.out.println("After removal: isEmmaRemoved: " + isEmmaRemoved);
        for (String name: names) {
            System.out.println(name);
        }

        // access and contains
        System.out.println("Name at index 2: " + names.get(2));
        if (names.contains("Celtics")) {
            System.out.println("I love Doc Rivers");
        }


    }

    // you have to create new arrays every time you want to remove 
    // something from the list. 
    public static void arrays() {
        String[] food = { "chips", "apples", "pretzel", "apple sauce" };
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking suggestions for party snacks!");
        String newFood = sc.nextLine();
        String[] food2 = new String[food.length + 1];
        for (int i = 0; i < food.length; i++) {
            food2[i] = food[i];
        }
        
        food2[food2.length - 1] = newFood;
        System.out.print("Foods in food2: ");
        for (String f : food2) {
            System.out.print(f + ", ");
        }
    }
}
