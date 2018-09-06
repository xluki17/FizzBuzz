//liczba podzielna przez 3 to fizz
//liczba podzielna przez 5 to buzz
//liczba podzielna przez 3 i 5 to fizzbuzz

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }

            else {
                System.out.println(i);
            }
        }

    }

}
