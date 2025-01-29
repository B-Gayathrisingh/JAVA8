package lambdaexpression;

import java.util.Arrays;
import java.util.Comparator;

interface sorting{
    public void sort(int a, int b);
}

public class sortingwithLE {
    public static void main(String args[]) {
        Integer[] arr = {1, 23, 12, 43, 87, 0};
        Arrays.sort(arr, (a, b) -> Integer.compare(a, b));
        System.out.println(Arrays.toString(arr));
        //ascending order-less than(a<b)
        Arrays.sort(arr, (a, b) -> a - b);
        System.out.println(Arrays.toString(arr));
        //descending order-greater than(a>b)
        Arrays.sort(arr, (a, b) -> b - a);
        System.out.println(Arrays.toString(arr));

    }
}
