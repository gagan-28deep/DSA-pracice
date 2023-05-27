// package reverseArray;
import java.util.*;
import java.io.*;
public class reverseArray {
    public static void reverseAnArray(int [] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++ ; j--;
        }
    }
    public static void displayArray(int [] arr){
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " -> ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i = 0 ; i <arr.length ; i++){
            arr[i] = scn.nextInt();
        } 
        displayArray(arr);
        reverseAnArray(arr);
        displayArray(arr);
    }
}
