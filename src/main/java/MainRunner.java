import java.util.*;

/*
 ** 2024, December 12, Thursday, 11:37 AM
 */
public class MainRunner {
    private static Scanner scanner = new Scanner(System.in);

    private static void p01(double[] studentsCGPA) {
        System.out.println("""

                01 - Here is the 10 students CGPA
                [3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]
                Find out who achieved the 2nd highest score.
                (without sorting, use linear searching algorithm)""");

        System.out.println("The second highest CGPA is: " + LinearSearch.getSecondHighest(studentsCGPA));
    }

    private static void p02(double[] studentsCGPA) {
        System.out.println("""

                02 - Sort the above scores from according to the order of highest CGPA
                (don’t use Arrays.sort() method, do it programmatically)""");

        System.out.println("Unsorted : " + Arrays.toString(studentsCGPA));
        System.out.println("Sorted   : " + Arrays.toString(BubbleSort.orderOfHighestCGPA(studentsCGPA)));
    }

    private static void p03(double[] studentsCGPA) {
        System.out.println("""

                03 - Take a CGPA as user input.
                Now from the given array find if your input CGPA is present
                using binary search algorithm""");
        System.out.println("Given Array Sorted : " + Arrays.toString(BubbleSort.orderOfHighestCGPA(studentsCGPA)));
        System.out.print("Enter CGPA to find : ");
        double target = 3.5;
//                scanner.nextDouble();
        System.out.println(target);
        System.out.println(
                BinarySearch.findCGPA(studentsCGPA, target) == -1 ?
                        "Not Found : " + target : "Found : " + target
        );
    }

    private static void p04() {
        System.out.println("""
                
                04- Generate random 10 integer numbers in an array and
                print out all the numbers from the array and also
                print the max and min number from the array.""");

        GenerateRandomArray randomArray = new GenerateRandomArray(10, 1000);
        System.out.printf("Array    : %s\n", Arrays.toString(randomArray.getArray()));
        System.out.printf("ArrayMin : %s\n", randomArray.getArrayMin());
        System.out.printf("ArrayMax : %s\n", randomArray.getArrayMax());
    }

    private static void p05() {
        System.out.println("""

                05 - Write a program that will break down the amount and
                count notes for any given amount.
                Here is the notes in the given array:
                notes=[1000,500,200,100,50,20,10,5,2,1]""");

        System.out.print("Enter Amount to break down : ");

        int amount =
//                scanner.nextInt();
                1888;
        System.out.println(amount);
//                12345; System.out.println(amount);
//                2345; System.out.println(amount);

        NoteBreakDown.amount(amount);
    }

    private static void p06() {
        String pattern = """
                
                12345
                1234
                123
                12
                1
                12
                123
                1234
                12345
                """;
        System.out.println("""

                06 - Write a program that will give following output:""" /*+ pattern*/);
        PatternDrawer.draw();
    }

    private static void p07() {
        System.out.println("""

                07 - Take input as height of 10 babies in cm.
                Now find out the 2 lowest height of babies.
                (Don’t use Arrays.sort() method)""");

        GenerateRandomArray babiesHeight = new GenerateRandomArray(10, 100);
        System.out.printf("Height of 10 babies         : %s\n", Arrays.toString(babiesHeight.getArray()));
        System.out.printf("1st lowest height of babies : %s\n", babiesHeight.getArrayMin());
        System.out.printf("2nd lowest height of babies : %s\n", babiesHeight.getArrayMin2nd());
    }

    private static void p08() {
        System.out.println("""

                08 - Count  number of words,
                            number of characters without spaces,
                            number of vowels and consonant from the given string""");

        System.out.print("Input : ");
        String input =
//                scanner.nextLine();
                "I am a SQA Engineer";
        System.out.println(input);
//                "Md. Nafiz Kamal Mishel"; System.out.println(input);

        CharacterCounter.count(input);
    }

