package lambdaexpression;

import java.util.Arrays;

interface a{
    public void a(int a , int b);
}

public class forloopwithLE {
    public static void main(String args[]){
        int arr[]={1,3,4,5,6,7,2,9};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
