import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Admin admin = new Admin("Admin", "superbusy_2024");
            Teacher teacher = new Teacher("Stefi Graff", "Iamthebest");
            Student student = new Student ("Maria Sharapova", "whythiskolaveriD");

            admin.addUser(teacher);
            admin.addUser(student);



    }
}