package utils;

import utils.OutOfBoundsException;

public class ArrayUtils {
	/*
	 * Boost primitive type arrays into their Object arrays
	 * 
	 * TODO: Handle all primitive types
	 */
	public static Integer[] toObject(int[] arr){
		Integer[] objArr = new Integer[arr.length];
		for(int i=0;i<arr.length;++i){
			objArr[i] = new Integer(arr[i]);
		}
		
		return objArr;
	}
	
	public static Character[] toObject(char[] arr){
		Character[] objArr = new Character[arr.length];
		for(int i=0;i<arr.length;++i){
			objArr[i] = new Character(arr[i]);
		}
		
		return objArr;
	}
	
	public static Float[] toObject(float[] arr){
		Float[] objArr = new Float[arr.length];
		for(int i=0;i<arr.length;++i){
			objArr[i] = new Float(arr[i]);
		}
		
		return objArr;
	}
	
	public static Double[] toObject(double[] arr){
		Double[] objArr = new Double[arr.length];
		for(int i=0;i<arr.length;++i){
			objArr[i] = new Double(arr[i]);
		}
		
		return objArr;
	}
	
	
	/*
	 * Returns a String Representation for a given generic array.
	 * 
	 * TODO : Use indigenous StringBuilder. Handle all primitive types
	 */
	public static <T> String toString(T[] arr){
		StringBuilder sb = new StringBuilder(); 
		sb.append("[");
		
		for(T item : arr){
			sb.append(item.toString());
			sb.append(',');
		}
		
		if(sb.length() > 1){
			sb.setCharAt(sb.length() - 1, ']');
		}
		else{
			sb.append("]");
		}
		
		return sb.toString();
	}
	
	public static String toString(int[] arr){ return toString(toObject(arr)); }
	public static String toString(char[] arr){ return toString(toObject(arr)); }
	public static String toString(float[] arr){ return toString(toObject(arr)); }
	public static String toString(double[] arr){ return toString(toObject(arr)); }
	
	
	/*
	 * Check if a given indexing is within Bounds
	 */
	public static <T> void boundsCheck(T[] arr, int i) throws OutOfBoundsException {
		if(i < 0 || i >= arr.length){
			throw new OutOfBoundsException(
				"Indexing Out of Bounds at " + i + ", into array of length " + arr.length
			);
		}
	}
	
	
	/*
	 * Swap two elements in a generic array.
	 * Throws an out of bounds exception.
	 */
	public static <T> void swap(T[] arr, int i, int j) throws OutOfBoundsException{
		boundsCheck(arr, i);
		boundsCheck(arr, j);
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	public static void main(String[] args){
		System.out.println(toString(new int[] {1,2,3}));
	}
}
