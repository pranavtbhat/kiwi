package sorting;

import utils.ArrayUtils;
public class Sorting {
	
	/*
	 * Selection Sort. Basically a shitty sorting algorithm.
	 * Time Complexity  : O(N^2)
	 * Space Complexity : O(1)
	 */
	public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {
		int N = arr.length;
		
		try{
			for(int i=0;i<N;++i ){
				int maxPos = i;
				for(int j=i+1;j<N;++j){
					if(arr[maxPos].compareTo(arr[j]) == 1){
						maxPos = j;
					}
				}
				
				ArrayUtils.swap(arr, i, maxPos);
			}
		}
		catch(Exception e){
			System.out.println("Something went miserable wrong");
		}
		
	}
	
	public static void main(String[] args){
		Integer	[] arr = new Integer[] {9,7,8,5,6,4,3,1,2};
		selectionSort(arr);
		System.out.println(ArrayUtils.toString(arr));
	}
}
