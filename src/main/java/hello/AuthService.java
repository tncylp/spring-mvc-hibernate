package hello;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate5.HibernateTemplate;

import hello.User;

public class AuthService {

    private HibernateTemplate hibernateTemplate;
    private static Logger log = Logger.getLogger(AuthService.class);

    public AuthService(){}

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate){
        this.hibernateTemplate = hibernateTemplate;
    }

    @SuppressWarnings( { "unchecked", "deprecation" } )
    public boolean findUser(String username, String password){
        log.info("Checking the user in the database");
        boolean isValidUser = false;
        String sqlQuery = "from User u where u.name=? and u.password=?";

        try {
            List userObj = (List) hibernateTemplate.find(sqlQuery, username, password);
            if(userObj != null && userObj.size() > 0){
                //log.info("Id= " + userObj.get(0).getId() + ", Name= " + userObj.get(0).getName() + ", Password= " + userObj.get(0).getPassword());
                isValidUser = true;
            }
        } catch (Exception e){
            isValidUser = false;
            log.error("Error while fetching the user from the DB.");
        }
        return isValidUser;
    }

}
