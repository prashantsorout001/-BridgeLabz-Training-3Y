import java.util.*;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int l = sc.nextInt();
        System.out.println("Now enter elements: ");
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < l; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements is: " + sum);

        int arr1[] = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        for (int m : arr1) {
            System.out.println(m);

        }
        int arr2[] = new int[arr.length + arr1.length];
        int index = 0;
        for (int j : arr) {

            arr2[index] = j;
            index++;

        }
        for (int k : arr1) {
            arr2[index] = k;
            index++;
        }
        System.out.println(Arrays.toString(arr2));
        // 2D Array and sum of diagonal elements
        System.out.println("\nEnter size for 2D square array (n x n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter elements for 2D array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];
        }
        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }

}
