package dagger.com.myapplication;

/**
 * Created by Vishal Sharma on 6/28/18.
 */
public class LoginPresenterImpl implements LoginPresenterViewContract.Presenter, LoginModelPresenterContract.Presenter{

    LoginPresenterViewContract.View listener;
    LoginModelPresenterContract.Model loginModel;

    @Override
    public void validateCredential(String userName, String password) {

        listener.startLoading();

        if(userName.length() == 0){
            listener.stopLoading();
            return;
        }

        loginModel.holdDataFor5Seconds(userName, password);

    }

    public LoginPresenterImpl(LoginPresenterViewContract.View listener ) {

        this.listener = listener;

        loginModel = new LoginModelImpl(this);
    }

    @Override
    public void onSuccess(String userName) {
        listener.stopLoading();

        listener.moveToNext(userName);
    }

    @Override
    public void onFailure() {

    }
}
