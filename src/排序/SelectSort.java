package 排序;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {4,981,10,-17,0,-20,29,50,8,43,-5};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr){
        for(int i = 0;i < arr.length;i++){
            int min = i;
            for(int j = i + 1;j < arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(i,min,arr);
        }
    }

    public static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
