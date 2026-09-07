public class Even {
    // Static method to check even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}


// 2. Main execution class
import evenpackage.Even;

public class Main {
    public static void main(String[] args) {
        int num = 8;

        // Calling the static method from Even class
        if (Even.isEven(num)) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }
    }
}
