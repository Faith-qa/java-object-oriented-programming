//package 0x00-java-if_else_loops_functions;
/*
 * possible combination of 2 numbers: print
 */
public class print_comb3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i){
            for( int j = i + 1; j < 10; ++j){
                if (i == 8 && j == 9){
                    System.out.printf("%d%d\n", i, j);
                } else {
                    System.out.printf("%d%d, ", i, j);


                }
            }
        }
    }
}
