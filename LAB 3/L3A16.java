import java.util.Scanner;;

class L3A16{
    public static void main(String[] args) {

        System.out.println("Enter Size: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter First eleemnt od array :");
        arr[0] = sc.nextInt();
        int minDigit = arr[0];
        int maxDigit = arr[0];
        int min=0, max=0;

        for(int i=1;i<n;i++){
            arr[i]= sc.nextInt();
            if(arr[i]<minDigit){
                minDigit = arr[i];
                min=i;
            }
            if(arr[i]>maxDigit){
                maxDigit = arr[i];
                max=i;
            }
        }
        System.out.println("Min:"+min);
        System.out.println("Max:"+max);

        sc.close();



    }
}
