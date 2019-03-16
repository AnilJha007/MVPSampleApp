package dagger.com.myapplication;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import dagger.com.myapplication.databinding.ActivityMainBinding;
import dagger.com.myapptest.DisplayActivity;

public class MainActivity extends AppCompatActivity implements LoginPresenterViewContract.View{

    ActivityMainBinding activityMainBinding;
    LoginPresenterViewContract.Presenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        activityMainBinding.setBtntxt(new ButtonTextPojo("Login"));
        activityMainBinding.setHandlers(new ClickHandler());

        loginPresenter = new LoginPresenterImpl(this);

    }

    @Override
    public void startLoading() {

        Toast.makeText(this, "Loading Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void stopLoading() {
        Toast.makeText(this, "Loading Stopped", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void moveToNext(String userName) {

        startActivity(new Intent(this, DisplayActivity.class).putExtra("username",userName));
    }

    public class ClickHandler{

      public void  onLoginClick(View view){

          loginPresenter.validateCredential(activityMainBinding.tvUsername.getText().toString(), activityMainBinding.tvPassword.getText().toString());

        }
    }

}
