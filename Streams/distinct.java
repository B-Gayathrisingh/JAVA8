package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distinct {
    public static void main(String[] args){
        List<Integer> l1= Arrays.asList(1,4,5,6,1,4,6,2,43,10);
        List<Integer>l2=l1.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(l2);
    }
}

