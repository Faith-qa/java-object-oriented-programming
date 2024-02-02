import java.util.Random;

public class last_digit {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(20001) - 10000;
        // YOUR CODE HERE
        int lastdigit = number % 10;
        String statement = "";
        if (lastdigit > 5) {
            statement = " and is greater than 5";
        }if (lastdigit < 6 && lastdigit != 0) {
            statement = " and is less than 6 and not 0";
            
        } else {
            statement = " and is 0";
            
        }
        System.out.println("Last digit of " + number + " is " + lastdigit + statement);

    }

    
}
