package 排序;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {4,981,10,-17,0,-20,29,50,8,43,-5};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr){
        int i,j,temp;
        for (i = 1;i < arr.length;i++){
           temp = arr[i];
           for(j = i - 1;j >=0 && arr[j] > temp;j--){
               arr[j + 1] = arr[j];
           }
           arr[j + 1] = temp;
        }
    }
}
