public class Admin extends User{
    public Admin(String username, String password){
        super(username, password);
    }

    @override
     public void showMenu(){
        System.out.println("1. Add new user");
        System.out.println("2. Change password");
        System.out.println("3. Remove user");
        System.out.println("4.Logout");
    }

    @Override actionHandling(int choice, SchoolSystem system){
        switch (choice) {
            case 1:
                system.addNewUser(); // Admin-specific functionality
                break;
            case 2:
                system.changePassword(this); // Admin-specific functionality
                break;
            case 3:
                system.removeUser(); // Admin-specific functionality
                break;
            case 4:
                System.out.println("Logging out...");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}



