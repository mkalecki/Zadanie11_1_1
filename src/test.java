import java.util.ArrayList;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int number;
        do {
            System.out.println("podaj liczbę:");
            number = scan.nextInt();
            if (number >= 0)
                numbers.add(number);
        } while (number>=0);

        for (int i = numbers.size() - 1 ; i >= 0 ; i--) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.println();

        int sum =0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            if (i < numbers.size() - 1)
                System.out.print(numbers.get(i) + " + ");
            else System.out.print(numbers.get(i));
        }

        System.out.println(" = " + sum);

        int biggest = numbers.get(0);
        for (Integer number1 : numbers) {
            if (biggest < number1)
                biggest = number1;
        }
        System.out.println("Najwieksza liczba to: " + biggest);

        int smallest = numbers.get(0);
        for (Integer number1 : numbers) {
            if (smallest > number1)
                smallest = number1;
        }
        System.out.println("Najmniejsza liczba to: " + smallest);

    }
}
