public class toggleithBit {
    public static void main(String[] args) {
        printBits(45);
        int result = toggleBit(45, 1);
        printBits(result);
    }

    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print(((num >> i) & 1) + " ");
        }
        System.out.println();
    }

    public static int toggleBit(int num, int bit) {
        return num ^ (1 << bit);
    }
}
