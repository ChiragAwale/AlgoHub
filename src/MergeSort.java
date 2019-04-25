public class MergeSort {

    public MergeSort() {
    }

    public int [] getSortedArray(int [] array){
        mergeSort(array, new int[array.length], 0, array.length - 1);
        return array;
    }

    //Break down Phase
    public static void mergeSort(int [] array, int [] temp, int leftStart, int rightEnd){
        if(leftStart>=rightEnd){
            return;
        }
        //Getting the middle point
        int middle = (leftStart+rightEnd)/2;

        //Breaks the array into two parts which further breaks it into two parts till the smallest one
        mergeSort(array, temp, leftStart, middle);
        mergeSort(array, temp, middle+1,rightEnd);

        //Merge after arranging in correct order
        merge(array, temp, leftStart, rightEnd);
    }
    //Merge Phase
    public static void merge(int [] array, int [] temp, int leftStart, int rightEnd){
        int middle = (leftStart+rightEnd)/2;
        int rightStart = middle + 1;
        int leftEnd  = middle;
        int size = rightEnd-leftStart+1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        //Puts the smaller of the two into the sorted array
        while(left <= leftEnd && right <= rightEnd){
            if(array[left] <= array[right]){
                temp [index] = array[left];
                left++;
            }else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        //Copies the remaining ones in the sorted array
        while(left <= leftEnd){
            temp[index] = array[left];
            left++;
            index++;

        }
        while(right <= rightEnd){
            temp[index] = array[right];
            right++;
            index++;
        }

        //Copies the sorted array to the  original array
        System.arraycopy(temp,leftStart,array,leftStart,size);

    }
}



