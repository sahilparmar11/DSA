import java.util.Scanner;

public class L1B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int i=1;
        System.out.print("Factors: ");

        while(i<=n){
            if(n%i==0){
                System.out.print(i+",");
            }
            i++;
        }
        sc.close();

    }
}
