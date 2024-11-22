import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextString();
        System.out.println("Your age is " + age);
    }
}