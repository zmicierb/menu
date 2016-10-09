package by.borisevich.menu.domain.admin;

import by.borisevich.menu.domain.AbstractPersistable;

import javax.persistence.*;

/**
 * Created by dima on 7/13/16.
 */

@Entity
@Table(name = "SESSION", schema = "DICT")
public class Session extends AbstractPersistable<String> {
    @Id
    @Column(name = "id")
    private String id; // id http session
    @Column(name = "ip")
    private String ip;
    @Column(name = "user_id", insertable = false, updatable = false)
    private String userId;
    @OneToOne
    @JoinColumn(name = "user_id")
    private Login login;


    public Session() {

    }

    public Session(String userId, String id, String ip, Login login) {
        this.userId = userId;
        this.id = id;
        this.ip = ip;
        this.login = login;
    }

    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

