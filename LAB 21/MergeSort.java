public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }
        
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);
        
        mergeSort(left);
        mergeSort(right);
        
        merge(array, left, right);
    }
    
    private static void merge(int[] array, int[] left, int[] right) {
        int leftIndex = 0, rightIndex = 0, arrayIndex = 0;
        
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                array[arrayIndex++] = left[leftIndex++];
            } else {
                array[arrayIndex++] = right[rightIndex++];
            }
        }
        
        while (leftIndex < left.length) {
            array[arrayIndex++] = left[leftIndex++];
        }   
        
        while (rightIndex < right.length) {
            array[arrayIndex++] = right[rightIndex++];
        }
    }
    
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] array = {4, 1, 13, 5, 6, 7};

        System.out.println("Old Array: ");
        printArray(array);
        
        mergeSort(array);
        
        System.out.println("\nSorted array:");
        printArray(array);
    }
}
