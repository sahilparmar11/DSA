import java.util.Scanner;

public class L3A14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of m: ");
        int m = sc.nextInt();

        System.out.println("Enter Value of n: ");
        int n = sc.nextInt();
        
        int sum=0;

        for(int i=m;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of m to n is "+sum);
        sc.close();

    }
}
