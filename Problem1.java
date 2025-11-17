//Second largest element from the array

public class Problem1 {

    public static int secondLargest(int arr[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (first < arr[i]) {
                second = first;
                first = arr[i];
            } else if (first != arr[i] && second < arr[i]) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            return -1;
        }
        return second;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        int second = secondLargest(arr);
        System.out.println(second);
    }
}
