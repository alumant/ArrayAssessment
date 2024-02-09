import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombineArrays {

    public static void main(String[] args) {
        int[] arr1 = {42, 25, 31, 45, 100, 6};
        int[] arr2 = {10, 28, 18, 7};

        int[] combinedArray = combine(arr1, arr2);

        System.out.println(Arrays.toString(combinedArray));
    }
    public static int[] combine(int[] array1, int[] array2) {
        List<Integer> combinedList = new ArrayList<>();

        int maxLength = Math.max(array1.length, array2.length);

        for (int i = 0; i < maxLength; i++) {
            if (i < array1.length) {
                combinedList.add(array1[i]);
            }
            if (i < array2.length) {
                combinedList.add(array2[i]);
            }
        }

        int[] result = new int[combinedList.size()];
        for (int i = 0; i < combinedList.size(); i++) {
            result[i] = combinedList.get(i);
        }

        return result;
    }
}

