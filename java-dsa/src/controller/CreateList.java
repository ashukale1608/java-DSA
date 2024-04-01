package controller;

import java.util.Scanner;

public class CreateList {

    Scanner s=new Scanner(System.in);   

     //add data in list 
    public int[] addDataInList(){
        System.out.print("Enter a number of element : ");
        int n = s.nextInt();

        int[] allData=new int[n];
        for( int i=0;i<n;i++){
            System.out.print("Enter data for index "+i+" : ");
            allData[i]=s.nextInt();
        }       
        return allData;
    }
    
}
