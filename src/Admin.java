import java.util.ArrayList;
import java.util.Scanner;

class Admin extends User {
    private ArrayList<User> users;

    public Admin(String username, String password) {
        super(username, password);
        this.users = new ArrayList<>();
    }


    @Override
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Show Menu");
            System.out.println("1. Add new user");
            System.out.println("2. Remove user");
            System.out.println("3. Change user password");
            System.out.println("4. Divide user groups");
            System.out.println("5.Logout");


            System.out.println("Select an option");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewUser(scanner);
                    break;
                case 2:
                    removeUser(scanner);
                    break;
                case 3:
                    changeUserPassword(scanner);
                    break;
                case 4:
                    divideUserGroups();
                    break;
                case 5:
                    System.out.println("Logging out!!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void addNewUser(Scanner scanner) {
        System.out.println("Add new user:");
        String username = scanner.nextLine();
        System.out.println("Add new password");
        String password = scanner.nextLine();
        System.out.println("Add usertype(1-Admin, 2-Teacher, 3-Student): ");
        int userType = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();

        User newUser;
        switch (userType) {
            case 1:
                newUser = new Admin(username, password);
                break;
            case 2:
                newUser = new Teacher(username, password);
                break;
            case 3:
                newUser = new Student(username, password);
                break;
            default:
                System.out.println("Invalid selection");
                return;
        }

        users.add(newUser);
        System.out.println("New user added: " + newUser.getUsername());
    }

    public void removeUser(Scanner scanner) {
        System.out.println("Enter username to remove: ");
        String username = scanner.nextLine();

        users.removeIf(user -> user.getUsername().equals(username));
        System.out.println("User removed: " + username);
    }

    public void changeUserPassword(Scanner scanner) {
        System.out.println("Enter the username: ");
        String username = scanner.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("Enter new password: ");
                String newPassword = scanner.nextLine();
                user.setPassword(newPassword);
                System.out.println("Password changed for: " + username);
                return;
            }
        }

        System.out.println("User not found");
    }

    public void divideUserGroups() {
        System.out.println("Divide Users into groups");

    }

    @Override
    public void viewInformation(){
        System.out.println("Admin Info: ");
        System.out.println("Username: " + this.getUsername());
        System.out.println("Total Users:" + users.size());
        System.out.println("list of Users: ");
        for(User user:users){
            System.out.println("-" + user.getUsername()+ " ( " + user.getRole() + ")");
        }
    }

    @Override
    public String getRole() {
        return "Admin";
    }
}





















