package iostreams;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserHw implements Serializable {
    public final String login;
    public transient String password;

    public UserHw(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
