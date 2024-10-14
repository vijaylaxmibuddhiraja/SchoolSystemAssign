import java.util.ArrayList;


abstract class User {
    private final String username;
    private String password;
}

public User(String username, String password) {
    this.username = username;
    this.password = password;
}

public String getUsername() {
    return username;
}

public boolean checkpassword(String password) {
    return this.password.equals(password);
}

public void setPassword(String newPassword) {
    this.password = newPassword;
}

public abstract void showMenu();
public abstract void actionHandling(int choice, SchoolSystem system);
}

