package com.example.kunakornm.queuemaster.login.presenter;

import com.example.kunakornm.queuemaster.login.view.LoginViewInterface;

public class LoginPresenterImpl implements LoginPresenterInterface {
    LoginViewInterface loginViewInterface;
    //todo link presenter with view interface
    public  LoginPresenterImpl(LoginViewInterface loginViewInterface){
        this.loginViewInterface = loginViewInterface;
    }


    @Override
    public void checkVersion() {

    }

    @Override
    public void checkInternet() {

    }
}

