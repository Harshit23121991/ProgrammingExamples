package com.sorting;

/*Description:
Insertion sort is a simple sorting algorithm that builds the final 
sorted array one item at a time. It is much less efficient on large 
lists than more advanced algorithms such as quicksort, heapsort
, or merge sort. Every repetition of insertion sort removes an element from the input data, 
inserting it into the correct position in the already-sorted list, until no 
input elements remain. The choice of which element to remove from the input is arbitrary, and can 
be made using almost any choice algorithm. You can see the code implementation below:*/

public class MyInsertionSort {
	
	 public static void main(String[] args) {
         
	        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
	        insertionSort(input);
	    }
	     
	    private static void printNumbers(int[] input) {
	         
	        for (int i = 0; i < input.length; i++) {
	            System.out.print(input[i] + ", ");
	        }
	        System.out.println("\n");
	    }
	 
	    public static void insertionSort(int array[]) {
	        int n = array.length;
	        for (int j = 1; j < n; j++) {
	            int key = array[j];
	            int i = j-1;
	            while ( (i > -1) && ( array [i] > key ) ) {
	                array [i+1] = array [i];
	                i--;
	            }
	            array[i+1] = key;
	            printNumbers(array);
	        }
	    }
}
