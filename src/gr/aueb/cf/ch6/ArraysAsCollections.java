package gr.aueb.cf.ch6;

public class ArraysAsCollections {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 9, 21, 31, 41};
    }

    //Filtering
    public static int[] getEvens(int[] arr) {
        int count = 0;
        int pivot = 0;
        //βρισκω ποσοι ειναι οι αρτιοι γιατι τοσο θα ειναι το μεγεθος του πινακα (count)
        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];


        for (int el : arr) {
            if (el % 2 == 0) {
                evens[pivot] = el;
                pivot++;
            }
        }
        return evens;
    }

    //Mapping
    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int [arr.length];

        for (int i =0; i<arr.length; i++){
            mapped[i] = arr[i] & 2;
        }
        return mapped;
    }

    //Reducing
    public static int sum(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum +=el;
        }
        return sum;
    }

    public static double avg(int[] arr) {
        double avg = 0.0;
        return sum(arr) / (double) arr.length;
    }

    public static boolean anyEven(int[] arr) {
        boolean isThereAny=false;
        for (int el : arr) {
            if (el % 2 == 0) {
                isThereAny = true;
                break;
            }
        }
        return isThereAny;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        boolean moreThanTwo = false;
        int count = 0;
        for (int el : arr) {
            if (el % 2 ==0) count++;
        }
        return count >2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i ++) {
            if(arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) {
                count++;
                break;
            }
        }
        return count >=1;
    }

    public static boolean moreThanTwoWithSameEnding (int[] arr) {
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for (int num : arr) {
            endings[num % 10]++;
        }

//        for (int i = 0; i< arr.length; i++) {
//            endings[arr[1] % 10]++;
//        }
        for (int count : endings) {
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

    public static boolean AllAreEven(int[] arr){
//        return  getEvens(arr).length == arr.length;
        boolean allEvens = false;
        int count = 0;

        for (int el :arr) {
            if (el % 2 == 0) count++;
        }

        return count == arr.length;
    }
}
