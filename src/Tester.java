public class Tester {
    public static final MyUtil u = new MyUtil();

    Tester() {

    }

    private void ArrayListTest() {
        MyArrayList a = new MyArrayList();
        System.out.println("Array List Test");

        // Initiate array
        a.add(1);
        a.add(-1);
        a.add(500);
        a.add(1000);
        a.add(10);
        a.add(100);
        a.add(22);
        a.add(33);
        a.add(4);
        a.add(55);
        u.myassert(a.size() == 10);

        // Array should grow
        a.add(66);
        u.myassert(a.size() == 11);

        // Array should grow
        a.add(30, 77);
        u.myassert(a.size() == 31);

        // Test values
        u.myassert(a.get(0) == 1);
        u.myassert(a.get(1) == -1);
        u.myassert(a.get(2) == 500);
        u.myassert(a.get(3) == 1000);
        u.myassert(a.get(4) == 10);
        u.myassert(a.get(5) == 100);
        u.myassert(a.get(10) == 66);
        u.myassert(a.get(30) == 77);
        u.myassert(a.indexOf(500) == 2);
        u.myassert(a.indexOf(10) == 4);
        u.myassert(a.indexOf(77) == 30);
        u.myassert(a.indexOf(3) == -1);
        System.out.println("Array List Test PASSED");
    }

    private void SinglyLinkedListTest() {
        MySLinkedList l = new MySLinkedList();
        System.out.println("Singly Linked List Test");

        l.add(1);
        l.add(2);
        l.add(3);
        u.myassert(l.size()==3);
        u.myassert(l.get(0)==1);
        u.myassert(l.get(1)==2);
        u.myassert(l.get(2)==3);

        l.add(1, 4);
        l.add(4, 5);
        l.add(0, 6);
        u.myassert(l.get(0)==6);
        u.myassert(l.get(1)==1);
        u.myassert(l.get(2)==4);
        u.myassert(l.get(3)==2);
        u.myassert(l.get(4)==3);
        u.myassert(l.get(5)==5);

        l.reverse();
        u.myassert(l.get(0)==5);
        u.myassert(l.get(1)==3);
        u.myassert(l.get(2)==2);
        u.myassert(l.get(3)==4);
        u.myassert(l.get(4)==1);
        u.myassert(l.get(5)==6);

        u.myassert(l.contains(1)==true);
        u.myassert(l.contains(2)==true);
        u.myassert(l.contains(3)==true);
        u.myassert(l.contains(4)==true);
        u.myassert(l.contains(5)==true);
        u.myassert(l.contains(6)==true);
        u.myassert(l.contains(7)==false);

        l.remove(5);
        l.remove(6);
        u.myassert(l.size()==4);

        System.out.println("Singly Linked List Test PASSED");
    }

    private void DoublyLinkedListTest() {
        MyDLinkedList l = new MyDLinkedList();
        System.out.println("Doubly Linked List Test");

        l.add(1);
        l.add(2);
        l.add(3);
        u.myassert(l.size()==3);
        u.myassert(l.get(0)==1);
        u.myassert(l.get(1)==2);
        u.myassert(l.get(2)==3);

        l.add(1, 4);
        l.add(4, 5);
        l.add(0, 6);
        u.myassert(l.get(0)==6);
        u.myassert(l.get(1)==1);
        u.myassert(l.get(2)==4);
        u.myassert(l.get(3)==2);
        u.myassert(l.get(4)==3);
        u.myassert(l.get(5)==5);

        u.myassert(l.contains(1)==true);
        u.myassert(l.contains(2)==true);
        u.myassert(l.contains(3)==true);
        u.myassert(l.contains(4)==true);
        u.myassert(l.contains(5)==true);
        u.myassert(l.contains(6)==true);
        u.myassert(l.contains(7)==false);

        l.remove(5);
        l.remove(6);
        u.myassert(l.size()==4);

        System.out.println("Doubly Linked List Test PASSED");

    }

    private void StackTest() {
        MyStack s = new MyStack();
        System.out.println("Stack Test");

        for (int i=0; i<8; i++) {
            s.push(i);
        }
        u.myassert(s.peek()==7);
        u.myassert(s.size()==8);
        u.myassert(s.pop()==7);
        u.myassert(s.pop()==6);
        u.myassert(s.pop()==5);
        u.myassert(s.peek()==4);
        u.myassert(s.size()==5);
        s.push(-80);
        s.push(-90);
        u.myassert(s.pop()==-90);
        u.myassert(s.peek()==-80);

        System.out.println("Stack Test PASSED");
    }

    private void QueueTest() {
        MyQueue q = new MyQueue();
        System.out.println("Queue Test");

        for (int i=0; i<5; i++) {
            q.enQueue(i);
        }
        u.myassert(q.peek()==0);
        q.deQueue();
        q.deQueue();
        u.myassert(q.peek()==2);
        q.enQueue(10);
        q.enQueue(11);
        q.deQueue();
        q.deQueue();
        u.myassert(q.deQueue()==4);
        u.myassert(q.deQueue()==10);

        System.out.println("Queue Test PASSED");
    }

    private void SelectionSortTest() {
        System.out.println("Selection Sort Test");

        Sort s = new Sort();
        int[] a = {15, 5, 64, 8, 12, 11, 4, 35};
        s.selectionSort(a);
        u.myassert(a[0]==4);
        u.myassert(a[1]==5);
        u.myassert(a[2]==8);
        u.myassert(a[3]==11);
        u.myassert(a[4]==12);
        u.myassert(a[5]==15);
        u.myassert(a[6]==35);
        u.myassert(a[7]==64);

        int[] b = {6, 5, 4, 3, 2, 1};
        s.selectionSort(b);
        u.myassert(b[0]==1);
        u.myassert(b[1]==2);
        u.myassert(b[2]==3);
        u.myassert(b[3]==4);
        u.myassert(b[4]==5);
        u.myassert(b[5]==6);

        int[] c = {1, 2, 3, 4, 5, 6};
        s.selectionSort(c);
        u.myassert(c[0]==1);
        u.myassert(c[1]==2);
        u.myassert(c[2]==3);
        u.myassert(c[3]==4);
        u.myassert(c[4]==5);
        u.myassert(c[5]==6);

        int[] d = {1, 1, 1, 1, 1, 1};
        s.selectionSort(d);
        u.myassert(d[0]==1);
        u.myassert(d[1]==1);
        u.myassert(d[2]==1);
        u.myassert(d[3]==1);
        u.myassert(d[4]==1);
        u.myassert(d[5]==1);

        System.out.println("Selection Sort Test PASSED");
    }

    private void InsertionSortTest() {
        System.out.println("Insertion Sort Test");

        Sort s = new Sort();
        int[] a = {15, 5, 64, 8, 12, 11, 4, 35};
        s.insertionSort(a);
        u.myassert(a[0]==4);
        u.myassert(a[1]==5);
        u.myassert(a[2]==8);
        u.myassert(a[3]==11);
        u.myassert(a[4]==12);
        u.myassert(a[5]==15);
        u.myassert(a[6]==35);
        u.myassert(a[7]==64);

        int[] b = {6, 5, 4, 3, 2, 1};
        s.insertionSort(b);
        u.myassert(b[0]==1);
        u.myassert(b[1]==2);
        u.myassert(b[2]==3);
        u.myassert(b[3]==4);
        u.myassert(b[4]==5);
        u.myassert(b[5]==6);

        int[] c = {1, 2, 3, 4, 5, 6};
        s.insertionSort(c);
        u.myassert(c[0]==1);
        u.myassert(c[1]==2);
        u.myassert(c[2]==3);
        u.myassert(c[3]==4);
        u.myassert(c[4]==5);
        u.myassert(c[5]==6);

        int[] d = {1, 1, 1, 1, 1, 1};
        s.insertionSort(d);
        u.myassert(d[0]==1);
        u.myassert(d[1]==1);
        u.myassert(d[2]==1);
        u.myassert(d[3]==1);
        u.myassert(d[4]==1);
        u.myassert(d[5]==1);

        System.out.println("Insertion Sort Test PASSED");
    }

    private void testBench() {
        ArrayListTest();
        SinglyLinkedListTest();
        DoublyLinkedListTest();
        StackTest();
        QueueTest();

        SelectionSortTest();
        InsertionSortTest();
    }

    public static void main(String[] args) {
        System.out.println("Tester STARTS");
        Tester t = new Tester() ;
        t.testBench() ;
        System.out.println("Tester ENDS");
    }

}
