package Programs;
interface swap{
    public void m1(int a,int b);
    }

    interface ss{
            public void m2(String x,String y);

}

public class swappingwithLE {
    public static void main(String [] args){
        swap s=(a,b)->{
            System.out.println("Before swapping" +a+","+b);
            int c=a;
            a=b;
            b=c;
            System.out.println("After swapping" +a+","+b);
        };
        s.m1(10,20);
        ss a=(x,y)->{
            System.out.println("Before swapping" +x+"," +y);
            String z="hii";
            x=y;
            y=z;
            System.out.println("After swapping" +x+"," +y);
        };
        a.m2("hello","good");
    }
}


