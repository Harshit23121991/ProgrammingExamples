package com.test;

//Program: Write a program to find sum of each digit in the given number using recursion.
public class MyNumberSumRecursion {

	int sum = 0;
    
    public int getNumberSum(int number){
         
        if(number == 0){
            return sum;
        } else {
            sum += (number%10);
            getNumberSum(number/10);
        }
        return sum;
    }
     
    public static void main(String a[]){
    	MyNumberSumRecursion mns = new MyNumberSumRecursion();
        System.out.println("Sum is: "+mns.getNumberSum(223));
    }

}
