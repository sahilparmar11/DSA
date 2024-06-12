import java.util.Scanner;

public class L1A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);
        if(ch == 'a'|| ch == 'e' || ch =='i' || ch =='o' || ch =='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("Not Vowel");
        }
        sc.close();
    }
}
