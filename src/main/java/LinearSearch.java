/*
 ** 2024, December 12, Thursday, 11:33 AM
 */
public class LinearSearch {
    public static double getSecondHighest(double[] studentsCGPA) {
        double highest = studentsCGPA[0];
        double secondHighest  = studentsCGPA[0];

        for (double cgpa: studentsCGPA) {
            if (cgpa > highest) {
                secondHighest  = highest;
                highest = cgpa;
            }
            else if(cgpa > secondHighest  && cgpa < highest)
                secondHighest = cgpa;
        }
        return secondHighest;
    }
}
