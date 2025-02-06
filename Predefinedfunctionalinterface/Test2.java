package Predefinedfunctionalinterface;

import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {
        Function<String,Integer> lengthofstring = str -> str.length();
        System.out.println(lengthofstring.apply("java"));
        System.out.println(lengthofstring.apply("python"));
    }
}





       