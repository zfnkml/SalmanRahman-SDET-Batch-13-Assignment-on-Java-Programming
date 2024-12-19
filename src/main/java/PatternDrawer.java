/*
 ** 2024, December 19, Thursday, 7:51 PM
 */
public class PatternDrawer {
    public static void draw() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            if (i == 1)
                continue;
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
