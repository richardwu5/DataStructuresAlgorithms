public class Sort {
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

}
