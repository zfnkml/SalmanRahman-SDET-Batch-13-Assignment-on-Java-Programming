/*
 ** 2024, December 19, Thursday, 10:30 PM
 */
public class QuestionDistributor {
    public static void distribute(int numberOfQuestions, int totalMarks) {
        for (int numberOf5MarksQuestions = 0; numberOf5MarksQuestions <= numberOfQuestions; numberOf5MarksQuestions++) {
            int numberOf10MarksQuestions = numberOfQuestions - numberOf5MarksQuestions;
            if (((5 * numberOf5MarksQuestions) + (10 * numberOf10MarksQuestions)) == totalMarks) {
                System.out.println(" 5 marks question is " + numberOf5MarksQuestions);
                System.out.println("10 marks question is " + numberOf10MarksQuestions);
                break;
            }
        }
    }
}
