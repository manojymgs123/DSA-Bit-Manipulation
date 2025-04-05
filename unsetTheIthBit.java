public class unsetTheIthBit {
    public static void main(String[] args) {
        printBits(33);
        int result = unsetTheIthBit(33, 0);
        printBits(result);

    }

    // print the bits of a number without conversion
    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    // i^th bit is set
    public static int unsetTheIthBit(int num, int bit) {
        return num & ~(1 << bit);
    }
}
