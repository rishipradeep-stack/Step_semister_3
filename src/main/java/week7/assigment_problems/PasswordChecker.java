public class Passwordchecker {

    private final String password;

    public Passwordchecker(String password) {
        this.password = password;
    }

    public String getStrength() {
        int length = password.length();
        if (length < 6) {
            return "Weak";
        } else if (length < 10) {
            return "Medium";
        } else {
            return "Strong";
        }
    }

    public static void main(String[] args) {
        Passwordchecker pc = new Passwordchecker("abcd");
        System.out.println(pc.getStrength());

        Passwordchecker pc2 = new Passwordchecker("abcdefghij");
        System.out.println(pc2.getStrength());
    }
}