package lab4;

public class Stack {
    public Node head;
    public int count;

    public void push(char data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        count += 1;
    }

    public char pop() {
        char data = head.data;
        head = head.next;
        count -= 1;
        return data;
    }

    public boolean isEmpty() {
        return count == 0;
    }

}
