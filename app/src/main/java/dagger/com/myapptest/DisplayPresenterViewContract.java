package dagger.com.myapptest;

/**
 * Created by Vishal Sharma on 6/28/18.
 */
public interface DisplayPresenterViewContract {

     interface Presenter{

         void getSirName(String userName);

    }

    interface View{

       void   setFullName(String fullName);

    }

}
