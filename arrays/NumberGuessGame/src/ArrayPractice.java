import java.util.ArrayList;

public class ArrayPractice {
    public static void main(String[] args) throws Exception {
        // double[] dubs = {5.0, 7.3, 9.0, 2.3};
        ArrayList<Double> dubs = new ArrayList();
        dubs.add(5.3);
        dubs.add(7.0);
        dubs.add(9.2);
        dubs.add(2.3);
        System.out.println(findMaxInAL(dubs));
        // for(double d : dubs) {
        //     System.out.print(d + ", ");
        // }
    }

    public static double findMaxInArray(double[] input) {
        double max = input[0]; 
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }

    public static double findMaxInAL(ArrayList<Double> input) {
        double max = input.get(0); 
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i) > max) {
                max = input.get(i);
            }
        }
        return max;
    }

    public static Student findMaxStudentInAL(ArrayList<Student> input) {
        Student maxStudent = input.get(0); 
        int maxIndex = 0; // alternate way 
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i).GPA > maxStudent.GPA) {
                maxStudent = input.get(i);
                // alternate: update maxIndex
            }
        }
        // alternate: return input.get(maxIndex) - can get the student 
        return maxStudent;
    }

    class Student {
        String name; 
        double GPA; 
    }
    
}
