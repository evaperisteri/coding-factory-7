package gr.aueb.cf.ch8;

public class IndexOutOfBoundsException {

    public static void main(String[] args) {
        int[] arr = new int[10];

        //λαθος του κωδικα που πρεπει να το βρουε και να το διορθώσουμε
        //εδω να σβησουμε το ισον στο λενγκθ
        for(int i = 0; i<= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
