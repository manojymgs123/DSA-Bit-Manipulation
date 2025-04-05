public class printUniqueElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 8, 3, 3, 7, 5, 8, 1, 2 };
        printOnlyUniqueElement(arr);
    }

    public static void printOnlyUniqueElement(int arr[]) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}
