public class charactorConversion {
    public static void main(String[] args) {
        printBits(53);
        char ch1 = charactorConversionToLowercase('A');
        System.out.println(ch1);
        char ch2 = charactorConversionToUppercase('a');
        System.out.println(ch2);
    }

    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    public static char charactorConversionToUppercase(int num) {
        return (char) (num & ~(1 << 5));
    }

    public static char charactorConversionToLowercase(int num) {
        return (char) (num | (1 << 5));
    }
}
