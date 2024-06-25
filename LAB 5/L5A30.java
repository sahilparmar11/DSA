import java.util.Arrays;
import java.util.Scanner;

public class L5A30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]a = new int[2][2];
        int [][]b = new int[2][2];
        int [][]c = new int[2][2];

        int i,j;
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                a[i][j] = sc.nextInt();
            }
        
        }
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                b[i][j] = sc.nextInt();
                c[i][j] = a[i][j]+b[i][j];
                
            }
        }
        for(i=0;i<2;i++){
               System.out.println(Arrays.toString(c[i]));
            }
        
        }


    }
