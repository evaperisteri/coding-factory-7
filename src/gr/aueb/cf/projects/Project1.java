package gr.aueb.cf.projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) throws FileNotFoundException {
        final int THRESHOLD = 4;
        File inputFile = new File("C:/temp/fileinput.txt");
        File outputFile = new File("C:/temp/fileoutput.txt");
        Scanner scn=new Scanner(inputFile);
        PrintStream ps=new PrintStream(outputFile);
        int n = 6;
        int[] arr= new int[6];

        ArrayList<Integer> numbers = new ArrayList<>();
        while(scn.hasNextInt()) {
            numbers.add(scn.nextInt());
    }
        for (int i = 0; i <= numbers.size() - n; i++){
            for (int j = i + 1; j <= numbers.size() - n + 1; j++){
                for (int k = j + 1; k <= numbers.size() - n + 2; k++){
                    for (int l = k + 1; l <= numbers.size() - n + 3; l++){
                        for (int m = l + 1; m <= numbers.size() - n + 4; m++){
                            for (int p = m + 1; p < numbers.size(); p++){
                                arr[0]= numbers.get(i);
                                arr[1]= numbers.get(j);
                                arr[2]= numbers.get(k);
                                arr[3]= numbers.get(l);
                                arr[4]= numbers.get(m);
                                arr[5]= numbers.get(p);

                                if(!isEven(arr, THRESHOLD) && (!isOdd(arr, THRESHOLD)) && (!isContiguous(arr)) &&
                                        (!isSameEnding(arr)) && (!isSameTen(arr))){
                                    ps.printf("%d, %d, %d, %d, %d, %d\n", numbers.get(i), numbers.get(j), numbers.get(k),
                                            numbers.get(l), numbers.get(m), numbers.get(p));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static boolean isEven(int[] arr, int threshold){
        int count=0;
        for (int num : arr) {
            if (num % 2 == 0) count++;
        }
        return count>threshold;
    }

    public static boolean isOdd(int[] arr, int threshold){
        int count=0;
        for (int num : arr) {
            if (num % 2 != 0) count++;
        }
        return count>threshold;
    }

    public static boolean isContiguous(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - arr[i+1] != 1) return false;
        }
        return true;
    }

    public static boolean isSameEnding(int[] arr){
        int[] endings = new int[10];
        boolean isSameEnding= false;

        for (int num : arr) {
            endings[num % 10]++;
        }

        for (int count : endings) {
            if (count >=3){
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

    public static boolean isSameTen(int[] arr) {
        int[] tens = new int[6];
        boolean isSameTen = false;

        for (int num : arr ){
            tens[num/10]++;
        }

        for(int count : tens) {
            if (count >= 3) {
                isSameTen = true;
                break;
            }
        }
        return isSameTen;
    }
}
