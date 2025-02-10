package Programs;

import java.util.Arrays;

public class sortingdesorder {
    public static void main(String [] args){
        int [] arr={3,1,2,4,5,44,67,32,12};
        for(int i=0;i<arr.length-1;i++){ //descending order
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int k=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=k;
                }
            }
        }
        System.out.println("sorting array:"+ Arrays.toString(arr));
    }
}


