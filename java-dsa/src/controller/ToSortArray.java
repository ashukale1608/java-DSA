package controller;

import java.util.Arrays;

public class ToSortArray {
    private static void mergeSort(int[] arr, int low, int high) {
        if(low < high){
         // int pi=partitions(arr,low,high);
         int mid = (low+high)/2;
         mergeSort(arr , low , mid );
         mergeSort(arr , mid+1 , high);
         merge(arr,mid,low,high);
        }
     }
     private static void merge(int[] arr, int mid, int low, int high) {
         int n1 = mid -low + 1;
         int n2 = high - mid;
 
         int lArr[]= new int[n1];
         int rArr[]= new int[n2];
 
         for(int x=0 ; x<n2;x++){
             rArr[x]=arr[mid+1+x];
         }
         for(int x=0 ; x<n1;x++){
             lArr[x] = arr[low+x];
         }
 
         int i=0;
         int j=0;
         int k=low;
 
         while (i<n1 && j<n2) {
             if(lArr[i] <= rArr[j]){
                 arr[k] = lArr[i];
                 i++;
             } else{
                 arr[k]=rArr[j];
                 j++;
             }
             k++;          
         }
         while (i<n1) {
             arr[k] = lArr[i];
             i++;
             k++;
             
         }
         while (j<n2) {
             arr[k] = rArr[j];
             j++;
             k++;            
         }        
     }
    private static void quickSort(int[] allData, int low, int high) {
        if(low < high){
         int pi=partitions(allData,low,high);
         quickSort(allData , low , pi-1 );
         quickSort(allData , pi+1 , high);
        }
     }
     private static int partitions(int[] allData, int low, int high) {
         int pivot=allData[high];    
         int i=low-1;
 
         for(int j=low;j<high;j++){
             if(allData[j] < pivot){
                 i++;
                 int temp=allData[i];
                 allData[i]=allData[j];
                 allData[j]=temp;
             }
         }
 
        int temp=allData[i+1];
         allData[i+1]=allData[high];
         allData[high]=temp;
 
         return i+1;
     }

    public int[] allDataToSorted(int[] allData) {
        // //bubble sort

        // for(int i = 0; i < allData.length - 1 ; i++ ){
        // for(int j = 0 ;j < allData.length - 1 ; j++ ){
        // if( allData[j] > allData[j+1]){
        // int data = allData[j];
        // allData[j] = allData[j+1];
        // allData[j+1] = data;
        // }
        // }
        // }

        // // selected sort

        // for (int i = 0; i < allData.length; i++) {
        //     int min = i;
        //     for (int j = i + 1; j < allData.length; j++) {
        //         // 6,5,4,3
        //         if (allData[min] > allData[j]) {
        //             min = j;
        //         }
        //     }
        //     int temp = allData[min];
        //     allData[min] = allData[i];
        //     allData[i] = temp;
        // }



        // //insertion sort

        // int temp;
        // int j;
        // for(int i=1;i<allData.length;i++){
        //     temp=allData[i];
        //     j = i-1; 
        //     while (j>=0 && allData[j] > temp ) {
        //         allData[j+1] = allData[j];
        //         j =j- 1;           
        //     }
        //     allData[j+1] = temp;
        // }

        // //quick sort

        // quickSort(allData,0,allData.length-1);

        //merge sort

        mergeSort(allData, 0, allData.length-1);

        
        System.out.println(Arrays.toString(allData));

        return allData;
    }
}
