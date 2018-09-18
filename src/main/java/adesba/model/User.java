package adesba.model;

import org.hibernate.annotations.Entity;

import javax.persistence.*;

@Entity
@Table(name = "usr")
public class User {

    public static final int EMAIL_MAX =100;
    public static final int NAME_MAX=50;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(nullable = false,length = EMAIL_MAX)
    private String email;


    @Column(nullable = false,length = NAME_MAX)
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
