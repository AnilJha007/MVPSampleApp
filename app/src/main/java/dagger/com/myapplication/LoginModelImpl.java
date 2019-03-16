package dagger.com.myapplication;

/**
 * Created by Vishal Sharma on 6/28/18.
 */
public class LoginModelImpl implements LoginModelPresenterContract.Model {


    LoginModelPresenterContract.Presenter listener;

    @Override
    public void holdDataFor5Seconds(String userName, String password) {

        listener.onSuccess(userName);

    }

    public LoginModelImpl(LoginModelPresenterContract.Presenter listener) {
        this.listener = listener;
    }
}

