import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    static int[] arr = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while ((j >= 1) && (arr[j] < arr[j-1])) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
