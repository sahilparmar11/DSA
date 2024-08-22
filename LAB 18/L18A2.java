import java.util.*;

public class L18A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {1,3,5,6};
        System.out.println("Enter number to serach: ");
        int k = sc.nextInt();

        int left=0;
        int right=0;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==k){
                System.out.println("Found At:"+mid);
            }
            else if(nums[mid]<k){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
       
        System.out.println("Not Found");
        sc.close();
    }

}


