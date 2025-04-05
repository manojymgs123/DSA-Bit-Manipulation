public class EVENodd {

    public static void main(String[] args) {
        printBits(18);
        printOddEven(17);
    }

    // print the bits of a number without conversion
    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    public static void printOddEven(int num) {
        if (isBitSet(num, 0)) {
            System.out.println("number is odd");
        } else {
            System.out.println("number is even");

        }
    }

    // i^th bit is set or not
    public static boolean isBitSet(int num, int bit) {
        int res = num & (1 << bit);
        return (res == 0) ? false : true;
    }
}
