package Programs;

import java.util.Arrays;

public class sortingbyusingfor  {
    public static void main(String [] args){
        int [] arr={3,1,2,4,5,44,67,32,12};
        for(int i=0;i<arr.length-1;i++){ //ascending order
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int k=arr[i];
                     arr[i]=arr[j];
                     arr[j]=k;
                }


            }
        }
        System.out.println("sorting array:"+ Arrays.toString(arr));
    }
}

