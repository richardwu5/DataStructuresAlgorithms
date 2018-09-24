public class MyArrayList {
    public static final MyUtil u = new MyUtil();
    private int capacity;
    private int[] array;
    private int length;

    MyArrayList() {
        allocate(10);
        length = 0;
    }

    public int size() {
        return length;
    }

    public void add(int index, int element) {
        if (index<0) {
            u.myassert(false);
        }
        if (index>=capacity) {
            expand(index);
        }
        if (index>=length) {
            length = index+1;
        }
        array[index] = element;
    }

    public void add(int element) {
        if (length>=capacity) {
            expand(-1);
        }
        array[length] = element;
        length++;
    }

    public int get(int index) {
        if (index > length-1) {
            System.out.println("The index you provided is out of bounds.");
            return 0;
        }
        return array[index];
    }

    public int indexOf(int element) {
        for (int i=0; i<length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    private void expand(int index) {
        int[] temp = array;
        int size = capacity;
        int newSize = capacity;

        if (index == -1) {
            newSize = 2 * capacity;
        } else {
            do {
                newSize = 2 * newSize;
            } while (newSize < index);
        }

        allocate(newSize);

        for (int i=0; i<size; i++) {
            array[i] = temp[i];
        }
        temp = null;
    }

    private void allocate(int s) {
        capacity = s;
        array = new int[s];
    }
}
