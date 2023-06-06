import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Implementation of Quicksort on the buffered pool.
 * 
 * @author Hiwot Alemu
 * @version 06/06/2023
 */
public class Bufferpool {

	private RandomAccessFile input_file;
	private int buffsize;
	private int number_buffers;
	private int cachehit = 0;
	private int diskread = 0;
	private int diskwrite = 0;
	private Buffer[] the_buffers;

	/**
	 * Constructor
	 * 
	 * @param filename  file
	 * @param size      size of buffer
	 * @param inbuffers num buffer
	 * @throws FileNotFoundException
	 */
	public Bufferpool(File filename, int size, int inbuffers) throws FileNotFoundException {
		input_file = new RandomAccessFile(filename, "rw");
		buffsize = size;

		the_buffers = new Buffer[number_buffers];
		for (int i = 0; i < number_buffers; i++) {
			the_buffers[i] = new Buffer(buffsize);
		}

	}

//	public Bufferpool(File file, int numBuffers) {
//		// TODO Auto-generated constructor stub
//	}

	/**
	 * constructor for quicksort intiatiing
	 * 
	 * @param file       file name
	 * @param numBuffers number of buffers
	 */
	public Bufferpool(File file, int numBuffers) {
		// TODO Auto-generated constructor stub
	}

	private class Buffer {
		private int BID;
		private boolean dirty_flag;
		private byte[] buffer_data;

		/**
		 * Buffer private class constructor
		 * 
		 * @param count count
		 */
		Buffer(int count) {
			BID = (Integer) null;
			dirty_flag = false;
			buffer_data = new byte[count];

		}
	}

	// ufferpool bp = new Bufferpool(args[0], bufferSize,
	// Integer.parseInt(args[1]));
	/**
	 * get the bute
	 * 
	 * @param data     data
	 * @param location postion
	 * @param numBytes number of bytes
	 */
	public void getBytes(byte[] data, int location, int numBytes) {

	}

	/**
	 * inserts data
	 * 
	 * @param space    space
	 * @param size     size of data
	 * @param location postion
	 */
	public void insert(byte[] space, int size, int location) {
	}

	/**
	 * getter for desk write
	 * 
	 * @return deskwrite
	 */
	public int DiskWrite() {
		return diskwrite;
	}

	/**
	 * getter for diskread
	 * 
	 * @return diskread
	 */
	public int diskRead() {
		return diskread;
	}

	/**
	 * Return pointer to the requested block
	 * 
	 * @param block block
	 * @return null for now
	 */
	public byte[] getblock(int block) {
		return null;
	}

	/**
	 * Set the dirty bit for the buffer holding "block"
	 * 
	 * @param block block
	 */
	public void dirtyblock(int block) {
	}

	/**
	 * Tell the size of a buffer
	 * 
	 * @return buff size
	 */
	public int blocksize() {
		return buffsize;
	}

	/**
	 * Read the associated block from disk (if necessary) and return a pointer to
	 * the data
	 * 
	 * @return null for now
	 */

	public byte[] readBlock() {
		return null;
	}

	/**
	 * Return a pointer to the buffer's data array (without reading from disk)
	 * 
	 * @return null for now
	 */
	public byte[] getDataPointer() {
		return null;
	}

	/**
	 * Flag buffer's contents as having changed, so that flushing the block will
	 * write it back to disk
	 */

	public void markDirty() {
	}

	/**
	 * Release the block's access to this buffer. Further accesses to this buffer
	 * are illegal
	 */
	public void releaseBuffer() {
	}

}
