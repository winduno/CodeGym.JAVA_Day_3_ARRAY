public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {7, 8, 9};
        int length1 = array1.length, length2 = array2.length;
        int length3 = length1 + length2;
        int[] array3 = new int[length3];

        for (int i = 0; i < length1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < length2; i++) {
            array3[i + length1] = array2[i];
        }

        for (int i = 0; i < length3; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
