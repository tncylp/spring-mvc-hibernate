package hello;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class UserDAO {

    public static void main(String[] args) {

        UserDAO userDao = new UserDAO();
        List<User> userList = userDao.getUserList();
        System.out.println("user size: "+userList.size());
        userList.stream().forEach(System.out::println);
    }

    public List<User> getUserList(){

        Session session = null;
        session = HibernateUtil.getSession();
        String queryStr = "FROM user";
        Query query = session.createQuery(queryStr);

        return query.list();
    }



}
