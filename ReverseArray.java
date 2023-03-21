import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {13, 15, 21, 17, 16};
        int reverseArr[] = reverseArray(arr);
        System.out.println(Arrays.toString(reverseArr));
    }

    static int[] reverseArray(int arr[]) {
        int[] reverseArr = new int[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArr[count] = arr[i];
            count++;
        }
        return reverseArr;
    }

}
