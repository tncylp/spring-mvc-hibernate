package hello;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class UserDAO {

    public List<User> getUserList(){

        Session session = null;
        session = HibernateUtil.getSession();
        String queryStr = "FROM user";
        Query query = session.createQuery(queryStr);

        return query.list();
    }

}
