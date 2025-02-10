package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args){
        List<Integer>l1=Arrays.asList(1,4,5,6,2,43,10);
        List<Integer>l2=l1.stream()
                .filter(i->i<7)
                .collect(Collectors.toList());
        System.out.println(l2);
    }
}
