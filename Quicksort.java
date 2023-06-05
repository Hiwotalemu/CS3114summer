
public class Quicksort {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println(" Data file name, number of buffer, stat- file nme");
		}
		return;
	}

	int partition(Comparable[] A, int left, int right, Comparable pivot) {
		while (left <= right) { // Move bounds inward until they meet
			while (A[left].compareTo(pivot) < 0)
				left++;
			while ((right >= left) && (A[right].compareTo(pivot) >= 0))
				right--;
			if (right > left)
				swap(A, left, right); // Swap out-of-place values
		}
		return left; // Return first position in right partition
	}

	int findpivot(Comparable[] A, int i, int j) {
		return (i + j) / 2;
	}

	void quicksort(Comparable[] A, int i, int j) { // Quicksort
		int pivotindex = findpivot(A, i, j); // Pick a pivot
		swap(A, pivotindex, j); // Stick pivot at end
		// k will be the first position in the right subarray
		int k = partition(A, i, j - 1, A[j]);
		swap(A, k, j); // Put pivot in place
		if ((k - i) > 1)
			quicksort(A, i, k - 1); // Sort left partition
		if ((j - k) > 1)
			quicksort(A, k + 1, j); // Sort right partition
	}

	private void swap(Comparable[] a, int i, int j) {
		// TODO Auto-generated method stub
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;

	}

}
