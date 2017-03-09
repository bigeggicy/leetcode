/**
 * Created by bigegg on 2017/3/3 0003.
 */
public class quicksort {
    //快速排序
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void QuickSort(int[] a, int left, int right) {
        if (left < right) {
            int p = partition(a, left, right);
            QuickSort(a, left, p - 1);
            QuickSort(a, p + 1, right);
        }
    }

    //快速排序数组划分
    private static int partition(int[] a, int left, int right) {
        int x = a[right];
        int p = left - 1;
        for (int i = left; i < right; i++) {
            if (a[i] <= x) {
                p++;
                swap(a, p, i);
            }
        }
        swap(a, p+1, right);
        return p+1;
    }

}
