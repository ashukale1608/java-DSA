package controller;

public class LinkedList {
    Node head;

    public void insertDataInToListAtLast(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertDataInToListAtFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertDataFromAnyWhere(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertDataInToListAtFirst(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void deleteDataFromAnyWhere(int index) {
        if(index == 0){
            head = head.next;
        }else{
            Node n = head;
            Node n1 = null;
            for(int i = 0;i<index-1 ; i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;

            n1=null;
        }
    }
    public void deleteDataFromFirst(){
        head=head.next;
    }
    public void deleteDataFromLast(){
        Node node = head;
        while (node.next.next != null) {
            node = node.next;            
        }
        node.next=null;
    }    
    public void showData() {
        Node node = head;
        while (node.next != null) {
            System.out.println("data : " + node.data);
            node = node.next;
        }
        System.out.println("data : " + node.data);
    }
}
