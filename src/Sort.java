public class Sort {
    private static final MyUtil u = new MyUtil();

    public void selectionSort(int[] a) {
        int n = a.length;

        for (int i=0; i<n-1; i++) {
            int min_index = i;
            for (int j=i+1; j<n; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }
            int temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
        }
    }

    public void insertionSort(int[] a) {
        int n = a.length;

        for (int i=1; i<=n-1; i++) {
            int key = a[i];
            int j = i-1;
            while (j>=0 && a[j]>key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
}
