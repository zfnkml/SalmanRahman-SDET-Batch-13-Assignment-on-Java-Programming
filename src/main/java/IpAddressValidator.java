import java.util.regex.Pattern;

/*
 ** 2024, December 19, Thursday, 10:08 PM
 */
public class IpAddressValidator {
    public static boolean validate(String ipAddress) {
        boolean matches = Pattern.matches("(\\d{1,3}\\.){3}\\d{1,3}", ipAddress);
        String firstSegment = ipAddress.split("\\.")[0];
        return matches && firstSegment.length() != 1 && firstSegment.charAt(0) != '0';
    }
}
