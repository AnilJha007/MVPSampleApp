package dagger.com.myapptest;

/**
 * Created by Vishal Sharma on 6/28/18.
 */
public class DiplayPresenterImpl implements DisplayModelPresenterContract.Presenter, DisplayPresenterViewContract.Presenter {

    DisplayPresenterViewContract.View listenet;
    DisplayModelPresenterContract.Model checkModel;

    @Override
    public void senddFullName(String fullName) {

        listenet.setFullName(fullName);

    }


    public DiplayPresenterImpl(DisplayPresenterViewContract.View listenet) {
        this.listenet = listenet;

        checkModel = new DispalyModelImpl(this);
    }

    @Override
    public void getSirName(String userName) {

        if(userName.toLowerCase().equals("vishal")){
            checkModel.getVishalSirName(userName);
        }else{
            checkModel.getAnilSirName(userName);
        }

    }
}
