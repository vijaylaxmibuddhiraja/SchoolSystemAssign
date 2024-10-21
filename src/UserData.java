import java.util.ArrayList;

public class UserData {
    private ArrayList<User> users;

    public UserData() {
        users = new ArrayList<>();

        users.add(new Admin("admin", "abcd"));
        users.add(new Teacher("teacher", "qrst"));
        users.add(new Student("student", "wxyz"));
    }


    public User getUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void addUser(String username, String password, String role) {
        if (getUser(username) == null) {
            switch(role) {
                case "Admin":
                    users.add(new Admin(username, password));
                    break;
                case "Teacher":
                    users.add(new Teacher(username, password));
                    break;
                case "Student":
                    users.add(new Student(username, password));
                    break;
                default:
                    System.out.println("Invalid role!");
                    return;
            }
            System.out.println("User added successfully");
        } else {
            System.out.println("Username already exists!");
        }
    }

    public void removeUser(String username) {
        User userToRemove = getUser(username);
        if(userToRemove != null) {
            users.remove(userToRemove);
            System.out.println("User removed succesfully");
        } else{
            System.out.println("User not found");
        }
    }

    public void updatePassword(String username, String password){
        User userToUpdate = getUser(username);
        if(userToUpdate != null){
            userToUpdate.setPassword(password);
            System.out.println("Password updated");
        } else {
            System.out.println("User not found");
        }
    }

    public void displayAllUsers() {
        for (User user : users) {
            System.out.println("Username: " + user.getUsername() + ", Role: " + user.getRole());
        }
    }
}

