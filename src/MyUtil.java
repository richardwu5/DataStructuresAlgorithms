public class MyUtil {
    MyUtil() {

    }

    public void myassert(boolean x) {
        if (!x) {
            throw new IllegalArgumentException("Assert fail") ;
        }
    }
}
