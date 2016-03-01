package com.example.raghav.androidmvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class LoginActivity extends AppCompatActivity implements LoginInterFaces.LoginView, View.OnClickListener {


    private EditText mUserName, mPassWord;
    private Button mButton;
    private ProgressBar mProgressBar;
    private LoginInterFaces.LoginModel mLoginModel;
    private Login mLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {

        //EditText
        mUserName = (EditText) findViewById(R.id.userName);
        mPassWord = (EditText) findViewById(R.id.password);
        //button
        mButton = (Button) findViewById(R.id.button);
        //progressBar
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);

        //click
        mButton.setOnClickListener(this);
        mLogin = new Login();
        mLoginModel = new LoginPresenter(this);


    }

    @Override
    public void showProgressBar() {

        mProgressBar.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideProgressBar() {

        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void showUserNameError() {

        mUserName.setError("Invalid UserName.");

    }

    @Override
    public void showPasswordError() {

        mPassWord.setError("Invalid Password.");
    }

    @Override
    public void navigateToHome() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        mLoginModel.destory();
        finish();

    }

    @Override
    public void onClick(View v) {


        mLogin.setUserName(mUserName.getText().toString());
        mLogin.setPassword(mPassWord.getText().toString());
        mLoginModel.validCredential(mLogin);

    }
}
