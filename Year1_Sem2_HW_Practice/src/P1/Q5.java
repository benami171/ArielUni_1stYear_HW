package P1;


import java.util.Arrays;
import java.util.Random;

/**
 * נתון מערך שמכיל  מספרים שלמים מ-1 עד 100. למיין את המערך בסיבוכיות של  O(N).
 */

// arr[] = {22,1,19,28,22,46,47,3,............,99,98,97,100}
public class Q5 {
    public static void sort(int[] arr){
        int[] countArr = new int[101];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            countArr[num]++;
        }
        int j = 0;
        for (int i = 0; i < countArr.length ; i++) {
            while(countArr[i] > 0){
                    arr[j++] = i + 1;
                    countArr[i]--;
            }
        }
    }

    public static void main(String[] args) {
        Random rn = new Random();
        int[] arr = new int[100];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = rn.nextInt(101);
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
