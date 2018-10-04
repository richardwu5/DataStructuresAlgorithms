public class MySLinkedList {
    private node first;
    private node last;
    private int num;

    MySLinkedList() {
        first = null;
        last = null;
        num = 0;
    }

    private class node {
        int d;
        node next;

        node(int x) {
            d = x;
            next = null;
        }
    }

    public void add(int x) {
        node n = new node(x);
        if (first != null) {
            last.next = n;
        } else {
            first = n;
        }
        last = n;
        num++;
    }

    public void add(int index, int x) {
        if (index > num) {
            System.out.println("Index " + index + " is out of bounds. List only has " + num + " elements.");
            return;
        }
        node n = new node(x);
        if (index == 0) {
            n.next = first;
            first = n;
        } else {
            node current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            n.next = current.next;
            current.next = n;
        }
        num++;
    }

    public boolean remove(int x) {
        node current = first;
        node previous = null;
        for (int i=0; i<num; i++) {
            if (current.d == x) {
                if (current == first) {
                    first = current.next;
                } else if (current == last) {
                    previous.next = null;
                    last = previous;
                } else {
                    previous.next = current.next;
                }
                current.next = null;
                num--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        System.out.println(x + " not found.");
        return false;
    }

    public boolean contains(int x) {
        node n = first;
        for (int i=0; i<num; i++) {
            if (n.d == x) {
                return true;
            }
            n = n.next;
        }
        return false;
    }

    public int get(int index) {
        if (index > num-1) {
            System.out.println("Index " + index + " is out of bounds. List only has " + num + " elements.");
            return 0;
        }

        node n = first;
        for (int i=0; i<index; i++) {
            n = n.next;
        }
        return n.d;
    }

    public int size() {
        return num;
    }

}
