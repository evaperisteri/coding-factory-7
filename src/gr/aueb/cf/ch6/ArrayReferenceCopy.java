package gr.aueb.cf.ch6;

/**
 * copies the reference of the array.
 * it is a shallow copy
 * there are side effects
 */
public class ArrayReferenceCopy {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arrRefCopy = arr; //shallow copy ( αντιγραψαμε μονο την αναφορα τυ στακ, οχι το χιπ

        for(int el : arrRefCopy){
            System.out.print(el + " ");
        }
        arrRefCopy[4] =100;
        System.out.println();

        for (int el : arr) {
            System.out.println(el + " ");
        }
    }
}
