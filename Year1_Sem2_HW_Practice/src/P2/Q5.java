package P2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * כתוב פונקציה רקורסיבית המקבלת מחרוזת והופכת אותה מסוף להתחלה (לא  mystery!):
 * דוגמה:  קלט: abcde   פלט: edcba.
 */
public class Q5 {
    public static String reverse(String str) {
        if ( str.length() == 0) return "";
        return str.charAt(str.length()-1)+ reverse(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        String a = "hello world";
        String b = reverse(a);
        System.out.println(a);
        System.out.println(b);
    }
}
