import java.util.Scanner;

public class L1A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;

        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        System.out.println("Factorial :"+sum);
        sc.close();
    }
}
