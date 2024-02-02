/*
 * print_alphabt - prints alphabet except q and e
 */
public class print_alphabt {
    public static void main(String [] args) {
        for (char i = 'a'; i <= 'z'; ++i) {
            if (i == 'e' || i == 'q') {
                continue;
            } else {
                System.out.print(i);
            }
        }
        System.out.print('\n');
    }
    
}
