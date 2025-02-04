package com.java.advance.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteATextFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		File file = new File(FilePaths.SAMPLE_FILE_PATH);
		String msg = "good bye!\n java ";

		if (file.exists()) {
			System.out.println("Exits ");

			try (FileOutputStream fos = new FileOutputStream(file);) {
				fos.write(msg.getBytes());
				

			}

		} else {
			System.out.println("Not Exits ");

		}

	}

}
