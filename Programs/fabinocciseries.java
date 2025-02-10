package Programs;

public class fabinocciseries {
    public static void main(String [] args){
       int a=0;
       int b=1;
       int n=5;
       for(int i=0;i<=n;i++){
           int c=a+b;
           a=c;
           b=c;
           System.out.println(c);
        }
    }
}
