package dagger.com.myapplication;

/**
 * Created by Vishal Sharma on 6/28/18.
 */
public interface LoginModelPresenterContract {

     interface Model{

         void holdDataFor5Seconds(String userName, String password);

    }

      interface Presenter{

       void onSuccess(String name);
       void onFailure();

    }
}
