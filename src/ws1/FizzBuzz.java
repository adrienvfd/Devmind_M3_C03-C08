package ws1;

public class FizzBuzz {

    public String computeFizzBuzz(int number) {
        if (number < 1) {
            throw new IllegalArgumentException();
        }

        StringBuilder result = new StringBuilder();

        if(number % 3 == 0) {
            result.append("Fizz");
        }
        if(number % 5 == 0) {
            result.append("Buzz");
        }
        if(result.isEmpty()) {
            result.append(number);
        }
        return result.toString();
    }
}
