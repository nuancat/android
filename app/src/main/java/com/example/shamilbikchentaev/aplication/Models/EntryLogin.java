package com.example.shamilbikchentaev.aplication.Models;

import com.example.shamilbikchentaev.aplication.Exceptions.InvalidLoginPair;

/**
 * Created by shamilbikchentaev on 04.12.17.
 */

public class EntryLogin {
    private String password;
    private String login;

    public EntryLogin(String password, String login) {
        this.password = password;
        this.login = login;
    }

    public boolean isValid() throws InvalidLoginPair {
        if (login.length()<4) {
            throw new InvalidLoginPair("Login is incorrect");
        }
        if (password.length()<4){
            throw new InvalidLoginPair("Password is incorrect");
        }
        return true;

    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object obj) {
        return login.equals(((EntryLogin)obj).login) && password.equals (((EntryLogin)obj).password);
    }
}
