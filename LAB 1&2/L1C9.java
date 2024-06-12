import java.util.Scanner;

public class L1C9 {
    public static void main(String[] args) {
        System.out.println("Enter Seconds: ");
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();

        int hh = seconds/3600;
        int mm = (seconds-(hh*3600))/60;
        int ss = seconds-(hh*3600)-(mm*60);

        System.out.printf("hh:mm:ss=%d:%d:%d",hh,mm,ss);
        sc.close();

        // ss =t1.second-(hh*3600)-(mm*60);


    }
}
