class Login {
    public void login(String n) {
        System.out.println("Name: " + n);
    }

    public void login(String n, String p) {
        System.out.println("Name: " + n);
        System.out.println("Pass: " + p);
    }

    public void login(String n, String p, int otp) {
        System.out.println("Name: " + n);
        System.out.println("Pass: " + p);
        System.out.println("OTP: " + otp);
    }

    public static void main(String[] args) {
        Login l = new Login();
        l.login("Alice");
        l.login("Alice", "secret123");
        l.login("Alice", "secret123", 4567);
    }
}