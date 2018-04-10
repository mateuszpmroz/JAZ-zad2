<<<<<<< HEAD
package EJB;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.UserGroups;
import model.User;
import utils.AuthenticationUtils;
@Stateless
public class UserEJB {
    @PersistenceContext(unitName="webapp")
    private EntityManager em;

    public User createUser(User user) {
        try {
            user.setPassword(AuthenticationUtils.encodeSHA256(user.getPassword()));
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
        UserGroups UserGroups = new UserGroups();
        UserGroups.setEmail(user.getEmail());
        UserGroups.setGroupname(UserGroups.USERS_GROUP);
        em.persist(user);
        em.persist(UserGroups);

        return user;
    }
    public User findUserById(String id) {
        TypedQuery<User> query = em.createNamedQuery("findUserById", User.class);
        query.setParameter("email", id);
        User user = null;
        try {
            user = query.getSingleResult();
        } catch (Exception e) {
        }
        return user;
    }
=======
package EJB;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.UserGroups;
import model.User;
import utils.AuthenticationUtils;
@Stateless
public class UserEJB {
    @PersistenceContext(unitName="webapp")
    private EntityManager em;

    public User createUser(User user) {
        try {
            user.setPassword(AuthenticationUtils.encodeSHA256(user.getPassword()));
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
        UserGroups UserGroups = new UserGroups();
        UserGroups.setEmail(user.getEmail());
        UserGroups.setGroupname(UserGroups.USERS_GROUP);
        em.persist(user);
        em.persist(UserGroups);

        return user;
    }
    public User findUserById(String id) {
        TypedQuery<User> query = em.createNamedQuery("findUserById", User.class);
        query.setParameter("email", id);
        User user = null;
        try {
            user = query.getSingleResult();
        } catch (Exception e) {
        }
        return user;
    }
>>>>>>> 811abc7200b8c10f6f5bb1ab443f7610cee7d468
}