package 排序;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,981,10,-17,0,-20,29,50,8,43,-5};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length - 1);
    }

    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp;
        if(low > high){
            return;
        }
        i = low;
        j = high;
        temp = arr[low];
        while (i < j){
            while (i < j && arr[j] >= temp){
                j--;
            }
            while (i < j && arr[i] <= temp){
                i++;
            }
            if (i < j){
                swap(arr,i,j);
            }
        }
        swap(arr,i,low);
        quickSort(arr,low,i - 1);
        quickSort(arr,i + 1,high);
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
