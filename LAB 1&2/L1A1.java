import java.util.Scanner;

public class L1A1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area = Math.PI*radius*radius;
        System.out.println("Area Of Circle:"+area);
        sc.close();
    }
}