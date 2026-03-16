interface SecurityUtils {

    static boolean isStrongPassword(String password) {
        return password.length() >= 8;
    }
}

public class TestPassword {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrongPassword("mypassword"));
    }
}