public class L19B2 {
    public static void main(String[] args) {
        int nums[] = {1,5,3,6};

        for(int i=1;i<nums.length;i++){
            int j = i - 1;
            int element = nums[i];

            while(j>=0 && nums[j]>element){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1]=element;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
