public class SelectionSortExample {
public class SelectionSortExample {
    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in remaining unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // Print array after each pass
            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
        }
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArray(array);

        System.out.println("\nSorting process:");
        selectionSort(array);

        System.out.println("\nSorted array:");
        printArray(array);
    }
}



// Original array:
// 64 25 12 22 11 

// Sorting process:
// Pass 1: 11 25 12 22 64 
// Pass 2: 11 12 25 22 64 
// Pass 3: 11 12 22 25 64 
// Pass 4: 11 12 22 25 64 

// Sorted array:
// 11 12 22 25 64 


