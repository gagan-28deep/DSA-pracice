import java.util.*;

public class linearSearch {
    public static int linearS(int [] arr , int n){
        int idx = -1;
        for (int i = 0 ; i<arr.length ; i++){
            if(arr[i] == n){
                idx = i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int [] arr = new int [size];

        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }

        int ele = scn.nextInt();

        int result = linearS(arr, ele);
        System.out.println("----------------------------");
        System.out.println(result);
        System.out.println(arr[result]);
    }    
}
