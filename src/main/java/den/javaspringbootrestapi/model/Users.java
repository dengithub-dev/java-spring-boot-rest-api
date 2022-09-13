package den.javaspringbootrestapi.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    public String user_id;
    public String user_name;
    public String user_address;
    public String user_email;
    public String user_password;

    public String getUser_id() {
        return user_id;
    }
    public String getUser_name() {
        return user_name;
    }
    public String getUser_address() {
        return user_address;
    }
    public String getUser_email() {
        return user_email;
    }
    public String getUser_password() {
        return user_password;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}


