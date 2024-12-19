import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 ** 2024, December 19, Thursday, 9:11 PM
 */
public class TextExtractor {
    public static double calculateTotalCost(String textToExtract) throws Exception {
        int laptopPrice = extractValue(textToExtract, "laptop price is (\\d+)");
        int mousePrice = extractValue(textToExtract, "mouse price is (\\d+)");
        int discountPercent = extractValue(textToExtract, "giving (\\d+)% discount");

        if (laptopPrice == -1 || mousePrice == -1 || discountPercent == -1) {
            throw new Exception("Required values could not be extracted from the text.");
        }

        double totalPriceWithoutDiscount = (laptopPrice + mousePrice);
        double discount = totalPriceWithoutDiscount * .15;
        return totalPriceWithoutDiscount - discount;
    }

    public static void extractTransactionId(String givenHtml) {
        extractString(givenHtml, "Transaction Id: (TXN\\d+)");
    }

    private static void extractString(String givenHtml, String pattern) {
        Matcher matcher = Pattern.compile(pattern).matcher(givenHtml);
        while (matcher.find())
            System.out.println(matcher.group());
    }

    private static int extractValue(String text, String pattern) {
        Matcher matcher = Pattern.compile(pattern).matcher(text);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return -1;
    }
}
