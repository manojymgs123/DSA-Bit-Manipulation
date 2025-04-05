public class isPowerOfTwo {
    public static void main(String[] args) {
        printBits(32);
        isPowerOfTwo(32);
    }

    public static void printBits(int num) {
        for (int index = 7; index >= 0; index--) {
            System.out.print(num >> index & 1);
        }
        System.out.println();
    }

    public static void isPowerOfTwo(int num) {
        if ((num & (num - 1)) == 0) {
            System.out.println("Number is power of two");
        } else {
            System.out.println("Number is not power of two");
        }
    }
}
