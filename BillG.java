class BillG {
    public void bill(int q, int Bprice) {
        System.out.println(q * Bprice);
    }

    public void bill(int q, double Bprice) {
        System.out.println(q * Bprice);
    }

    public static void main(String[] args) {
        BillG b1 = new BillG();
        b1.bill(2, 30);
        b1.bill(2, 30.5);
    }
}