import java.util.Scanner;

public class L1B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Power: ");
        int b = sc.nextInt();
        int ans = 1;
        
        for(int i=0;i<b;i++){
            ans=ans*a;
        }
        System.out.println(ans);
        sc.close();
    }
}
