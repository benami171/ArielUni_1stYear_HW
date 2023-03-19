package P2;

/**
 * calculate 2^n without multiplication.
 * 2^n = 2^n-1 + 2^n-1
 * 2^0 = 1
 */
public class Q2 {
    public static int calc(int n){
        if (n == 0) return 1;
        return calc(n-1) + calc(n-1);
    }
}
