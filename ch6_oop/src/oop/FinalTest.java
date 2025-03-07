package oop;

// class Test extends FinalTest {
// }

public class FinalTest {
    final int MAX_SIZE = 10;

    final void getMaxSize() {
        // MAX_SIZE = 20;
        final int LV = MAX_SIZE;
        // LV = 20
    }

    class Test extends FinalTest {

    }
}
