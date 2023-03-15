
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isConstant = true;
        boolean isAscending = true;
        boolean isWeaklyAscending = true;
        boolean isDescending = true;
        boolean isWeaklyDescending = true;

        Scanner scanner = new Scanner(System.in);
        int previousNumber = scanner.nextInt();
        int currentNumber;
        while(true) {

            currentNumber = scanner.nextInt();

            if(currentNumber == -2e9) {
                break;
            }

            if(previousNumber < currentNumber) {
                isConstant = false;
                isDescending = false;
                isWeaklyDescending = false;
            } else if (previousNumber > currentNumber) {
                isConstant = false;
                isAscending = false;
                isWeaklyAscending = false;
            } else {
                isAscending = false;
                isDescending = false;
            }

            previousNumber = currentNumber;

        }

        if (isConstant) {
            System.out.println("CONSTANT");
        } else if (isAscending) {
            System.out.println("ASCENDING");
        } else if (isWeaklyAscending) {
            System.out.println("WEAKLY ASCENDING");
        } else if (isDescending) {
            System.out.println("DESCENDING");
        } else if (isWeaklyDescending) {
            System.out.println("WEAKLY DESCENDING");
        } else {
            System.out.println("RANDOM");
        }
    }




}
