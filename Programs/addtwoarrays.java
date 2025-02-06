package Programs;

import java.util.Arrays;

public class addtwoarrays {
    public static void main(String [] args){
        int[] array1 = {1,2,3,4,5};
        int[] array2={45,56,78};
        int[] b=new int[array1.length + array2.length];
        int index=0;
        for(int num: array1)b[index++]=num;
        for(int num: array2)b[index++]=num;
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}
