
import java.util.Arrays;
import java.util.Scanner;

import controller.BinarySearchLogic;
import controller.LinearSearchLogic;
import controller.LinkedList;
import controller.Queue;
import controller.Stack;
import controller.tree.Tree;

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
    
        //  // Linked List
        // LinkedList linkedList = new LinkedList();
        // // linkedList.insertDataInToListAtLast(1);
        // linkedList.insertDataInToListAtLast(2);
        // linkedList.insertDataInToListAtLast(4);
        // linkedList.insertDataInToListAtLast(5);

        // linkedList.insertDataInToListAtFirst(1);

        // linkedList.insertDataFromAnyWhere(2,3);
        // linkedList.insertDataFromAnyWhere(0,0);

        // linkedList.showData();

        // System.out.println("first");
        
        // linkedList.deleteDataFromAnyWhere(3);
        // linkedList.deleteDataFromFirst();
        // linkedList.deleteDataFromLast();
        // linkedList.showData();
        
        // // Stack

        // Stack stack = new Stack();
        // // stack.size();
        // stack.push(1);
        // // stack.size();
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);

        // stack.showData();

        // stack.size();

        // // stack.pop();
        // // stack.peek();


        // // stack.showData();
        // // stack.size();

        // stack.push(6);

        // // stack.showData();
        // // stack.size();

        // // stack.peek();

        // stack.push(7);

        // // stack.showData();
        // // stack.size();

        // stack.push(8);
        // stack.push(9);
        // stack.push(77);
        // stack.push(75);
        // stack.push(75);

        // stack.showData();
        // stack.size();

        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.showData();
        // stack.size();



        // //Queue
        // Queue queue = new Queue();
        // queue.removeData();

        // queue.insertData(1);
        // queue.insertData(2);
        // // System.out.println(queue.isFull());

        // queue.insertData(3);
        // queue.insertData(4);
        // // System.out.println(queue.isEmpty());
        // queue.showData();

        // queue.removeData();
        // queue.showData();

        // queue.removeData();
        // queue.showData();

        // queue.insertData(33);
        // queue.insertData(44);
        // queue.insertData(333);
        // // queue.insertData(444);
        // queue.showData();
        // queue.size();


        // // tree
         
        // Tree tree = new Tree();

        // tree.insertData(1);
        // tree.insertData(3);
        // tree.insertData(2);
        // tree.insertData(5);
        // tree.insertData(4);

        // System.out.println("in order");

        // tree.showDataInOrder();

        // System.out.println();
        // System.out.println("pre");
        // tree.showDataInPreOrder();
        // System.out.println();
        // System.out.println("post");
        // tree.showDataInPostOrder();
    }    
}
