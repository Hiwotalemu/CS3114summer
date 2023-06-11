import student.TestCase;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Testing class
 * 
 * @author Hiwot Alemu Pranav
 * @version 06/06/2023
 */
public class Bufferpooltest extends TestCase {

    /**
     * testing method
     * 
     * @throws IOException
     *             exception
     */
    public void testInit() throws IOException {
        try {
            File file = new File("stats.txt");
            // int buffersize = 1024;
            int numofbuffers = 10;

            Bufferpool buff = new Bufferpool(file, numofbuffers);
            assertNotNull(buff);
        }
        catch (FileNotFoundException e) {
            fail("File not found");
        }

    }
 }

// public void testReadBlock() {
// try {
// File file = new File("stats.txt");
// int buffersize = 1024;
// int numofbuffers = 10;
//
// Bufferpool buff = new Bufferpool(file, numofbuffers, buffersize);
// byte[] data = buff.readBlock(0);
//
// assertNotNull(buff);
// } catch (IOException e) {
// fail("fail");
// }
// }
//
// public void testWriteBlock() {
// try {
// File file = new File("stats.txt");
// int buffersize = 1024;
// int numofbuffers = 10;
//
// Bufferpool buff = new Bufferpool(file, numofbuffers, buffersize);
// buff.writeBlock(0);
//
// assertNotNull(buff);
// } catch (IOException e) {
// fail("fail");
// }
// }
//
// public void testGetBytes() {
// try {
// File file = new File("stats.txt");
// int buffersize = 1024;
// int numofbuffers = 10;
//
// Bufferpool buff = new Bufferpool(file, numofbuffers, buffersize);
// byte[] data = new byte[10];
// buff.getBytes(data, 0, 10);
//
// assertNotNull(buff);
// } catch (IOException e) {
// fail("fail");
// }
// }
//
// public void testGetLRU() {
// try {
// File file = new File("stats.txt");
// int buffersize = 1024;
// int numofbuffers = 10;
//
// Bufferpool buff = new Bufferpool(file, numofbuffers, buffersize);
// boolean test = buff.Lru(0);
//
// assertNotNull(test);
// } catch (IOException e) {
// fail("fail");
// }
// }
//
// public void testFile() {
// try {
// File file = new File("stats.txt");
// int buffersize = 1024;
// int numofbuffers = 10;
//
// Bufferpool buff = new Bufferpool(fName, numofbuffers, numofbuffers);
// long file2 = buff.file();
//
// assertNotNull(file2);
// } catch (IOException e) {
// fail("fail");
// }
// }
//
// public void testClose() {
//
// try {
// File file = new File("stats.txt");
// int buffersize = 1024;
// int numofbuffers = 10;
//
// Bufferpool buff = new Bufferpool(file, numofbuffers, buffersize);
// buff.close();
//
// assertNotNull(buff);
// } catch (IOException e) {
// fail("fail");
// }
// }

//}
