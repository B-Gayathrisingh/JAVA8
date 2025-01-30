package lambdaexpression;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorwithoutLE implements Comparator<Integer> {
    public int  compare(Integer I1 ,Integer I2){
        if(I1<I2) {
            return -1;
        } else if (I1>I2) {
            return +1;
        }else{
            return 0;

        }
    }
}
class Test{
    public static void main(String args[]){
         List l1=new ArrayList();
         l1.add(19);
        l1.add(23);
        l1.add(22);
        l1.add(3);
        l1.add(45);
        l1.add(21);
        System.out.println(l1);

        Collections.sort(l1,new comparatorwithoutLE());
        System.out.println(l1);
    }
}
