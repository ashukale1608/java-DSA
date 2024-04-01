package controller;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchLogic {
    Scanner s= new Scanner(System.in);


    //search our data (element) is present or not 
    public int searchOurDataUsingBinarySerach(int dataToSearch,int[] allData,int left,int right){
        //using bubble sort
        ToSortArray toSortArray = new ToSortArray();
        toSortArray.allDataToSorted(allData);


        // //using Arrays function
        // Arrays.sort(allData);
        // System.out.println(Arrays.toString(allData));

        // // using loop

        // while () {
        //     int mid = (left + right)/2;
        //     System.out.println("mid : "+mid);
        //     if(allData[mid] == dataToSearch){
        //         System.out.println("mid : "+mid);
        //         return mid;
        //     }else if(allData[mid] < dataToSearch){
        //         left = mid + 1 ;
        //     }else{
        //         right = mid - 1;
        //     }      
        // }


        //using recursion
        if(left <= right){
            int mid = (left + right)/2;
            if(allData[mid] == dataToSearch){
                return mid;
            }else if(allData[mid] < dataToSearch){
                return searchOurDataUsingBinarySerach(dataToSearch, allData, mid + 1, right);
            }else{
                return searchOurDataUsingBinarySerach(dataToSearch, allData, left, mid - 1);
            }      
        }
        return -1;        
    }

    //data is present or not logic
    public void dataIsPresentOrNot(){
        CreateList createList = new CreateList();
        int[] allData = createList.addDataInList();
        
        System.out.print("Enter data to search : ");
        int dataToSearch=s.nextInt();

        int left=0;
        int right=allData.length-1;

        int result=searchOurDataUsingBinarySerach(dataToSearch,allData,  left, right);
        if(result==-1){
            System.out.println(dataToSearch+" this data is not  present in this list .");
        }else{
            System.out.println(dataToSearch+" this data present in index no : "+result);
        }
    }
    
}