import java.util.ArrayList;
import java.util.List;

/**
 * TODO Add In Class Summary
 * <p>
 * TODO Add In Class Description
 *
 * @author 11201174 <br />
 * Copyright 2020 Earthport Plc. All rights reserved.
 */
public class MoveNegativeArrayElementsAtLast
{
    public static void main(String[] args)
    {
        int arr[] = {3,-3,45,2,-19,-7,56,45};
        int n = arr.length;
        moveAllNegativeElementsAtLastInArray(arr, n);
        moveAllNegativeElementsAtLastInArrayUsingDS(arr,n);
    }

    private static void moveAllNegativeElementsAtLastInArrayUsingDS(int[] arr, int n)
    {
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();
        for (Integer num: arr){
            if(num>=0)
                positiveNumbers.add(num);
        }
        for (Integer num: arr){
            if(num<0)
                negativeNumbers.add(num);
        }

        finalList.addAll(positiveNumbers);
        finalList.addAll(negativeNumbers);

        System.out.println(finalList);
    }

    private static void moveAllNegativeElementsAtLastInArray(int[] arr, int n)
    {
        int temp[] = new int[n];
        int j=0;
        for(int i=0;i<n;i++){
             if(arr[i]>=0){
                 temp[j++]=arr[i];
             }
        }
        if(j==n || j==0)
            return;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[j++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+",");
        }
        System.out.println();
    }
}
