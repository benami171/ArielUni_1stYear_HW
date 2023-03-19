package P2;

/**
 * write a non-recursive function that gets a whole number and turns the order
 * of the digits and returns the outcome.
 * For example :
 * input - 12345
 * output - 54321
 */
public class Q3 {
    public static int rewind(int num) {
        int res = 0;
        while( num != 0){
            res = res + num%10;
            res = res*10;
            num = num/10;
        }
        return res/10;
    }

    public static void main(String[] args) {
        int o = 1234321;
        int p = 123321;
        int t = 15922;
        System.out.println(rewind(o));
        System.out.println(rewind(p));
        System.out.println(rewind(t));
    }
}