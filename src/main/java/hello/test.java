package hello;

public class test {
    public static void main(String[] args) {
        AuthService authService = new AuthService();

        System.out.println(authService.findUser("admin", "admin@1234"));
    }

}
