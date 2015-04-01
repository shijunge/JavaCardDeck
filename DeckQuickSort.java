public class DeckQuickSort {
	
	public void quickSort(Card[] array) {
        recursiveQuickSort(array, 0, array.length - 1);
    }
	
	public void recursiveQuickSort(Card[] arr, int startIdx, int endIdx) {
        int idx = partition(arr, startIdx, endIdx);
        if (startIdx < idx - 1) {	
            recursiveQuickSort(arr, startIdx, idx - 1);
        }
        if (endIdx > idx) {
            recursiveQuickSort(arr, idx, endIdx);
        }
    }
	public  int partition(Card[] arr, int left, int right) {
        Card pivot = arr[left];
        while (left <= right) {
            while (arr[left].compareTo(pivot)==-1) {
                left++;
            }
            while (arr[right].compareTo(pivot)==1) {
                right--;
            }
            if (left <= right) {
                Card tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }
}

	
	

