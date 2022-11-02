public class Arrays {
    public static void main(String[] args) throws Exception {
        // Introduce defining / declaring arrays of various types
        int[] array;
        boolean[] boolArr;
        String[] strArr;
        
        // Initialization 
        array = new int[10];
        boolArr = new boolean[10];
        strArr = new String[10];
        // Initialization: literal 
        int[] literal = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int[] literal_sweet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // syntactic sugar of the above

        // Access - use varName[index] notation
        System.out.println(literal[0]);
        System.out.println(array[0]);
        System.out.println(boolArr[1]);
        System.out.println(strArr[2]);
        
        // Change values
        array[0] = 23;
        literal[0] = 2343;

        // Iterate through: 1) forEach, 
        // 2) for with start and stop conditions
        for(int i : array) {
            System.out.println(i);
        } 
        for(int b = 0; b < array.length; b++) {
            System.out.println(array[b]);
        }
        

    }
}
