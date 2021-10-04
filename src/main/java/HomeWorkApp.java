//Pavel Kondratev hw3

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        multiplyArray();
        fillDiagonal();
        argsArray(12,5);
        maxMinArray();
        System.out.println(checkArrBalance());
    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void multiplyArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void fillDiagonal() {
        int arrSize = 4;
        int[][] arr = new int[arrSize][arrSize];
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                if (i == j || (i + j) == (arrSize - 1)) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static void argsArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void maxMinArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, -2, -4, 8, 9, 1};
        int arrMax = 0;
        int arrMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arrMax) {
                arrMax = arr[i];
            }
            if (arr[i] < arrMin) {
                arrMin = arr[i];
            }
        }
        System.out.println(arrMax + ", " + arrMin);
    }
    public static boolean checkArrBalance() {
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        int leftSum;
        int rightSum;
        for (int i = 0; i < arr.length - 1; i++) {
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j <= i; j++) {
                leftSum = leftSum + arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                rightSum = rightSum + arr[k];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }
}
