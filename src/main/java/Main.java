import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
Scanner in = new Scanner(System.in);
System.out.println("Enter your name: ");
String newN = in.nextLine();
if (newN.equalsIgnoreCase("Alice") || newN.equalsIgnoreCase("Bob")) {
    System.out.println("Hello");
}
    }
}