    private static void p09() {
        System.out.println("""

                09 - Write a program that evaluates a string entered by the user
                to determine whether it is binary or not.""");

        System.out.print("Input : ");
        String input =
//                scanner.next();
                "2001";
        System.out.println(input);
//                "1001"; System.out.println(input);

        BinaryChecker.check(input);
    }

    private static void p10() {
        System.out.println("""

                10 - Generate random password which length is 8.
                Should follow this password strategy:
                    Min 1 capital letter,
                    min 1 small letter,
                    min 1 digit and
                    min 1 special character.""");


        System.out.println("Output : " + GenerateRandomPassword.randomPassword());
    }

    private static void p11() {
        System.out.println("""

                11 - Remove Vowels from a String""");

        System.out.print("Input : ");
        String input =
//                scanner.nextLine();
                "I am a SQA Engineer";
        System.out.println(input);
//                "Md. Nafiz Kamal Mishel"; System.out.println(input);
//                "hi, nafiz. how are you?"; System.out.println(input);

        VowelRemover.remove(input);
    }

    private static void p12() {
        System.out.println("""
                
                12 -
                    A core i 7 laptop price is 85000 tk and
                    a gaming mouse price is 2500 tk.
                    If I buy the laptop and 1 piece mouse,
                    what will be my total cost after giving 15% discount?
                    [Extract the digits from the paragraph and calculate the price]""");

        String textToExtract =
                "A core i 7 laptop price is 85000 tk and " +
                        "a gaming mouse price is 2500 tk. " +
                        "If I buy the laptop and 1 piece mouse, " +
                        "what will be my total cost after giving 15% discount?";

        try {
            System.out.printf("Total Price after Discount: %.2f tk\n", TextExtractor.calculateTotalCost(textToExtract));
        } catch (Exception e) {
            throw new RuntimeException("Text Extraction Failed");
        }
    }

    private static void p13() {
        String givenHtml = """
                <!DOCTYPE html>
                <html lang="en">
                   <head>
                      <meta charset="UTF-8">
                      <meta name="viewport" content="width=device-width, initial-scale=1.0">
                      <title>Transactions</title>
                   </head>
                   <body>
                      <div>
                         <div class="button">
                            <p>Transaction Id: TXN1234</p>
                         </div>
                      </div>
                   </body>
                </html>
                """;
        System.out.print("""
                
                13 - Extract Transaction Id from the given html:""" + givenHtml);

        TextExtractor.extractTransactionId(givenHtml);
    }

    private static void p14() {
        System.out.println("""
                
                14 - Check if an IP address is valid or invalid.
                Conditions:
                    IP address must be in this pattern: [digit]:[digit]:[digit]:[digit].
                    First digit should not be 0 or not be single digit;""");

        int example = 0;
        String ipAddress;
        while (true) {
            System.out.println("Example " + ++example + " (Enter 'q' to quit)");
            System.out.print("Input : ");
            ipAddress =
                    scanner.next();
//                    "192.168.0.1"; System.out.println(ipAddress);
            if (IpAddressValidator.validate(ipAddress)) System.out.println("Output: Valid IP");
            else System.out.println("Output: Invalid IP");

//            ipAddress = "q";
            if (ipAddress.equals("q")) break;
        }
    }

    private static void p15() {
        System.out.println("""
                
                15 - In a question paper, there are total 15 questions.
                Some question mark is 10 and some question mark is 5.
                How much question needed if I totaling 100 mark for 5 marks and 10 marks ?""");

        QuestionDistributor.distribute(15, 100);
    }

    public static void main(String[] args) {
    System.out.println("Assignment on Java Programming");
        double[] studentsCGPA = new double[]{3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        p01(studentsCGPA);
        p02(studentsCGPA);
        p03(studentsCGPA);
        p04();
        p05();
        p06();
        p07();
        p08();
        p09();
        p10();
        p11();
        p12();
        p13();
        p14();
        p15();
    }
}
