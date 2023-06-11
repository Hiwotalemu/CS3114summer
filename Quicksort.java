import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * 
 * @author hiwot Pranav
 * @version 06/06/2023
 */
public class Quicksort {

    /**
     * main args
     * 
     * @param args
     *            args name
     * @throws IOException
     *             error
     */
    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println(
                "Error: Please provide the "
                + "data file name, number of buffers, and "
                + "stat file as arguments.");
            return;
        }

        // get the arguments from the command line
        String dataFile = args[0];
        int numOfBuffers = Integer.parseInt(args[1]);
        String statFile = args[2];

        // start recording time to perform quick sort
        long startTime = System.currentTimeMillis();
        QSort qsort = new QSort(dataFile, numOfBuffers);
        qsort.readBlock();
        qsort.quicksort();
        qsort.flush();
        long endTime = System.currentTimeMillis(); // end timer

        // append stats data to a text file
        Bufferpool.Stats.stats(dataFile, "statistics.txt", startTime, endTime);
    }


    /**
     * generates the file
     * 
     * @throws IOException
     *             error
     */
    public void generateFile() throws IOException {
        // short val_;
        Random random = new Random();
        DataOutputStream file = new DataOutputStream(new BufferedOutputStream(
            new FileOutputStream("sample_input10a.dat")));
        // for (int i = 0; i < 10; i++) {

        int val = (short)(random.nextInt(2999) + 1);
        file.writeShort(val);
        int j = 0;
        // int j = i % 2;
        if (j % 2 == 1) {
            val = (short)8224;
        }
        else {
            val = (short)(random.nextInt(26) + 0) * 2041;
        }
        file.writeShort(val);

        file.flush();
        file.close();

    }
}
