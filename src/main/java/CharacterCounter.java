/*
 ** 2024, December 19, Thursday, 8:14 PM
 */
public class CharacterCounter {
        private static int words = 0;
        private static int chars = 0;
        private static int vowel = 0;
        private static int consonant = 0;

    public static void count(String input) {
        input = input.toLowerCase();

        if (!input.isBlank())
            words = input.trim().split("\\s+").length;
        for (char c: input.toCharArray()) {
            if(!Character.isSpaceChar(c))
                ++chars;
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) == -1)
                    ++consonant;
                else
                    ++vowel;
            }
        }

        System.out.printf("""
                Output: Words     : %d
                        Chars     : %d
                        Vowel     : %d
                        Consonant : %d
                """, words, chars, vowel, consonant);
    }
}
