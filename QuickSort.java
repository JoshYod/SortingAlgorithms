//QuickSort.java
import java.util.*;

public class QuickSort {
	public static void main(String[] args){
		//Case 1:
		System.out.println("Java");
		int [] array1= new int []{2,8,7,1,3,5,6,4};
		System.out.println("\nBefore quick sort:");
		for (int index = 0; index<array1.length; index++){
			System.out.print(array1[index]+" ");
		}//end for
		QuickSort s1 = new QuickSort();
		s1.quickSort(array1, 0, array1.length-1);
		System.out.println("\nAfter quick sort:");
		for (int index = 0; index<array1.length; index++){
			System.out.print(array1[index]+" ");
		}//end for
		//Case 2
		Random rand = new Random();
		int [] array2 = new int[1000000];
		for (int i=0; i<array2.length; i++){
			array2[i] = rand.nextInt(1000000);
		}//end for
		long startTime = System.nanoTime();
		s1.quickSort(array2, 0, array2.length-1);
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("\nCPU time for array2 sorting: " + endTime/100000000.000000 + "seconds");
	}//end main
	
	public void quickSort(int []array, int lowIndex, int highIndex){
	//recursive basic case
		if (lowIndex >= highIndex){
			return;
		}//end if
		int pivot = array[highIndex];
		int pivotIndex = partition(array,lowIndex,highIndex, pivot);
		 //sort left 
		quickSort(array,lowIndex,pivotIndex-1);
		quickSort(array,pivotIndex+1,highIndex);
	}//end quickSort
	
	//return Pivot Index
	int partition(int []array, int lowIndex, int highIndex, int pivot){
		int leftPointer=lowIndex; int rightPointer=highIndex;
		while (leftPointer < rightPointer){
			//moving left pointer to right
			while(array[leftPointer]<=pivot && leftPointer < rightPointer){
				leftPointer++;
			}//end while
			//moving right pointer to left
			while (array[rightPointer]>=pivot && leftPointer<rightPointer){
				rightPointer--;
			}//end while
			swap(array,leftPointer,rightPointer);
		}//end while
		swap(array,leftPointer,highIndex);
		return leftPointer;
	}//close partition
	
	void swap(int [] array, int index1, int index2){
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}//end swap
	
}//end QuickSort
