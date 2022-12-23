package api.objects.equals;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
    public static void main (String[] args) {

        Integer o1 = 1000;
        Integer o2 = 2000;

        System.out.println(Objects.equals(o1, o2)); // false
        System.out.println(Objects.equals(o1, null)); // false
        System.out.println(Objects.equals(null, null)); // true
        System.out.println(Objects.deepEquals(o1, o2) + "\n"); // false

        Integer[] arr1 = {1, 2};
        Integer[] arr2 = {1, 2};

        System.out.println(Objects.equals(arr1, arr2)); // false
        System.out.println(Objects.deepEquals(arr1, arr2)); // true
        System.out.println(Arrays.deepEquals(arr1, arr2)); // true
        System.out.println(Objects.deepEquals(null, arr2)); // false
        System.out.println(Objects.deepEquals(null, null)); // true


    }
}
