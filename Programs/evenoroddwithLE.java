package Programs;
interface  evenrodd{
        public void m1(int i);
}
public class evenoroddwithLE {
        public static void main(String [] args){
                evenrodd even=(int i)->{System.out.println(i%2==0);};
                even.m1(2);
        }

        }

