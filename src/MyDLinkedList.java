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
}
