/**
 * Project
 */

public class Project {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 21, 1, 58, 87, 89, 9000, 2, 1 };

        //System.out.println(arr); This gives us a destination value in memory

        for(int value : arr) {
            System.out.print(" " + value);
        }


        SelectionSort(arr);
        //BubbleSort(arr);
        System.out.println();
        for(int value : arr) {
            System.out.print(" " + value);
        }
    }

    public static void BubbleSort(int[] arr) {

        int temp;

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                //swapping
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void SelectionSort(int[] arr) {
        int minIndex, temp;

        for(int i = 0; i < arr.length; i++) {
            minIndex = i;

            for(int j = i; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }


    }
}
