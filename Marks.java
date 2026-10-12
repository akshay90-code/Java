class Marks {
    public void avg(int s1, int s2) {
        System.out.println("Average of two marks: " + (s1 + s2) / 2);
    }

    public void avg(int s1, int s2, int s3) {
        System.out.println("Average of three marks: " + (s1 + s2 + s3) / 3);
    }

    public static void main(String[] args) {
        Marks st = new Marks();
        Marks st1 = new Marks();

        st.avg(20, 80);
        st1.avg(20, 80, 40);
    }
}