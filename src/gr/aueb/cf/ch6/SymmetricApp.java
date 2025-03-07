package gr.aueb.cf.ch6;

public class SymmetricApp {
    public static void main(String[] args) {

    }

    public static boolean isSymmetric(int[] arr) {
        boolean isSymetric = true;
        for (int i =0, j = arr.length-1; i < j; i++, j--) {
            if(arr[i] != arr[j]) {
                isSymetric = false;
                break;
            }
        }
        return isSymetric;
    }

    public static boolean isArraySymmetric(int[] arr) {

        boolean isSymmetric = true;
        int n = arr.length-1;

        for (int i=0; i < n/2; i++) {
            if (arr[i] != arr[n - 1]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }
}
