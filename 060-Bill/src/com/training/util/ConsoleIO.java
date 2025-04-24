package com.training.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ConsoleIO {
	public static BufferedReader createBufferedReader() {
		Reader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		return br;
	}

	public static String inputString() throws IOException {
		BufferedReader br = createBufferedReader();
		String str = br.readLine();
		return str;
	}

	public static Byte inputByte() throws IOException {
		BufferedReader br = createBufferedReader();
		String str = br.readLine();
		return Byte.parseByte(str);
	}

	public static Short inputShort() throws IOException {
		BufferedReader br = createBufferedReader();
		String str = br.readLine();
		return Short.parseShort(str);
	}

	public static int inputInt() throws IOException {

		BufferedReader br = createBufferedReader();
		String str = br.readLine();
		return Integer.parseInt(str);
	}

	public static long inputLong() throws IOException {
		BufferedReader br = createBufferedReader();
		String str = br.readLine();
		return Long.parseLong(str);
	}

	public static char inputChar() throws IOException {
		BufferedReader br = createBufferedReader();
		String str = br.readLine();
		return str.charAt(0);
	}

	public static float inputFloat() throws IOException {
		BufferedReader br = createBufferedReader();
		String str = br.readLine();
		return Float.parseFloat(str);
	}

	public static double inputDouble() throws IOException {
		BufferedReader br = createBufferedReader();
		String str = br.readLine();
		return Double.parseDouble(str);
	}
}
