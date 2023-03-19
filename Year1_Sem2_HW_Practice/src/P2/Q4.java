package P2;

public class Q4 {

    public static int rewind(int num) {
    if(num == 0) return 0;
    int m = num,count = 0;
     while( m > 0){
         m = m/10;
         count++;
     }
     return rewindhelp(num,count);
    }

    public static int rewindhelp(int num, int length){
        if ( length == 1) return num;
        int tail = num % 10;
        num = num/10;
        length--;
        return (int) ((tail * Math.pow(10,length))+rewindhelp(num, length));
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
