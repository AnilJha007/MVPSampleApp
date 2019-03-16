package dagger.com.myapptest;

import android.databinding.ObservableField;

/**
 * Created by Vishal Sharma on 6/28/18.
 */
public class UserNamePojo {

    public ObservableField<String> username = new ObservableField<>();


    public ObservableField<String> getUsername() {
        return username;
    }

    public void setUsername(ObservableField<String> username) {
        this.username = username;
    }
}
