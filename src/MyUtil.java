public class MyUtil {
    MyUtil() {

    }

    public void myassert(boolean x) {
        if (!x) {
            throw new IllegalArgumentException("Assert fail") ;
        }
    }

    public void printArray(int[] a) {
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
