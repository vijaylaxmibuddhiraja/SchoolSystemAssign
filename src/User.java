import java.util.ArrayList;
import java.util.Scanner;

abstract class User {                   // making the class as a superclass
    private String username;            //encapsulation
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;    //constructor
    }

    // getter and setter method

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public abstract void showMenu();              // abstract method

}




