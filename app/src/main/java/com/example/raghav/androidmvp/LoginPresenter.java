package com.example.raghav.androidmvp;

/**
 * Created by raghav on 29/2/16.
 */

import com.example.raghav.androidmvp.LoginInterFaces.LoginView;

public class LoginPresenter implements LoginInterFaces.LoginModel {


    private LoginView mLoginView;


    public LoginPresenter(LoginView mLoginView) {
        this.mLoginView = mLoginView;
    }

    @Override
    public void validCredential(Login login) {

        if (login.getUserName().isEmpty()) {
            mLoginView.showUserNameError();
        } else if (login.getPassword().isEmpty()) {
            mLoginView.showPasswordError();
        } else {

            mLoginView.showProgressBar();
            new android.os.Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mLoginView.hideProgressBar();
                    mLoginView.navigateToHome();
                }
            }, 2000);
        }

    }

    @Override
    public void destory() {
        if (this.mLoginView != null) {
            this.mLoginView = null;
        }
    }
}
