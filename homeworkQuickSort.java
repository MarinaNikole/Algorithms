package treino;

import java.util.Arrays;

public class homeworkQuickSort {
    public static void main(String[] args) {
        int [] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] sortedArr = quickSort(arr);
        System.out.println(Arrays.toString(sortedArr));

    }


    public static int[] quickSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int baseElement = arr[arr.length - 1];
        int index = 0;
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < baseElement) {
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

            temp = arr[arr.length - 1];
            arr[arr.length - 1] = arr[index];
            arr[index] = temp;


            int[] leftPart = quickSort(Arrays.copyOfRange(arr, 0, index));
            int[] rightPart = quickSort(Arrays.copyOfRange(arr, index + 1, arr.length));

            int[] result = new int[arr.length];
            System.arraycopy(leftPart, 0, result, 0, leftPart.length);
            result[index] = baseElement;
            System.arraycopy(rightPart, 0, result, index + 1, rightPart.length);

            return result;

        }


    }





