package programming;

import java.util.Arrays;

public class SampleJava {
    public static void main(String[] args) {
        int[] intArrya= {-12, 30,55,9, 2,1,5,8,0};
        for(int lastIndex=intArrya.length-1; lastIndex>0; lastIndex--){
            int largestIndex=0;
            for(int i=0; i<=lastIndex;i++)
            {
              if(intArrya[i]>intArrya[largestIndex])
              {
                  largestIndex=i;
              }
            }
            swapNumber(intArrya,largestIndex,lastIndex);
        }
         for(int j=0; j<intArrya.length; j++)
         {
             System.out.println("Sorted Array"+intArrya[j]);
         }
    }

    private static void swapNumber(int[] intArrya, int i, int i1) {
        if(i==i1)
        {
          return;
        }
        int temp=intArrya[i];
        intArrya[i]=intArrya[i1];
        intArrya[i1]=temp;
    }
}
