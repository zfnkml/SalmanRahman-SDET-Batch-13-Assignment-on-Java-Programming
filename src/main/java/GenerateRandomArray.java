import java.util.Random;

/*
 ** 2024, December 19, Thursday, 5:01 PM
 */
public class GenerateRandomArray {
    private Integer length;
    private Integer[] array;
    private Integer arrayMax;
    private Integer arrayMin;
    private Integer arrayMin2nd;

    public GenerateRandomArray(Integer length, int rangeUpTo) {
        this.length = length;

        array = new Integer[this.length];
        arrayMin = Integer.MAX_VALUE;
        arrayMin2nd = Integer.MAX_VALUE;
        arrayMax = Integer.MIN_VALUE;

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(rangeUpTo);
            if (array[i] < arrayMin) {
                arrayMin2nd = arrayMin;
                arrayMin = array[i];
            } else if (array[i] < arrayMin2nd && array[i] > arrayMin) {
                arrayMin2nd = array[i];
            }
            if(array[i] > arrayMax)
                arrayMax = array[i];
        }
    }

    public Integer getLength() {
        return length;
    }

    public Integer[] getArray() {
        return array;
    }

    public Integer getArrayMin() {
        return arrayMin;
    }

    public Integer getArrayMax() {
        return arrayMax;
    }

    public Integer getArrayMin2nd() {
        return arrayMin2nd;
    }
}
