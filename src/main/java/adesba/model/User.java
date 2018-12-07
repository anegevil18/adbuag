package adesba.model;
//
//import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;
//@Entity
public class User implements Serializable {
    private String correo;
    private String username;
    private String pwd;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
