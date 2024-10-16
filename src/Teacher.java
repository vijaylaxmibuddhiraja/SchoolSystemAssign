import java.util.ArrayList;
import java.util.Scanner;

class Teacher extends User {
    private ArrayList<User> users;

    public Teacher(String username, String password) {
        super(username, password);
        this.users = new ArrayList<>();
    }

    @Override
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Show Menu");
            System.out.println("1. View Information");
            System.out.println("2. Create exam");
            System.out.println("3. Create quiz");
            System.out.println("4. Give rating");
            System.out.println("5.Logout");


            System.out.println("Select an option");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewInformation();
                    break;
                case 2:
                    createExam();
                    break;
                case 3:
                    createQuiz();
                    break;
                case 4:
                    giveRating(scanner, users);
                    break;
                case 5:
                    System.out.println("Logging out!!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void viewInformation(){
        System.out.println("View Info");
    }

    private void createExam(){
        System.out.println("Create an exam");
    }

    private void createQuiz(){
        System.out.println("Create a quiz");
    }

    private void giveRating(Scanner scanner, ArrayList<User> users) {
        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        for(User user: this.users) {
            if(user.getUsername().equals(username)) {
                System.out.println("Give rating to " + username + " : ");
                 int rating = scanner.nextInt();
                 scanner.nextLine();
            }
        }

        System.out.println("User not found");

    }

    @Override
    public String getRole() {
        return "Teacher";
    }
}

