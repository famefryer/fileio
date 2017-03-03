package ku.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileUtil {

	public static void copy(InputStream in, OutputStream out) {
		try {
			while (true) {
				int check = in.read();
				if (check < 0) {
					break;
				}
				out.write(check);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void copy(InputStream in, OutputStream out, int blocksize) {
		byte[] buffer = new byte[blocksize];
		try {
			while (true) {
				int count = in.read(buffer);
				if (count < 0) {
					break;
				}
				out.write(count);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

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
			out.close();
			in.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public static void copyChar(InputStream in, OutputStream out, int blocksize) {
		BufferedReader breader = new BufferedReader(new InputStreamReader(in));
		BufferedWriter pw = new BufferedWriter(new OutputStreamWriter(out));
		char[] charArr = new char[blocksize];
		try {
			while (breader.ready()) {
				int check = breader.read(charArr);
				pw.write(check);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}
