package dagger.com.myapplication;

/**
 * Created by Vishal Sharma on 6/28/18.
 */
public class UserPojo {

    private  String username;
    private String password;

    public UserPojo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
