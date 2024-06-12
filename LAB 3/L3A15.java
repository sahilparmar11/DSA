import java.util.Scanner;

public class L3A15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of m: ");
        int m = sc.nextInt(); 
        int sum=0;

        for(int i=0;i<m;i++){
            sum+=i;
        }
        int avg = (sum)/m;
        System.out.println("Average: "+avg);
        sc.close();
    }
}
