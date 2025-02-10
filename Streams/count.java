package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class count {
    public static void main(String[] args){
        List<Integer> l1= Arrays.asList(1,4,5,6,2,43,10);
        long count=l1.stream()
                .filter(i->i<7).count();

        System.out.println(l1);
    }
}

