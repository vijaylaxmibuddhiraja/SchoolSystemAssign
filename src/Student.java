class Student extends User {
    public Student(String username, String password) {
        super(username, password);
    }

    @Override
    public void showMenu() {
        System.out.println("Student Menu:");
        System.out.println("1. View information");
        System.out.println("2. Take exam");
        System.out.println("3. Take quiz");
        System.out.println("4. Logout");
    }

    public void takeExam() {
        System.out.println("Give exam");
    }

    public void takeQuiz() {
        System.out.println("Give quiz");
    }

    public void giveRating(int rating) {
        System.out.println("Your rating: " + rating);
    }

    @Override
    public void viewInformation() {
        System.out.println("Student Information:");
        System.out.println("Username: " + this.getUsername());


        System.out.println("Role: " + getRole());
        System.out.println("Enrolled Courses: Math, Science, English");  // Example courses
        System.out.println("Grade: A");
    }


    @Override
    public String getRole() {
        return "Student";
    }
}







