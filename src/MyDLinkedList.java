public class MyDLinkedList {
    private node sentinel;
    private int num;

    MyDLinkedList() {
        sentinel = new node(-1);
        num = 0;
    }

    private class node {
        int d;
        node prev;
        node next;

        node(int x) {
            d = x;
            prev = this;
            next = this;
        }
    }

    public void add(int x) {
        node n = new node(x);
        if (num == 0) {
            sentinel.next = n;
            sentinel.prev = n;
            n.next = sentinel;
            n.prev = sentinel;
        } else {
            n.next = sentinel;
            n.prev = sentinel.prev;
            sentinel.prev.next = n;
            sentinel.prev = n;
        }
        num++;
    }

    public void add(int index, int x) {
        if (index > num) {
            System.out.println("Index " + index + " is out of bounds. List only has " + num + " elements.");
            return;
        }
        node n = new node(x);
        if (index == 0) {
            n.next = sentinel.next;
            n.prev = sentinel;
            sentinel.next.prev = n;
            sentinel.next = n;
        } else {
            node current = sentinel.next;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            n.next = current;
            n.prev = current.prev;
            current.prev.next = n;
            current.prev = n;
        }
        num++;
        return;
    }

    public boolean remove(int x) {
        node n = sentinel.next;
        while (n != sentinel) {
            if (n.d == x) {
                if (n == sentinel.next) {
                    sentinel.next = n.next;
                    n.next.prev = sentinel;
                } else if (n == sentinel.prev) {
                    n.prev.next = sentinel;
                    sentinel.prev = n.prev;
                } else {
                    n.prev.next = n.next;
                    n.next.prev = n.prev;
                }
                num--;
                return true;
            }
            n = n.next;
        }
        return false;
    }

    public boolean contains(int x) {
        node n = sentinel.next;
        while (n != sentinel) {
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
        node current = sentinel.next;
        if (index == 0) {
            return sentinel.next.d;
        } else {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.d;
        }
    }

    public int size() {
        return num;
    }
}
