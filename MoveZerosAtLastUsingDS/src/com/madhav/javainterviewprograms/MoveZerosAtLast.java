package com.madhav.javainterviewprograms;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to move all zeros at the end of the array without using existing data structure
 * @author 11201174 <br />
 * Copyright 2020 Earthport Plc. All rights reserved.
 */
public class MoveZerosAtLast
{
    public static void main(String[] args)
    {
        int inputArr[] = {10,2,87,0,0,30,19,0,16,17,80,13,20,0,6};
        int len = inputArr.length;
        List<Integer> aList = new ArrayList<>();
        int counter=0;
        for (Integer num: inputArr)
        {
            if(num!=0)
            {
                aList.add(num);
            }else{
                counter++;
            }
        }

        for(int i=1;i<=counter;i++){
            aList.add(0);
        }

        System.out.println(aList);
    }
}
