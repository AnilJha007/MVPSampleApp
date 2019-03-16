package dagger.com.myapplication;

/**
 * Created by Vishal Sharma on 6/28/18.
 */
public interface LoginPresenterViewContract {

    interface View{

       void startLoading();

       void stopLoading();

       void  moveToNext(String userName);

    }

    interface Presenter{

        void validateCredential(String userName, String password);

    }
}
