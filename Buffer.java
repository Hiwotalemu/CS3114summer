/**
 * Implementation of Quicksort on the buffered pool.
 * 
 * @author Hiwot Alemu
 * @version 06/06/2023
 */
public class Buffer {

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
