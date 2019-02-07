package hello;

import java.util.List;
import hello.UserDAO;
import hello.User;

public class App {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        User user = new User("tncylp", "pass");
        userDAO.saveUser(user);

        /*
        List <User> users = userDAO.getUsers();
        users.forEach(s -> System.out.println(s.getUsername()));
        */
    }
}