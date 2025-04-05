public class unsetTheRightMostBit {
    public static void main(String[] args) {
        printBits(43);
        int result = unsetTheRightMostBit(43);
        printBits(result);
    }

    // print the bits of a number without conversion
    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    public static int unsetTheRightMostBit(int num) {
        return num & num - 1;
    }
}
