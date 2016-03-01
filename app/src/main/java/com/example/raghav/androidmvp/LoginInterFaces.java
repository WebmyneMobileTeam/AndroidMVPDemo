package com.example.raghav.androidmvp;

/**
 * Created by raghav on 29/2/16.
 */
public class LoginInterFaces {


    public interface LoginView{

        void showProgressBar();

        void hideProgressBar();

        void showUserNameError();

        void showPasswordError();

        void navigateToHome();
    }


    public interface LoginModel{

        void validCredential(Login login);

        void destory();
    }

}
