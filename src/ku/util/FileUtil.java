package ku.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * This class is the main class to copy a file.
 * 
 * @author Triwith Mutitakul
 *
 */
public class FileUtil {

	/**
	 * The method that use for copy file 1 byte at a time.
	 * 
	 * @param in
	 *            is the file that user input.
	 * @param out
	 *            is the output file..
	 */
	public static void copy(InputStream in, OutputStream out) {
		try {
			while (true) {
				int check = in.read();
				if (check == -1) {
					break;
				}
				out.write(check);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * The method that use for copy file by using blocksize.
	 * 
	 * @param in
	 *            is the file that user input.
	 * @param out
	 *            is the output file
	 * @param blocksize
	 *            is the number that user want to copy at a time.
	 */
	public static void copy(InputStream in, OutputStream out, int blocksize) {
		byte[] buffer = new byte[blocksize];
		try {
			while (true) {
				int count = in.read(buffer);
				if (count == -1) {
					break;
				}
				out.write(buffer, 0, count);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * The method that use for copy file by using BufferedReader and
	 * PrintWriter.
	 * 
	 * @param in
	 *            is the file that user input.
	 * @param out
	 *            is the output file.
	 */
	public static void bcopy(InputStream in, OutputStream out) {
		BufferedReader breader = new BufferedReader(new InputStreamReader(in));
		PrintWriter pw = new PrintWriter(out);
		try {
			while (true) {
				String count = breader.readLine();
				if (count == null) {
					break;
				}
				pw.println(count);
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * The method that use for copy file by using BufferedReader BufferedWruter
	 * and arrays of char.
	 * 
	 * @param in
	 *            is the file that user input.
	 * @param out
	 *            is the output file.
	 * @param blocksize
	 *            is the size of an arrays.
	 */
	public static void copyChar(InputStream in, OutputStream out, int blocksize) {
		BufferedReader breader = new BufferedReader(new InputStreamReader(in));
		BufferedWriter pw = new BufferedWriter(new OutputStreamWriter(out));
		char[] charArr = new char[blocksize];
		try {
			while (breader.ready()) {
				int check = breader.read(charArr);
				pw.write(check);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

}
