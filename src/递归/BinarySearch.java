package 递归;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int key = 4;
        int res = binarySearch(arr, 0, arr.length - 1, key);
        System.out.println(res);
    }

    public static int binarySearch(int[] arr,int low,int high,int key){
        if (key < arr[low] || key > arr[high]){
            return -1;
        }
        int mid = (high - low) / 2 + low;
        if(arr[mid] > key){
            return binarySearch(arr,low,mid - 1,key);
        }else if(arr[mid] < key){
            return binarySearch(arr,mid + 1,high,key);
        }else {
            return mid;
        }
    }
}
