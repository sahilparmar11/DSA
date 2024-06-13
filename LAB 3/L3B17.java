import java.util.Scanner;

public class L3B17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;


        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    break;
                }
            }
        }
        if(count<1){
            System.out.println("Does not contains duplicate element");
        }else{
            System.out.println("Contains duplicate elements");
        }
        sc.close();
    }
}
