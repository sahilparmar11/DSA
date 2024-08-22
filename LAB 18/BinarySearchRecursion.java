import java.util.Scanner;

public class BinarySearchRecursion {
    public static int binarySearch(int arr[],int left,int right,int key){
        
        if(left<=right){
            int mid = (left+right)/2;
            
            if(arr[mid]==key){
                System.out.println("Found At: "+mid);
                return mid;
            }
            
            else if(arr[mid]>key){
                return binarySearch(arr,left, mid-1, key);
            }
            else{
                return binarySearch(arr,mid+1, right, key);
            }
        }
        System.out.println("Not Found...");
        return -1;
        
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};
        System.out.println("Enter key to search: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        binarySearch(arr,0,arr.length-1,key);

        sc.close();
    }

}
