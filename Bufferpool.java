import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

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
	private Buffer[] bufferlist;
	private Bufferpool bp;
	private int recordsize;

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

	/**
	 * Read the associated block from disk (if necessary) and return a pointer to
	 * the data
	 * 
	 * @return null for now
	 */

	public byte[] readBlock(int block) {
		Buffer buffer = new Buffer(block);
		if (buffer != null) {
			cachehit++;

		}
		return null;
	}

	public void write(byte[] b) {

	}

	public void seek(long pos) {
	}

	public void close() throws IOException {

	}

	/**
		 * get the byte
		 * 
		 * @param data     data
		 * @param location postion
		 * @param numBytes number of bytes
		 */
		public void getBytes(byte[] data, int location, int numBytes) {
			int block_id = location / buffsize;
			int pos = location % buffsize;
			if ( != Lru(block_id))
			{
				diskread++;
			}
			else 
			{
				cachehit++;
			}
		}

	public boolean Lru(int blockID) throws IOException
		
		{
			int i = 0;
			for ( i = 0; i< buffsize; i++)
			{
				if (blockID == bufferlist[i].blockID)
				{
					break;
				}
				if (i == buffsize) {
				int	j = buffsize - 1;
					if(bufferlist[j].dirty_flag)
					{
				input_file.seek(bufferlist[j].blockID , buffsize);
				input_file.write(bufferlist[j]).buff, 0, buffsize);
	
	diskwrite++;
					}
					//swap the block j position into positon 0
					//update the rest of their order
					
					Buffer temp = the_buffers[j];
					for (int k = j; k > 0; k--)
					{
						bufferlist[k] = bufferlist[k-1];
						
					}
					bufferlist[0] = temp;
					if (blockID == bufferlist[0].blockID)
					{
						return true;
					}
					else 
					{
					return false;
					}
						
				}
			
			}}

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
}

//	
//
//	/**
//	 * inserts data
//	 * 
//	 * @param space    space
//	 * @param size     size of data
//	 * @param location postion
//	 */
//	public void insert(byte[] space, int size, int location) {
//	}
//
//	/**
//	 * getter for desk write
//	 * 
//	 * @return deskwrite
//	 */
//	public int DiskWrite() {
//		return diskwrite;
//	}
//
//	/**
//	 * getter for diskread
//	 * 
//	 * @return diskread
//	 */
//	public int diskRead() {
//		return diskread;
//	}
//	
//	public int partition(int l, int h, Comparable pivot)
//	{
//		byte[] low = new byte[4];
//		byte[] high = new byte[4];
//		while (low <= high)
//		{
//			while (true)
//			{
//				
//			bp.getBytes(low , l * recordsize , recordsize);
//			if ( getKey(low)< pivot)
//				l
//			}
//		}
//	}
//	
//	public short getKey(byte[] record) {
//		ByteBuffer buffer = ByteBuffer.wrap(record);
//		return buffer.getShort();
//	}

//	/**
//	 * Return pointer to the requested block
//	 * 
//	 * @param block block
//	 * @return null for now
//	 */
//	public byte[] getblock(int block) {
//		return null;
//	}
//
//	/**
//	 * Set the dirty bit for the buffer holding "block"
//	 * 
//	 * @param block block
//	 */
//	public void dirtyblock(int block) {
//	}
//
//	/**
//	 * Tell the size of a buffer
//	 * 
//	 * @return buff size
//	 */
//	public int blocksize() {
//		return buffsize;
//	}

//
//				/**
//				 * Return a pointer to the buffer's data array (without reading from disk)
//				 * 
//				 * @return null for now
//				 */
//				public byte[] getDataPointer() {
//					return null;
//				}
//
//				/**
//				 * Flag buffer's contents as having changed, so that flushing the block will
//				 * write it back to disk
//				 */
//
//				public void markDirty() {
//				}
//
//				/**
//				 * Release the block's access to this buffer. Further accesses to this buffer
//				 * are illegal
//				 */
//				public void releaseBuffer() {
//				}
