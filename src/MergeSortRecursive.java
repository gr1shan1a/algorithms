import java.util.Arrays;

public class MergeSortRecursive {
        // a и b - массивы, получаем массив c
        static int[] merge(int[] a, int[] b) {
            int n = a.length;
            int m = b.length;
            int[] c = new int[n+m];
            int i = 0;
            int j = 0;
            int k = 0;

            while ((i < n) || (j < m)) {
                if ((j == m) || ((i < n) && (a[i] < b[j]))) {
                    c[k++] = a[i++];
                } else {
                    c[k++] = b[j++];
                }
            }
            return c;
        }
    static int[] sort(int[] a) {
        int n = a.length;

        if (n <= 1) {
            return a;
        }

        int[] al = Arrays.copyOfRange(a, 0, (n/2 - 1));
        int[] ar = Arrays.copyOfRange(a, n/2, (n - 1));

        al = sort(al);
        ar = sort(ar);
        return merge(al, ar);
    }

        public static void main(String[] args) {
            int[] a = {1,3,4,5,6,6};
            int[] b = {1,2,4,5,5,7,8,10};
            System.out.println(Arrays.toString(merge(a, b)));


    }
}
