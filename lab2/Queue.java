package lab2;

class Queue {
    private LinkedList list = new LinkedList();
    private int maxSize = 1;
    private int count = 0;

    public Queue() { }

    public Queue(int maxSize) {
        this.maxSize = maxSize;
    }

    boolean isFull() {
        boolean flag = false;
        if (maxSize > 1) {
            flag = count >= maxSize;
        }
        return flag;
    }

    boolean isEmpty() {
        return count == 0;
    }

    void push(int value) {
        if (!isFull()) {
            list.push(value);
            count += 1;
        } else {
            System.out.println("The queue is full");
        }
    }

    int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("No element to return.");
        }
        int data = list.head.data;
        list.head = list.head.next;
        count -= 1;
        return data;
    }
}