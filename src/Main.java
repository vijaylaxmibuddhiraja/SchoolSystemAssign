import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Admin admin = new Admin("Amitabh Bacchan", "superbusy_2024");
            Teacher teacher = new Teacher("Stefi Graff", "Iamthebest");
            Student student = new Student ("Maria Sharapova", "whythiskolaveriD");
            
            ArrayList<User>users = new ArrayList<>();
            users.add(admin);
            users.add(teacher);
            users.add(student);

            while(true) {
                System.out.println("Enter Username (or 'exit' to quit): ");
                String username = scanner.nextLine();

                if (username.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println("Enter the password: ");
                String password = scanner.nextLine();

                User loggedInUser = null;

                for (User user : users) {
                    if (user.getUsername().equals(username) && user.checkPassword(password)) {
                        loggedInUser = user;
                        break;
                    }
                }

                if (loggedInUser != null) {
                    System.out.println("Login as" + loggedInUser.getClass().getSimpleName());
                    loggedInUser.showMenu();
                    loggedInUser.viewInformation();
                    System.out.println("Logout now!");
                } else {
                    System.out.println("Invalid Options..Please try again!");
                }
            }

        System.out.println("Program ends");
            scanner.close();
        }
    }






