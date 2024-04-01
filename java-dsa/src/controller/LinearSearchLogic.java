package controller;

import java.util.Scanner;

public class LinearSearchLogic {
    Scanner s=new Scanner(System.in);

    
    //serch element from list
    public int searshOurData(int dataToSearch,int[] allData){
        for(int i=0;i<=allData.length-1;i++){
            if(allData[i] == dataToSearch){
                return i;
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

        int result=searshOurData(dataToSearch,allData);
        if(result==-1){
            System.out.println(dataToSearch+" this data is not  present in this list .");
        }else{
            System.out.println(dataToSearch+" this data present in index no : "+result);
        }
    }
}
