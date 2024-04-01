package controller;

public class Queue {
    int length = 4;
    int[] queue = new int[length];

    int first = 0;
    int last = 0;
    int size;

    public void insertData(int data) {
        if (!isFull()) {
            queue[last] = data;
            last = (last + 1) % 4;
            size++;
        } else {
            System.out.println("Queue is full .");
        }

    }
    public void removeData() {
        if (!isEmpty()) {
            first = (first + 1) % 4;
            size--;
        } else {
            System.out.println("Queue is Empty .");
        }

    }

    public void showData() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(first + i) % 4] + " ");
        }
        System.out.println();
    }

    public void size() {
        System.out.println("size is : " + size);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == length;
    }
}