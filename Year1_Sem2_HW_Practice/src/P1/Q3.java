package P1;

import java.util.Arrays;
import java.util.Random;

/**
 * כתוב פונקציה שמקבלת מערך של מספרים שלמים ומדפיסה את שני האברים שערך מוחלט של ההפרש בינם הוא קטן היותר.  מהי סיבוכיות של האלגוריתם?
 */
public class Q3 {

    /**
     * כתוב פונקציה שמקבלת מערך של מספרים שלמים ומדפיסה את שני האברים שערך מוחלט של ההפרש בינם הוא קטן היותר.  מהי סיבוכיות של האלגוריתם?
     * הסיבוכיות של האלגוריתם היא O(nlogn)
     *מכיוון שסיבוכיות של הקוויק סורט היא O(nlogn) , לאחר מכן עוברים על המערך הממויין פעם אחת שזה O(n)
     * לכן הסיבוכיות הכללית היאO(nlogn) .
     */
    public static void twoSmallestDiff(int[] arr){
        quickSort(arr);
        int[] ans = twoSmallestDiffhelp(arr);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
    public static void quickSort(int[] arr){
        quickSort(arr, 0,arr.length-1);
    }
    private static void quickSort (int[] arr , int low, int high){
        if ( low < high +1){
            int p = partition (arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr, p+1,high);
        }
    }
    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    private static int getPivot(int low, int high){
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }
    private static int partition(int[] arr, int low, int high){
        swap(arr,low , getPivot(low,high));
        int border = low + 1;
        for (int i = border; i <= high ; i++) {
            if(arr[i] < arr[low]){
                swap(arr,i,border++);
            }
        }
        swap(arr,low,border -1);
        return border-1;
    }

    public static int[] twoSmallestDiffhelp(int[] sortedArr){
        int smallestDiff = Integer.MAX_VALUE;
        int[] ans = new int[2];
        for (int i = 0; i < sortedArr.length-1 ; i++) {
            if(Math.abs(sortedArr[i] - sortedArr[i+1]) < smallestDiff){
                smallestDiff = Math.abs(sortedArr[i] - sortedArr[i+1]);
                ans[0] = sortedArr[i];
                ans[1] = sortedArr[i+1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,9,17,23,-1,14};
        twoSmallestDiff(arr);
    }
}
