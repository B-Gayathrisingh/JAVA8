package Programs;

import java.util.HashMap;

public class occuranceinarray {
    public static void main(String [] args){
        int [] arr={1,1,2,3,4,5,6,7,8,4,5};
        HashMap<Integer,Integer>
                a=new HashMap<>();
        for(int num:arr){
            a.put(num,a.getOrDefault(num,0)+1);
        }
        for(int keys:a.keySet()){
            System.out.println(keys+"=" +a.get(keys));
        }
    }
}
