package Programs;

import java.util.*;

public class duplicatefromset {
    public static void main(String [] args){
        List<Integer> l1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,3,4,5));
        Set<Integer>s1= new HashSet<>(l1);
        l1.clear();
        l1.addAll(s1);
        System.out.println(l1);
    }
}
