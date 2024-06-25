import java.util.Scanner;

public class L4C27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        System.out.println("Enter l to convert in lowercase or u to covert in uppercase: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch == 'l') {
            System.out.println(str.toLowerCase());
        } else if (ch == 'u') {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
