import java.util.Scanner;

public class L1B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Number: ");
        int n = sc.nextInt();
        int i=2, count=0;

        while(i<n/2){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(n+" is Prime Number");
        }
        else{
            System.out.println(n+" is not Prime Number");
        }
        sc.close();
    }
}
