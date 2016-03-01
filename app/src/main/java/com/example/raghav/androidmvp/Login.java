package com.example.raghav.androidmvp;

/**
 * Created by raghav on 29/2/16.
 */
public class Login  {

    private String userName;

    private String password;


    //Constructor

    public Login() {
        this.userName = "";
        this.password = "";
    }

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public boolean equals(Object o) {

        if (o == null) {

            return false;
        }

        if (o instanceof Login) {

            Login login = (Login) o;

            if (this.userName.equalsIgnoreCase(login.userName) && this.password.equalsIgnoreCase(login.password)) {
                return true;
            }

        }

        return false;
    }

    //getter and setter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
