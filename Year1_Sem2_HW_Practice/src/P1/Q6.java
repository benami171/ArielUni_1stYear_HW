package P1;

import java.util.Arrays;

/**
 * כתוב פונקציה סטטית שמקבלת מערך ממוין בסדר עולה של מספרים שלמים.
 * הפונקציה מחזירה true אם במערך יש שני איברים שסכומם שווה לאפס, אחרת היא מחזירה false.
 */
public class Q6 {
    /**
     * שימוש בשני פויינטרים מההתחלה ומהסוף ובכל צעד משנה את ערך המצביעים בהתאם לתוצאת הסכום
     */
    public static boolean isZero(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while ( left < right) {
            int sum = arr[left] + arr[right];
                if (sum == 0) return true;
                else if (sum < 0) {
                    left++;
                }
                else if (sum >0){
                    right--;
                }
            }

        return false;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{-20,-12,-11,-5,1,2,5,22};
        System.out.println(isZero(arr));
    }
}
