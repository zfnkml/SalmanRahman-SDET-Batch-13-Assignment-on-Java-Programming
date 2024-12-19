/*
 ** 2024, December 12, Thursday, 1:50 PM
 */
public class BubbleSort {

    public static double[] orderOfHighestCGPA(double[] studentsCGPA) {
        for (int i = 0; i < studentsCGPA.length; i++) {
            for (int j = 0; j < studentsCGPA.length - 1; j++) {
                if (studentsCGPA[j] < studentsCGPA[j + 1]) {
                    double temp = studentsCGPA[j];
                    studentsCGPA[j] = studentsCGPA[j + 1];
                    studentsCGPA[j + 1] = temp;
                }
            }
        }

        return studentsCGPA;
    }
}
