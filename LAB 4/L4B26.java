import java.util.Arrays;
import java.util.Scanner;

public class L4B26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array1 :");
        int m = sc.nextInt();
        System.out.println("Enter size of an array2 :");
        int n = sc.nextInt();
        int arr[] = new int[m+n];

        int arr2[] = new int[n];

        int i, j;
        for (i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (j = 0, i = m; j < n; j++) {
            arr[i] = arr2[j];
            i++;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        sc.close();


    }
}