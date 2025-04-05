public class setIthBit {

    public static void main(String[] args) {
        printBits(32);
        int result = setTheIthBit(32, 2);
        printBits(result);
        // isBitSet(17, 1);
    }

    // print the bits of a number without conversion
    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    // i^th bit is set
    public static int setTheIthBit(int num, int bit) {
        return num | (1 << bit);
    }
}
