package P2;

public class Q1 {

    public static int sum(int a, int b){
        if (b == 0) return a;
        return sum(a,b-1)+1;
    }

    public static int substruct(int a, int b){
        if (b == 0) return a;
        return substruct(a,b-1) -1;
    }

    public static int multiply(int a, int b){
        if(b == 0) return 0;
        if(b == 1) return a;
        return multiply(a,b-1) + a;
    }

    public static int division (int a, int b){
        if (a<b) return 0;
        if (b == 0) throw new RuntimeException("can't divide by 0");
        return division(a-b,b) +1;
    }

    public static int remainder(int a, int b){
        if (a < b) return a;
        return remainder(a-b,b);
    }
}
