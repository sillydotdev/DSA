public class MergeSortStrings {

    public static String[] mergeSort(String Arr[], int si, int ei) {
        if (si == ei) {
            String[] A = {Arr[si]};
            return A;
        }

        int mid = si + (ei - si) / 2;
        String[] arr1 = mergeSort(Arr, si, mid);
        String[] arr2 = mergeSort(Arr, mid + 1, ei);

        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String arr3[] = new String[m + n];
        int i = 0, j = 0;
        int idx = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                arr3[idx] = arr1[i];
                i++;
            } else {
                arr3[idx] = arr2[j];
                j++;
            }
            idx++;
        }
        while (i < m) {
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }
        while (j < n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }

    public static boolean isAlphabeticallySmaller(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String[] Arr = { "sun", "earth", "mars", "mercury" };
        String[] a = mergeSort(Arr, 0, Arr.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}
