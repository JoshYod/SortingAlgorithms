public class MergeSort {
    public static void main(String[] args){
        //case1
        int [] array1 = {7,6,4,5,2,3};
        System.out.print("\nBefore Merge Sorting: ");
        for (int number : array1){
                System.out.print(number + ", ");
        }//end for
        int lowIndex = 0,highIndex=array1.length-1;
        array1 = mergeSort(array1, lowIndex, highIndex);
        System.out.print("\nAfter Merge Sorting: ");
        for(int number : array1){
            System.out.print(number + ", ");
        }//end for


        System.out.println();
    }//end main

    private static int[] mergeSort(int [] array, int lowIndex, int highIndex){
            if(lowIndex == highIndex){
                return new int []{array[lowIndex]};
            }//end if // Basic Case
        int midIndex = (highIndex+lowIndex)/2;
        int [] leftHalf = mergeSort(array,lowIndex,midIndex);
        int [] rightHalf = mergeSort(array,midIndex+1,highIndex);
        return merge(leftHalf, rightHalf);

    }//end mergeSort

    private static int[] merge(int [] leftArray , int [] rightArray){
        int [] result = new int [leftArray.length+rightArray.length];
        int left = 0; int right = 0; int index = 0;
        while (left<leftArray.length && right < rightArray.length){
            if(leftArray[left] < rightArray[right]){
                result[index] = leftArray[left];
                index++; left++;
            }//end if
            else{
                result[index] = rightArray[right];
                index++; right++;
            }//end else
        }//end while
        while(left<leftArray.length){
            result[index] = leftArray[left];
            left++; index++;
        }//end while
        while(right < rightArray.length){
            result[index] = rightArray[right];
            right++; index++;
        }//end while
        return result;
    }//end merge

}//end class