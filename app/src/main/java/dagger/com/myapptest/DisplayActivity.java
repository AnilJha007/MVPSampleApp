package dagger.com.myapptest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import dagger.com.myapplication.R;
import dagger.com.myapplication.databinding.ActivityDisplayBinding;

/**
 * Created by Vishal Sharma on 6/28/18.
 */
public class DisplayActivity extends AppCompatActivity implements DisplayPresenterViewContract.View{

    String username = "";
    DisplayPresenterViewContract.Presenter presenter;
    ActivityDisplayBinding binding;
    UserNamePojo userNamePojo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = DataBindingUtil.setContentView(this, R.layout.activity_display);


       username = getIntent().getStringExtra("username");

       userNamePojo = new UserNamePojo();
       userNamePojo.username.set(username);

       binding.setUsername(userNamePojo);

       presenter = new DiplayPresenterImpl(this);

       presenter.getSirName(username);

    }

    @Override
    public void setFullName(String fullNmae) {

        userNamePojo.username.set(fullNmae);

    }



}
