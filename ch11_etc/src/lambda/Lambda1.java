package lambda;

public class Lambda1 {
    int max(int a, int b) {
        return a > b ? a : b;
    }

    // (a, b) -> a > b ? a : b;

    void print(String name, int i) {
        System.out.println(name + i);
    }

    // (name, i) -> System.out.println(name + i);

    int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // (int[] arr) -> {
    // int sum = 0;
    // for (int i : arr) {
    // sum += i;
    // }
    // return sum;
    // }
}
