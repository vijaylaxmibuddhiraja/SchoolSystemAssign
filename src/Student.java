import java.util.Scanner;

class Student extends User {
    public Student(String username, String password) {
        super(username, password);
    }

    @Override
    public String getRole(){
        return "Student";
    }
}
    /*@Override
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Student Menu:");
            System.out.println("1. View info");
            System.out.println("2. Take exam");
            System.out.println("3. Take quiz");
            System.out.println("4. Logout");

            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewInformation();
                    break;
                case 2:
                    takeExam();
                    break;
                case 3:
                    takeQuiz();
                    break;
                case 4:
                    giveRating(scanner);
                    break;
                case 5:
                    System.out.println("Logging out!!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    @Override
    public void viewInformation() {
        System.out.println("Student Information:");
        System.out.println("Username: " + this.getUsername());
        System.out.println("Role: " + getRole());
    }


    @Override
    public String getRole() {
        return "Student";
    }


    public void takeExam() {
        System.out.println("Give exam");
    }

    public void takeQuiz() {
        System.out.println("Give quiz");
    }

    public void giveRating(Scanner rating) {
        System.out.println("Your rating: " + rating);
    }
}*/













