import java.util.Arrays;

public class L4A21 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int numberToInsert = 6;
        int indexToInsertAt = 3; // Inserting at the fourth position (index starts from 0)
        
        int[] newArray = new int[originalArray.length + 1];
        
        for(int i = newArray.length - 1; i >= 0; i--) {
            if(i > indexToInsertAt) {
                newArray[i] = originalArray[i - 1];
            } else if(i == indexToInsertAt) {
                newArray[i] = numberToInsert;
            } else {
                newArray[i] = originalArray[i];
            }
        }
        
        System.out.println(Arrays.toString(newArray));
    }
}
