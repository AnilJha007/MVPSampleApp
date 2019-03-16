package dagger.com.myapptest;

/**
 * Created by Vishal Sharma on 6/28/18.
 */
public interface DisplayModelPresenterContract {

    interface Model{

      void  getVishalSirName(String name);

      void getAnilSirName(String name);

    }
    interface  Presenter{

        void senddFullName(String fullName);

    }
}
