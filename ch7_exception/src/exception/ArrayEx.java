package exception;

public class ArrayEx {
    public static void main(String[] args) {
        int arr[] = new int[2];

        // ArrayIndexOutOfBoundsException : Index 3 out of bounds for length 2
        // try {

        // System.out.println(arr[0]); // ArrayIndexOutOfBoundsException
        // int num = 100 / 0; // ArithmethicException

        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("배열 인덱스를 확인해 주세요");
        // } catch (ArithmeticException e) {
        // System.out.println("0으로 나눌 수 없습니다.");
        // }

        try {

            System.out.println(arr[0]); // ArrayIndexOutOfBoundsException
            int num = 100 / 0; // ArithmethicException

        } catch (Exception e) {
            System.out.println("오류 발생");
        }

        try {

            System.out.println(arr[0]); // ArrayIndexOutOfBoundsException
            int num = 100 / 0; // ArithmethicException

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("오류 발생");
        }
    }
}
