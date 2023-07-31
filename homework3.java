public class homework3 {
    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        int result = findK(arr1,arr2,k);
        System.out.println(result);
    }
    public static int findK(int[] arr1, int[] arr2, int k) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        return findK(arr1, 0, len1 - 1, arr2, 0, len2 - 1, k);
    }

    public static int findK(int[] arr1, int start1, int end1, int[] arr2, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        if (len1 == 0) return arr2[start2 + k - 1];
        if (len2 == 0) return arr1[start1 + k - 1];
        if (k == 1) return Math.min(arr1[start1], arr2[start2]);

        int i = start1 + Math.min(len1, k / 2) - 1;
        int j = start2 + Math.min(len2, k / 2) - 1;

        if (arr1[i] > arr2[j]) {
            return findK(arr1, start1, end1, arr2, j + 1, end2, k - (j - start2 + 1));
        } else {
            return findK(arr1, i + 1, end1, arr2, start2, end2, k - (i - start1 + 1));
        }
    }

}
