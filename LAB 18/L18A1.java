import java.util.Scanner;

public class L18A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {1,5,3,6};
        System.out.println("Enter number to serach: ");
        int k = sc.nextInt();

        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                System.out.println("Found At:"+i);
            }
        }
        System.out.println("Not Found");
        sc.close();
    }

}
