package controller;

public class Stack {
    int length = 1;
    int stack[] = new int[length];
    int top = 0;

    public void push(int data) {
        if (top == length) {
            toIncresASize();
        }
        stack[top] = data;
        top++;

    }

    public void pop() {
        if (top <= 0) {
            System.out.println("stack is empty . ");
        } else {
            top--;
            stack[top] = 0;
            shrink();
        }
    }

    private void shrink() {
        if (top * 2 == length) {
            int newStack[] = new int[length / 2];
            System.arraycopy(stack, 0, newStack, 0, top);
            stack = newStack;
            length /= 2;
        }
    }

    public void peek() {
        System.out.println("last element is : " + stack[top - 1]);
    }

    public void showData() {
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void size() {
        if (top <= 0) {
            System.out.println("stack is empty .");
        } else {
            System.out.println("Size is : " + top);
        }
    }

    public void toIncresASize() {
        int newStack[] = new int[length * 2];
        System.arraycopy(stack, 0, newStack, 0, top);
        stack = newStack;
        length *= 2;
    }

}
