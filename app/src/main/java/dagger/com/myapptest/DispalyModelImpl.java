package dagger.com.myapptest;

/**
 * Created by Vishal Sharma on 6/28/18.
 */
public class DispalyModelImpl implements DisplayModelPresenterContract.Model {


    DisplayModelPresenterContract.Presenter presenter;

    @Override
    public void getVishalSirName(String name) {


        presenter.senddFullName(name + "Sharma");
    }

    @Override
    public void getAnilSirName(String name) {

        presenter.senddFullName(name+ "Jha");
    }

    public DispalyModelImpl(DisplayModelPresenterContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
