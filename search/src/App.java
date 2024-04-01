
import java.util.Arrays;
import java.util.Scanner;

import controller.BinarySearchLogic;
import controller.LinearSearchLogic;

public class App {

    
   
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int whatYouWant=0;

        while (whatYouWant != 3) {
            System.out.println("1 : for Linear Search");
            System.out.println("2 : for Binary Search");
            System.out.println("3 : for Exit");
            System.out.print("what you want : ");

            whatYouWant = s.nextInt();

            if (whatYouWant == 1) {
                LinearSearchLogic linearSearchLogic = new LinearSearchLogic();
                linearSearchLogic.dataIsPresentOrNot();
            } else if (whatYouWant == 2) {
                BinarySearchLogic binarySearchLogic = new BinarySearchLogic();
                binarySearchLogic.dataIsPresentOrNot();
            } else if(whatYouWant != 3) {
                System.out.println("Your Passing Wrong no");
            }else{
                System.out.println("Thanks !");
            }
        }         
    }    
}
