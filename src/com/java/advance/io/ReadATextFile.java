package com.java.advance.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadATextFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		File file = new File(FilePaths.SAMPLE_FILE_PATH);

		if (file.exists()) {
			System.out.println("Exits ");

			try (FileInputStream fis = new FileInputStream(file);) {
				int ch;
				while ((ch = fis.read()) != -1) {
					System.out.print((char)ch);

				}

			}

		} else {
			System.out.println("Not Exits ");

		}

	}

}
