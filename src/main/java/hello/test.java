package hello;

import java.util.List;

public class test {

    public static void main(String[] args) {

        UserDAO userDao = new UserDAO();
        List<User> userList = userDao.getUserList();
        System.out.println("User size: " + userList.size());
        userList.stream().forEach(System.out::println);
    }

}
