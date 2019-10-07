package lab1;

public class Main {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("white", "23inch", "1980x1080");

        Monitor monitor2 = new Monitor("black", "27inch", "2140x1440");

        monitor1.color = "black";
        monitor1.dimensions = "27inch";

        boolean result = monitor1.compare((monitor2));
        System.out.println(result);
    }
}
