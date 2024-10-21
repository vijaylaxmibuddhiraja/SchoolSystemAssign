import java.util.Scanner;

public class LoginUser {
    private UserData userData;
    private User currentUser;
    private Scanner scanner;

    public LoginUser() {
        userData = new UserData();
        currentUser = null;
        scanner = new Scanner(System.in);
    }

    public void  authentication() {
        while (true) {
            if (currentUser == null) {
                System.out.println("1. Login");
                System.out.println("2. Exit");
                System.out.println("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        login();
                        break;
                    case 2:
                        System.out.println("Goodbye!!");
                        return;
                    default:
                        System.out.println("Invalid Option!!!");
                        break;
                }
            } else {
                if ("Admin".equals(currentUser.getRole())) {
                    System.out.println("1. Add User");
                    System.out.println("2. Remove User");
                    System.out.println("3. Update User Password");
                    System.out.println("4. Logout");
                    System.out.println("5. Exit");
                    System.out.print("Choose an option: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    switch (choice) {
                        case 1:
                            addUser();
                            break;
                        case 2:
                            removeUser();
                            break;
                        case 3:
                            updatePassword();
                            break;
                        case 4:
                            logout();
                            break;
                        case 5:
                            System.out.println("Goodbye!");
                            return;
                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }
                } else {
                    System.out.println("1. Logout");
                    System.out.println("2. Exit");
                    System.out.println("Choose an option: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            logout();
                            break;
                        case 2:
                            System.out.println("Goodbye!!");
                            return;
                        default:
                            System.out.println("Invalid Option!!!");
                            break;
                    }
                }
            }
        }
    }

    private void login() {

        System.out.println("Enter Username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        User user = userData.getUser(username);

        if (user != null && user.checkPassword(password)) {
            currentUser = user;
            System.out.println("Login successful!");
            System.out.println("Welcome, " + user.getRole() + "!");
        } else {
            System.out.println("Invalid username or password!!");
        }
    }
    private void addUser() {
        System.out.print("Enter new username: ");
        String username = scanner.nextLine();
        System.out.print("Enter new password: ");
        String password = scanner.nextLine();
        System.out.print("Enter role (Admin/Teacher/Student): ");
        String role = scanner.nextLine();
        userData.addUser(username, password, role);
    }

    private void removeUser() {
        System.out.print("Enter username to remove: ");
        String username = scanner.nextLine();
        userData.removeUser(username);
    }

    private void updatePassword() {
        System.out.print("Enter username to update: ");
        String username = scanner.nextLine();
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();
        userData.updatePassword(username, newPassword);
    }

    private void logout(){
        System.out.println("Goodbye," + currentUser.getRole()+ "!");
        currentUser = null;
    }


}



