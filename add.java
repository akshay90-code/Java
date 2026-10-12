class add {
    
    // Method to add two integers
    public void add(int a, int b) {
        System.out.println("Sum of two ints: " + (a + b));
    }

    // Method to add three integers
    public void add(int a, int b, int c) {
        System.out.println("Sum of three ints: " + (a + b + c));
    }

    // Method to add two double values
    public void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    public static void main(String[] args) {
        // Correct object instantiation
        Addition a1 = new Addition();

        // Calling overloaded methods
        a1.add(5, 6);         // Calls the 2-int method
        a1.add(5, 6, 7);      // Calls the 3-int method
        a1.add(5.5, 6.6);     // Calls the 2-double method
    }
}