/*
 ** 2024, December 19, Thursday, 8:27 PM
 */
public class BinaryChecker {

    public static void check(String input) {
        boolean isBinary = true;
        for(char c : input.toCharArray())
            if ("01".indexOf(c) == -1) {
                isBinary = false;
                break;
            }
        System.out.println("Output: " + isBinary);
    }
}
