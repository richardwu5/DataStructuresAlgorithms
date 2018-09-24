public class Tester {
    Tester() {

    }

    private void ArrayListTest() {
        MyArrayList a = new MyArrayList();
        System.out.println("Array List Test");
        // Initiate data
        // Call some functions
        // Verify
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
