import java.util.Random;

/*
 * asigns a random numner to a variable
 * determines whether or not it's positive or negative
 */
public class positive_or_negative {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(21) - 10;
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
            
        } else {
            System.out.println(number + "is zero");
            
        }
    }
    
}
