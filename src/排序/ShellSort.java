package 排序;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {4,981,10,-17,0,-20,29,50,8,43,-5};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr){
        int temp,i,j;
        for(int gap = arr.length / 2;gap > 0;gap /= 2){
            for (i = gap;i < arr.length;i++){
                temp = arr[i];
                for(j = i - gap;j >= 0 && arr[j] > temp;j -= gap){
                    arr[j + gap] = arr[j];
                }
                arr[j + gap] = temp;
            }
        }
    }
}
