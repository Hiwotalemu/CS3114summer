
import java.io.IOException;

import student.TestCase;
import java.io.File;

/**
 * Testing class
 * 
 * @author Hiwot Alemu Pranav
 * @version 06/06/2023
 */
public class Quicksorttest extends TestCase {
    /**
     * testing method
     * 
     * @throws IOException
     *             error
     */
    public void testInit() throws IOException {
        String file = new String("sample_input10a.dat");

        int numBuffers = 10;
        QSort sort = new QSort(file, numBuffers);
        assertNotNull(sort);
    }


    /**
     * test class for quicksort
     * 
     * @throws IOException
     *             error
     */
    public void testQuicksort() throws IOException {
        File file = new File("sample_input10a.dat");
        int numBuffers = 10;

        QSort qSort = new QSort(file.getAbsolutePath(), numBuffers);
        qSort.quicksort();
    }


    /**
     * test class for get size
     * 
     * @throws IOException
     *             error
     */
    public void testGetSize() throws IOException {

        String fileName = "sample_input10a.dat";
        int numOfBuffers = 10;
        QSort qsort = new QSort(fileName, numOfBuffers);

        assertEquals(1024, qsort.getSize());
    }


    /**
     * test class for pivot
     * 
     * @throws IOException
     *             rror
     */
    public void testPivot() throws IOException {
        // Prepare test data
        String fileName = "sample_input10a.dat";
        int numOfBuffers = 10;
        QSort qsort = new QSort(fileName, numOfBuffers);
        int p = qsort.pivot(0, 10);
        assertEquals(5, p);

// int left = 0;
// int right = 5;
// int expectedPivotIndex = (left + right) / 2;

    }


    /**
     * test class for swap
     * 
     * @throws IOException
     *             error
     */
    public void testSwap() throws IOException {

        String fileName = "sample_input10a.dat";
        int numOfBuffers = 10;
        QSort qsort = new QSort(fileName, numOfBuffers);

        qsort.swap(0, 3);
        assertEquals(0, 0);
    }

}
// /**
// * testing partition
// */
// public void testPartition() {
// Quicksort sort = new Quicksort("data", 4);
// Comparable[] test = { 3, 4, 4, 6, 1, 4, 5, 7 };
// int pivot = sort.partition(test, 0, test.length - 1, 4);
// assertEquals(pivot, 2);
// }
//
// /**
// * testing method for pivot
// */
// public void testPivot() {
// QSort sort = new QSort("data", 4);
// Comparable[] test = { 1, 9, 4, 6 };
// int pivot = sort.findpivot(test, 0, test.length - 1);
// assertEquals(pivot, 1);
// }
//
// /**
// * testing method for swaping vallues
// */
// public void testSwap() {
// QSort sort = new QSort("data", 4);
// Comparable[] test = { 4, 9, 8 };
// sort.swap(test, 0, 2);
// assertEquals(8, test[0]);
// assertEquals(4, test[2]);
// }
//
// /**
// * testing method for the intial quick sort part
// */
// public void testQuickSort() {
// QSort sort = new QSort("data", 4);
// Comparable[] unsortedtest = { 5, 4, 4, 6, 1, 9, 2, 7 };
// sort.quicksort(unsortedtest, 0, unsortedtest.length - 1);
// Comparable[] sortedtest = { 1, 2, 4, 4, 5, 6, 7, 9 };
//
// assertEquals(sortedtest.length, unsortedtest.length);
// for (int i = 0; i < sortedtest.length; i++) {
// assertEquals(sortedtest[i], unsortedtest[i]);
// }
// }
//
// /**
// * testing method for get key
// */
// public void testGetKey() {
// QSort sort = new QSort("data", 4);
// byte[] key = { 1, 2 };
// short key3 = sort.getKey(key);
// assertEquals(258, key3);
// }
//
// }
