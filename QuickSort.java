//QuickSort.java

public class QuickSort {
	public static void main(String[] args){
		//Case 1:
		int [] array1= new int []{2,8,7,1,3,5,6,4};
		System.out.pritln("\nBefore quick sort:");
		for (int index = 0; index<array1.length; index++){
			System.out.print(array1[index]+" ");
		}//end for
		QuickSort s1 = new QuickSort();
		s1.quickSort(array1, 0, array1.length-1);
	}//end main
	
	public void quickSort(int []array, int lowIndex, int highIndex){
		
	}//end quickSort

}//end QuickSort
