public class Locker {

    @SuppressWarnings("unused")
    private final int lockerNumber;
    private String code;

    public Locker(int lockerNumber, String code) {
        this.lockerNumber = lockerNumber;
        this.code = code;
    }

    public boolean changeCode(String oldCode, String newCode) {
        if (oldCode.equals(code)) {
            code = newCode;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Locker l = new Locker(101, "1234");

        boolean result1 = l.changeCode("1234", "5678");
        System.out.println("Change with correct code: " + result1);

        boolean result2 = l.changeCode("0000", "9999");
        System.out.println("Change with wrong code: " + result2);
    }
}