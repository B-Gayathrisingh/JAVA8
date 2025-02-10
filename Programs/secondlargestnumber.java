package Programs;

import java.util.Arrays;

public class secondlargestnumber {
    public static void main(String []args){
        int []arr={123,345,34,45,7,89,6};
        Arrays.sort(arr);
        System.out.println("secondlargestnumber:" +arr[arr.length-2]);
    }
}
