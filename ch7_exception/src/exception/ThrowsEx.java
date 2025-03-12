package exception;

public class ThrowsEx {
    public static void main(String[] args) throws ClassNotFoundException {

        print();
    }

    static void print() throws ClassNotFoundException {
        Class.forName("");
    }
}
