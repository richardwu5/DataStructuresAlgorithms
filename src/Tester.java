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

    private void testBench() {
        ArrayListTest();
    }

    public static void main(String[] args) {
        System.out.println("Tester STARTS");
        Tester t = new Tester() ;
        t.testBench() ;
        System.out.println("Tester ENDS");
    }
}
