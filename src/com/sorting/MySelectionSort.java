package com.sorting;


/*The selection sort is a combination of searching and sorting. During each pass, 
 * the unsorted element with the smallest (or largest) value is moved to its proper position 
 * in the array. The number of times the sort passes through the array is one less than the number of items in 
 * the array. In the selection sort, the inner loop finds the next smallest (or largest) value and 
 * the outer loop places that value into its proper location.
 *Selection sort is not difficult to analyze compared
 *to other sorting algorithms since none of the loops depend on the data in the array. 
 *Selecting the lowest element requires scanning all n elements (this takesn − 1 comparisons) 
 *and then swapping it into the first position. Finding the next lowest element requires scanning the remaining n − 1 
 *elements and so on, for (n − 1) + (n − 2) + ... + 2 + 1 = n(n − 1) / 2 ∈ Θ(n2) comparisons. 
 *Each of these scans requires one swap for n − 1 elements.*/
public class MySelectionSort {

	public static void main(String[] args) {
		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42 };
		int[] arr2 = doSelectionSort(arr1);
		for (int i : arr2) {
			System.out.print(i);
			System.out.print(", ");
		}
	}

	public static int[] doSelectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}

}
