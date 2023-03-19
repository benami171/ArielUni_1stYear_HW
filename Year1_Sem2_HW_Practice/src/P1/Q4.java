package P1;

import java.util.Arrays;

/**
 *כתוב פונקציה שמקבלת מערך של מספרים שלמים ומדפיסה את שני האברים שערך מוחלט של ההפרש בינם הוא גדול היותר.  מהי סיבוכיות של האלגוריתם?
 */
public class Q4 {
    /**
     * סיבוכיות הזמן של המיון היא O(nlogn)
     * לאחר מכן נבחר את האיבר הקטן ביותר ואת האיבר הגדול ביותר שהפעולה הזו היא O(1)
     * הסיבוכיות של הפונ' היא O(nlogn)
     */
    public static int[] twoHighestAbs(int[] arr){
        Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
}
