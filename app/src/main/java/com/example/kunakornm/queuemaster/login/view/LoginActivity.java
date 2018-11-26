package com.example.kunakornm.queuemaster.login.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kunakornm.queuemaster.R;
import com.example.kunakornm.queuemaster.home.view.HomeActivity;
import com.example.kunakornm.queuemaster.login.presenter.LoginPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginViewInterface {
    @Nullable
    @BindView(R.id.txt_title)
    TextView titleLabel;
    @Nullable
    @BindView(R.id.edt_user)
    EditText edtUser;
    @Nullable
    @BindView(R.id.edt_pass)
    EditText edtPass;
    @Nullable
    @BindView(R.id.btn_login)
    Button loginBtn;
    @Nullable
    @BindView(R.id.btn_signup)
    Button regBtn;

    LoginPresenterImpl loginPresenter ;
    // @Inject
//    LoginPresenterImpl loginPresenter ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
       // ButterKnife.inject(this);
        initPresenter();
        initInstance();
    }

    private void initInstance() {
//        loginClicked(findViewById(R.id.btn_login));
        titleLabel.setText("TestButterKnife BindView");
    }


    //todo link presenter(viewInterface)
    private void initPresenter() {
        loginPresenter = new LoginPresenterImpl(this);
    }


    @OnClick(R.id.btn_login)
    public void loginClicked(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("", "");
        startActivity(intent);
    }

}
