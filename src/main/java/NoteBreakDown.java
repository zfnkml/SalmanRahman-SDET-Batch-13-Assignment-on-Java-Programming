import java.util.HashMap;

/*
 ** 2024, December 19, Thursday, 5:49 PM
 */
public class NoteBreakDown {
    private static final int[] notes = new int[]{1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

    public static void amount(Integer amount) {
        HashMap<Integer, Integer> noteCount = new HashMap<>();
        for (int note : notes) {
            while (amount >= note) {
                amount -= note;
                noteCount.put(note, noteCount.getOrDefault(note, 0) + 1);
            }
        }
        for (int note : notes)
            if (noteCount.containsKey(note))
                System.out.printf("%4d %d\n", note, noteCount.get(note));
    }

    private void temp() {

    }
}
