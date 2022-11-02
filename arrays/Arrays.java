class Arrays {

    public static void main(String[] args) {
        // Declaration 
        // double[] arrayOfGPAs; 
        boolean[] truthArray; 
        String[] strArray;
        // initialization
        double[] arrayOfGPAs = { 0.2, -5.00, 4.00};
         // this is syntactic sugar!
        truthArray = new boolean[13];
        strArray = new String[13];
        // access 
        System.out.println(truthArray[0]);
        System.out.println(strArray[0]);
        // change 
        strArray[0] = "2,400 trees are cut down each minute";
        System.out.println(strArray[0]);

        // for loop
        for (int i = 0; i <= 2; i++) {
            System.out.println(arrayOfGPAs[i]);
        }
        for(double gpa: arrayOfGPAs) {
            System.out.println(gpa);
        }
    }
}