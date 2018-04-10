<<<<<<< HEAD
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user_groups")
public class UserGroups implements Serializable {
    private static final long serialVersionUID = 1528447384986169065L;

    public static final String USERS_GROUP = "users";

    @Id
    @Column(name="email", nullable=false, length=255)
    private String email;

    @Column(name="groupname", nullable=false, length=32)
    private String groupname;

    public UserGroups() {}
    public UserGroups(String email, String groupname) {
        this.email = email;
        this.groupname = groupname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGroupname() {
        return groupname;
    }
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
=======
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user_groups")
public class UserGroups implements Serializable {
    private static final long serialVersionUID = 1528447384986169065L;

    public static final String USERS_GROUP = "users";

    @Id
    @Column(name="email", nullable=false, length=255)
    private String email;

    @Column(name="groupname", nullable=false, length=32)
    private String groupname;

    public UserGroups() {}
    public UserGroups(String email, String groupname) {
        this.email = email;
        this.groupname = groupname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGroupname() {
        return groupname;
    }
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
>>>>>>> 811abc7200b8c10f6f5bb1ab443f7610cee7d468
}