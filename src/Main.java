public class Main {

    public static void main(String[] args) {

        //Initializing the array to search
        int[] array = {3, 23, 45, 2, 11, 4, 5, 89, 0};


        MergeSort mergeSorter = new MergeSort();

        //Calling the mergeSort   (int [] arrayToBeSorted, int [] temp, int leftStart, int rightEnd)
        int [] sortedArray = mergeSorter.getSortedArray(array);

        // Prints out the array
        for (int a : array) {
            System.out.println(a);
        }
    }
}