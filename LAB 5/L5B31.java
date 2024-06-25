import java.util.Arrays;
import java.util.Scanner;

public class L5B31 {
    public static void main(String[] args) {
        System.out.println("Enter Size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s[] = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next().trim();
        }

        int m = (int) Math.floor(Math.random() * n);
        System.out.println("Your word is " + s[m] + ": ");
        String str = sc.next();

        char ch[] = str.toLowerCase().toCharArray();
        char ch1[] = s[m].toLowerCase().toCharArray();

        if (ch.length == ch1.length) {
            boolean isAnagram = false;
            Arrays.sort(ch);
            Arrays.sort(ch1);
            for (int i = 0; i < ch1.length; i++) {
                if (ch[i] != ch1[i]) {
                    System.out.println("Not An anagram..");
                    isAnagram = true;
                    break;
                }

            }
            if (!isAnagram) {
                System.out.println("Word is anagram..");
            }
        } else {
            System.out.println("Your word is not an anagram..");
        }
        sc.close();

    }
}
