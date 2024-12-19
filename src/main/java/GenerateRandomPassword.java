import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 ** 2024, December 18, Wednesday, 11:33 PM
 */
public class GenerateRandomPassword {
    private static final int PASSWORD_LENGTH = 8;
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

    public static String randomPassword() {
        Random random = new Random();

        ArrayList<Character> password = new ArrayList<>();

        password.add(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
        password.add(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
        password.add(DIGITS.charAt(random.nextInt(DIGITS.length())));
        password.add(SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length())));

        for (int i = 4; i < PASSWORD_LENGTH; i++) {
            String allChars = UPPERCASE + LOWERCASE + DIGITS + SPECIAL_CHARS;
            password.add(allChars.charAt(random.nextInt(allChars.length())));
        }

        Collections.shuffle(password);

        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : password)
            stringBuilder.append(c);

        return stringBuilder.toString();
    }
}
