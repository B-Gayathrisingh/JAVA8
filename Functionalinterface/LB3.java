package Functionalinterface;
@FunctionalInterface
interface Add{
    public void m1(int a, int b);
}

public class LB3 {
    public static void main(String[] args) {
        Add add = (a, b) -> {System.out.println(a + b);};
        add.m1(100, 200);

    }
}
