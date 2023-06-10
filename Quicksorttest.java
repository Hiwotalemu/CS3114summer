
import student.TestCase;

/**
 * Testing class
 * 
 * @author Hiwot Alemu
 * @version 06/06/2023
 */
public class Quicksorttest extends TestCase {
	/**
	 * testing method
	 */
	public void testInit() {
		Quicksort sort = new Quicksort();
		assertNotNull(sort);
	}

	/**
	 * testing partition
	 */
	public void testPartition() {
		QSort sort = new QSort("data", 4);
		Comparable[] test = { 3, 4, 4, 6, 1, 4, 5, 7 };
		int pivot = sort.partition(test, 0, test.length - 1, 4);
		assertEquals(pivot, 2);
	}

	/**
	 * testing method for pivot
	 */
	public void testPivot() {
		QSort sort = new QSort("data", 4);
		Comparable[] test = { 1, 9, 4, 6 };
		int pivot = sort.findpivot(test, 0, test.length - 1);
		assertEquals(pivot, 1);
	}

	/**
	 * testing method for swaping vallues
	 */
	public void testSwap() {
		QSort sort = new QSort("data", 4);
		Comparable[] test = { 4, 9, 8 };
		sort.swap(test, 0, 2);
		assertEquals(8, test[0]);
		assertEquals(4, test[2]);
	}

	/**
	 * testing method for the intial quick sort part
	 */
	public void testQuickSort() {
		QSort sort = new QSort("data", 4);
		Comparable[] unsortedtest = { 5, 4, 4, 6, 1, 9, 2, 7 };
		sort.quicksort(unsortedtest, 0, unsortedtest.length - 1);
		Comparable[] sortedtest = { 1, 2, 4, 4, 5, 6, 7, 9 };

		assertEquals(sortedtest.length, unsortedtest.length);
		for (int i = 0; i < sortedtest.length; i++) {
			assertEquals(sortedtest[i], unsortedtest[i]);
		}
	}

	/**
	 * testing method for get key
	 */
	public void testGetKey() {
		QSort sort = new QSort("data", 4);
		byte[] key = { 1, 2 };
		short key3 = sort.getKey(key);
		assertEquals(258, key3);
	}

}
