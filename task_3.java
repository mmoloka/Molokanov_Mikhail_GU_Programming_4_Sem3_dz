// Реализовать алгоритм сортировки слиянием.
public class task_3 {
    public static void main(String[] args) {
        int[] input = {6, 14, -7, 0, 22, 13, 7, 8, 35};
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
        mergeSort(input, input.length);
        for (int j : input) {
            System.out.print(j + " ");
        }
    }
    static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
    
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
    
        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
  int[] a, int[] l, int[] r, int left, int right) {
 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}
}
