/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 4
   Question 2 (InterleaveArrays.java)
 */

public class InterleaveArrays {
    public static int[] interlaceArrays(int[] a1, int[] a2) {
        int a1_length = a1.length;
        int a2_length = a2.length;

        int totalLength = a1_length + a2_length;
        int[] result = new int[totalLength];

        int i = 0;
        int j = 0;
        int index = 0;

        while (i<a1_length || j<a2_length) {
            if (i<a1_length) {
                result[index++]=a1[i++];
            }
            if (j<a2_length) {
                result[index++]=a2[j++];
            }
        }
        return result;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] test1 = interlaceArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6});
        printArray(test1);

        int[] test2 = interlaceArrays(new int[]{10, 20, 30, 40, 50, 60, 70, 80}, new int[]{2, 4, 6, 8});
        printArray(test2);

        int[] test3 = interlaceArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6, 8, 10});
        printArray(test3);
    }
}

