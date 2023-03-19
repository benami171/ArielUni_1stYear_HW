package P3;

public class Q1 {
    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        int middle;
        while (left <= right) {
             middle = (left + right) / 2;
            if (arr[middle] == value) return middle;
            if (arr[middle] > value) {
                right = middle-1;
            } else {
                left = middle + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,5,8,19,20};
        int res = binarySearch(arr,8);
        System.out.println(res);
    }
}
