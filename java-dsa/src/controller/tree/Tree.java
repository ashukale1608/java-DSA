package controller.tree;

public class Tree {
    private Node root;

    public void insertData(int data) {
        root = insertDataLogic(root, data);
    }

    private Node insertDataLogic(Node root, int data) {
        if (root == null)
            return new Node(data);
        else if (data < root.data)
            root.leftNode = insertDataLogic(root.leftNode, data);
        else if (data > root.data)
            root.rightNode = insertDataLogic(root.rightNode, data);
        return root;
    }

    public void showDataInOrder() {
        showDataInOrderLogic(root);
    }

    private void showDataInOrderLogic(Node root) {
        if (root != null) {
            showDataInOrderLogic(root.leftNode);
            System.out.print(root.data + " ");
            showDataInOrderLogic(root.rightNode);
        }
    }
    public void showDataInPreOrder(){
        showDataInPreOrderLogic(root);
    }

    private void showDataInPreOrderLogic(Node root) {
        if(root != null){
            System.out.print(root.data+" ");      
            showDataInPreOrderLogic(root.leftNode);
            showDataInPreOrderLogic(root.rightNode);
        }
    }

    public void showDataInPostOrder(){
        showDataInPostOrderLogic(root);
    }

    private void showDataInPostOrderLogic(Node root) {
        if(root != null){
            showDataInPostOrderLogic(root.leftNode);
            showDataInPostOrderLogic(root.rightNode);
            System.out.print(root.data+" ");
        }
    }
}