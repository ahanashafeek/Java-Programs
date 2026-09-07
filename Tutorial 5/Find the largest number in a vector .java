import java.util.Vector;

public class LargestNumber {
    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>();

        numbers.add(25);
        numbers.add(60);
        numbers.add(15);
        numbers.add(80);
        numbers.add(45);

        int max = numbers.get(0);

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Largest number = " + max);
    }
}
