/*
 ** 2024, December 19, Thursday, 8:42 PM
 */
public class VowelRemover {
    public static void remove(String input) {
        input = input.toLowerCase();

        StringBuilder stringBuilder = new StringBuilder();

        for (char c: input.toCharArray())
            if ("aeiou".indexOf(c) == -1)
                stringBuilder.append(c);

        System.out.println("Output: " +
                stringBuilder.toString()
                        .trim()
                        .replaceAll("\\s+"," ")
        );
    }
}
