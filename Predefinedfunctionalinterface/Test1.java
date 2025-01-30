package Predefinedfunctionalinterface;

import java.util.function.Predicate;

public class Test1 {
    public static void main(String args[]){
        Predicate<Integer> P= I->I%2==0;
        System.out.println(P.test(5)) ;
        System.out.println(P.test(7));
    }
}
