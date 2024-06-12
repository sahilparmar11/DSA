import java.util.Scanner;

public class L1C11{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n = sc.nextInt();

        int currentSum = 0;
        int totalSum = 0;

        for(int i=0;i<n;i++){
            currentSum+=i;
            totalSum+=currentSum;
        }

        System.out.println("Sum of given series: "+totalSum);
        sc.close();
    }
}