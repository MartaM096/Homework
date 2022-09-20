import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Enter your surname");
        String surname = scanner.next();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if (age <18) {
            System.out.println(name + " " + surname + " you can't enter the club");
        } else {
            System.out.println(name + " " + surname + " you can enter the club");

        }
    }
}
