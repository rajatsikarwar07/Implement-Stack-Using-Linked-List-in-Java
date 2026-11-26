
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    Node top;
    int count;

    Stack() {
        top = null;
        count = 0;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        count++;
        System.out.println(data + " inserted");
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;
        top = top.next;
        count--;
        System.out.println(value + " removed");
        return value;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

    int size() {
        return count;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Q1 {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.print("Stack: ");
        s.display();

        System.out.println("Peek: " + s.peek());

        s.pop();

        System.out.print("Stack after pop: ");
        s.display();

        System.out.println("Size: " + s.size());
        System.out.println("Is Empty: " + s.isEmpty());

        s.pop();
        s.pop();

        System.out.println("Is Empty: " + s.isEmpty());

        s.pop();
    }
}
