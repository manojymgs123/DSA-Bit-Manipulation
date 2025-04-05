public class noOfSetBit {
    public static void main(String[] args) {
        printBits(43);
        noOfSetBit(43);

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

    public static void noOfSetBit(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = unsetTheRightMostBit(num);
        }
        System.out.println(count);
    }

}
