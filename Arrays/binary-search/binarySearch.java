import java.util.*;

public class binarySearch{

    public static int binarysearch(int [] arr , int data){
        int low = 0;
        int high = arr.length - 1;
        while(low <=high){
            int mid = (low + high) / 2;
            if(arr[mid] == data){
                return mid;
            }
            else if(arr[mid] > data){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int [] arr = new int[size];

        for(int i = 0 ; i <arr.length ; i++){
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();
        int result = binarysearch(arr , data);
        System.out.println(result);
        
    }
}