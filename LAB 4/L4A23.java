import java.util.Arrays;
import java.util.Scanner;

public class L4A23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array :");
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Enter digit to insert: ");
        int digit = sc.nextInt();
        int arr2[] = new int[n+1];
        int i=0;
        while(i<n && arr[i]<=digit){
            arr2[i] = arr[i];
            i++;
        }
        arr2[i] = digit;
        while(i<n){
            arr2[i+1] = arr[i];
            i++;
        }
        for(int j=0;j<arr2.length;j++){
            System.out.println(arr2[j]);
        }
        sc.close();
    }
}
