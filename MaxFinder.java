class MaxFinder {
    public void max(int a, int b) {
        int result = (a > b) ? a : b;
        System.out.println("Max of two: " + result);
    }

    public void max(int a, int b, int c) {
        int result = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println("Max of three: " + result);
    }

    public static void main(String[] args) {
        MaxFinder m = new MaxFinder();
        m.max(10, 25);
        m.max(10, 25, 15);
    }
}