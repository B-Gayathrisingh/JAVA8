package lambdaexpression;
interface evenodd{
    public void m1(int i);
}

public class evenoroddwithlamba {
    public static void main(String args[]){
        evenodd even=(int i)->{System.out.println(i/2);};
        even.m1(2);
    }
}


