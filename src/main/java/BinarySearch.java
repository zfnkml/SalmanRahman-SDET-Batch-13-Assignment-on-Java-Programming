/*
 ** 2024, December 12, Thursday, 2:19 PM
 */
public class BinarySearch {

    public static int findCGPA(double[] array, double target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (target == array[middle])
                return middle;

            if (target < array[middle]) {
                left = middle + 1;
            } else if (array[middle] < target) {
                right = middle - 1;
            }
        }

        return -1;
    }
}
