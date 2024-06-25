import java.util.Scanner;

class L6A33{
    public static void swapTwoNumbers(int a, int b){
        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        swapTwoNumbers(a,b);
        sc.close();

    }
}