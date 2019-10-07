package lab2;

public class Main {
    public static void main(String[] args) {
        try {
            Box box1 = new Box();
            Box box2 = new Box(2);
            Box box3 = new Box(1, 2, 3);

            System.out.println(box1.getVolume());
            System.out.println(box2.getVolume());
            System.out.println(box3.getVolume());


            Queue queue1 = new Queue();
            Queue queue2 = new Queue(3);

            queue1.push(2);
            queue1.push(15);
            queue1.push(13);

            queue2.push(15);
            queue2.push(3);
            queue2.push(15);
            queue2.push(13);

            System.out.println(queue1.pop());
            System.out.println(queue1.pop());
            System.out.println(queue1.pop());
            System.out.println(queue1.pop());

            System.out.println(queue2.pop());
            queue2.push(11);

            System.out.println(queue1.isFull());
            System.out.println(queue2.isFull());

            System.out.println(queue1.isEmpty());
            System.out.println(queue2.isEmpty());
        } catch (Exception error) {
            System.out.println(error);
        }
    }
}