package com.madhav.javainterviewprograms;
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
        int n = inputArr.length;
        int counter=0;
        for(int i=0;i<n;i++){
            if(inputArr[i]!=0){
                inputArr[counter++]=inputArr[i];
            }
        }
        while(counter < n){
            inputArr[counter++]=0;
        }

        for(int i=0;i<n;i++){
            System.out.print(inputArr[i]+",");
        }
    }
}
